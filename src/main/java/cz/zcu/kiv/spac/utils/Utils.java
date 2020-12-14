package cz.zcu.kiv.spac.utils;

import cz.zcu.kiv.spac.data.Constants;
import org.apache.commons.io.FilenameUtils;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Class with utils methods.
 */
public class Utils {

    /**
     * Get root dir of application.
     * @return Root dir in string.
     */
    public static String getRootDir() {

        return Paths.get(".").normalize().toAbsolutePath().toString();
    }

    /**
     * Get file name from path in string format.
     * @param path - Path in string.
     * @return File name.
     */
    public static String getFilenameFromStringPath(String path) {

        Path p = Paths.get(path);
        return p.getFileName().toString();
    }

    /**
     * Format antipattern filename into antipattern name for comparing.
     * @param filename - Antipattern name as filename.
     * @return Formatted antipattern name.
     */
    public static String formatAntipatternName(String filename) {

        String antipatternName = FilenameUtils.removeExtension(filename);
        antipatternName = antipatternName.replace("_", " ");
        antipatternName = antipatternName.replace("'", "").replace("’", "");

        return antipatternName;
    }

    /**
     * Compare two antipatterns by their names.
     * @param antipatternName1 - First antipattern name.
     * @param antipatternName2 - Second antipattern name.
     * @return True if both names are same, false if not.
     */
    public static boolean isAntipatternNamesEquals(String antipatternName1, String antipatternName2) {

        antipatternName1 = antipatternName1.replace("'", "").replace("’", "").replace("_", " ");;
        antipatternName2 = antipatternName2.replace("'", "").replace("’", "").replace("_", " ");;

        return antipatternName1.equalsIgnoreCase(antipatternName2);
    }

    public static String replaceLineBreakersForHTMLNewLine(String content) {

        return content.replaceAll(Constants.LINE_BREAKER, "<br>");
    }

    public static String getCurrentDateInString() {

        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
    }
}
