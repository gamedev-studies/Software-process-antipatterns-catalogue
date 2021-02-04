package cz.zcu.kiv.spac.data.git;

import cz.zcu.kiv.spac.controllers.GitWindowController;
import cz.zcu.kiv.spac.utils.Utils;
import org.apache.log4j.Logger;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.dircache.DirCacheIterator;
import org.eclipse.jgit.lib.BranchTrackingStatus;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevWalk;
import org.eclipse.jgit.treewalk.FileTreeIterator;
import org.eclipse.jgit.treewalk.TreeWalk;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CLass representing git attributes for git connection.
 */
public class CustomGitObject {

    private Git git;

    // Git attributes.
    private String branchName;
    private String repositoryUrl;
    private String repositoryName;
    private String username;
    private String password;

    // Logger.
    private static Logger log = Logger.getLogger(GitWindowController.class);

    /**
     * Constructor.
     * @param branchName - Name of git branch.
     * @param repositoryUrl - Git Repository url.
     * @param username  - Username for git.
     * @param password - Password for git.
     */
    public CustomGitObject(String branchName, String repositoryUrl, String username, String password) {

        this.branchName = branchName;
        this.repositoryUrl = repositoryUrl;
        this.username = username;
        this.password = password;

        // Get repository name.
        String[] splittedUrl = repositoryUrl.split("/");

        // First 3 strings are just parsed github url.
        // Name of organization not included.
        if (splittedUrl.length > 3) {

            repositoryName = splittedUrl[splittedUrl.length - 1];
        }

        createGitObject();
    }

    /**
     * Create git object.
     * @return True if git object was created successfully, false if not.
     */
    private void createGitObject() {

        try {

            // TODO: maybe check url repository from customGitObject and compare it with repository set in .git folder.
            git = Git.open(new File(Utils.getRootDir() + "/.git"));
            //git.checkout().setName(branchName).call();

        } catch (Exception e) {

            log.error(e.getMessage());
            git = null;
        }
    }

    /**
     * Load files from previous commit.
     * @return Map of files with its content from latest commit.
     */
    public Map<String, String> loadFilesFromPreviousCommit() {

        Map<String, String> filesFromPreviousCommit = new HashMap<>();

        Repository repository = git.getRepository();
        RevWalk rw = new RevWalk(repository);

        try (TreeWalk tw = new TreeWalk(repository)) {

            RevCommit latestCommit = git.log().setMaxCount(1).call().iterator().next();
            String latestCommitHash = latestCommit.getName();

            RevCommit commitToCheck = rw.parseCommit(repository.resolve(latestCommitHash));
            tw.addTree(commitToCheck.getTree());
            tw.addTree(new DirCacheIterator(repository.readDirCache()));
            tw.addTree(new FileTreeIterator(repository));
            tw.setRecursive(true);

            while (tw.next()) {

                String filename = tw.getPathString();

                // Get object ID of file from latest commit.
                ObjectId objectId;

                if (tw.getFileMode(0).getBits() != 0) {

                    // Get object ID of existing file.
                    objectId = tw.getObjectId(0);

                } else {

                    objectId = tw.getObjectId(1);
                }

                try {

                    // Get content of file from latest commit.
                    byte[] bytes = repository.open(objectId).getBytes();
                    String content = new String(bytes);

                    filesFromPreviousCommit.put(Utils.getFilenameFromStringPath(filename), content);

                } catch (Exception e) {

                    log.info("File '" + filename + "' is not in previous commit.");
                }
            }

        } catch (Exception e) {

            log.info("No commits found in current branch.");
        }

        return filesFromPreviousCommit;
    }

    /**
     * Get number of commits ahead / behind of selected branch.
     * @return List of number counts for commits ahead / behind.
     */
    public List<Integer> getBranchTrackingCount() {

        try {

            BranchTrackingStatus trackingStatus = BranchTrackingStatus.of(git.getRepository(), branchName);
            List<Integer> counts = new ArrayList<>();

            if (trackingStatus != null) {

                counts.add(trackingStatus.getAheadCount());
                counts.add(trackingStatus.getBehindCount());
            } else {

                System.out.println("Returned null, likely no remote tracking of branch " + branchName);
                counts.add(0);
                counts.add(0);
            }
            return counts;

        } catch (Exception e) {

            log.warn("Error while getting count in branch tracking.");
            return null;
        }
    }

    public String getBranchName() {

        return branchName;
    }

    public String getRepositoryUrl() {

        return repositoryUrl;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getRepositoryName() {

        return repositoryName;
    }

    public Git getGit() {

        return git;
    }
}
