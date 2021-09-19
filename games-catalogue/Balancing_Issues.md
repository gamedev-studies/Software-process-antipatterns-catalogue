[Home](../README.md) > [Catalogue](/games-catalogue/Antipatterns_catalogue_games.md) > Balancing issues

# Balancing issues

## Summary
Game designers often struggle to build levels and puzzles that present the right amount of challenge for the target audience. Creating game balance demands continuous testing and causes rework that often propagates to art, design and coding teams.

## Context
Balancing a game consists in changing parameters, scenarios and behaviors in order to avoid the extremes of getting the player frustrated because the game is too hard or becoming bored because the game is too easy. [Andrade et al., 2006](https://www.aaai.org/Papers/AIIDE/2006/AIIDE06-005.pdf)

Difficulty is often a point of discussion on game projects. The PM from [A Boy and His Blob (2010)](https://github.com/polako/pms-prob-after-years/blob/master/data/postmortems/pdfs/gamasutra/2010/pm-58-a_boy_and_his_blob.pdf) reports that balancing boss battles was "a source of strife throughout development". The developers from [Amnesia: A Machine for Pigs (2014)](https://github.com/polako/pms-prob-after-years/blob/master/data/postmortems/pdfs/gamasutra/2014/pm-1-amnesia_a_machine_for_pigs.pdf) report that the difficulty of puzzles caused disagreements between studio (The Chinese Room) and publisher (Frictional Games). In the end, the studio has conceded to the publisher's vision and made gameplay changes that "impacted a number of scenarios in the game".

In [Heavy Gear II (1999)](https://github.com/polako/pms-prob-after-years/blob/master/data/postmortems/pdfs/gamasutra/1999/pm-203-heavy_gear_2.pdf), developers and testers noticed early in the project that the game had "a distinct absence of thrilling game play". In [Deadliest Warrior (2010)](https://github.com/polako/pms-prob-after-years/blob/master/data/postmortems/pdfs/gamasutra/2010/pm-49-deadliest_warrior.pdf), despite "100,000 battle simulations" and a "fulltime team of dedicated testers", a balancing problem was discovered only after the game's release: the Ninja character was overpowered.

The PMs offer us insight on balancing games from 4 genres: fighting (Deadliest Warrior), platform (A Boy and His Blob), shooter (Heavy Gear II) and action/horror (Amnesia: A Machine for Pigs). However, this kind of issue is also popular on games such as online multiplayer RPGs and MOBAs. League of Legends, for example, "releases compulsory patches, usually biweekly" [Mora-Cantallops, 2018](https://www.researchgate.net/publication/326262788_Exploring_player_experience_in_ranked_League_of_Legends). Especially in the context of competitive gaming, it is "important to have a balanced game so that the most skilled player is the winner". [Palm and Norén, 2010](https://www.diva-portal.org/smash/get/diva2:818292/FULLTEXT01.pdf)

## Symptoms and Consequences
- Players are reporting the challenges in the game seem to be frustrating/boring under certain conditions (e.g: a certain character stands no chance against others). This may be especially worrying when those who are reporting are professional/ranked players who really know the game in-depth [Mukherjee, 2021](https://www.sportskeeda.com/esports/the-icefrog-mystery-how-dota-2-s-master-balance-kept-game-engaging-decade)
- In games with multiple characters (e.g Fighting, MOBAs), a given character is picked much more frequently than others and also wins much more frequently (bad win/pick ratio) [Palm and Norén, 2010](https://www.diva-portal.org/smash/get/diva2:818292/FULLTEXT01.pdf)

## Refactored Solutions
- "If Icefrog’s method of balancing DOTA 2 or DotA Allstars could be summarized in one line, it would be: balance the game around the pro scene, the rest of the player base would follow." [Mukherjee, 2021](https://www.sportskeeda.com/esports/the-icefrog-mystery-how-dota-2-s-master-balance-kept-game-engaging-decade)
- "Balancing decisions had to be made through direct observations and direct player feedback." [DotA (2004)](https://www.gamedeveloper.com/design/postmortem-i-defense-of-the-ancients-i-)
- "In this sense, the main goal is controlling the challenge levels aiming to maintain the player inside the flow, avoiding to reach boredom (no challenges at all) or frustration (challenges are too hard). (...) the ratio of challenges to skills should be around 50/50 in order to produce enjoyable experiences." [Silva et al, 2017](https://arxiv.org/pdf/1706.02796.pdf)
- "Metagame Bounds is a balancing theory proposed by Alexander Jaffe at Game Developers Conference, 2015. (...) Metagame Bounds lets you calculate the optimal play rates of characters in a community of a game based on character win rates in matchups, one versus one. (...) In addition to the Metagame Bounds we will then look at these characters’ win rates and pick rates and see if there are any extremes in the graphs of these statistics and to compare it with the Metagame Bounds results to test the theory." [Palm and Norén, 2010](https://www.diva-portal.org/smash/get/diva2:818292/FULLTEXT01.pdf)
- "During Life of a Patch [series of dev blog posts], we introduced you to the Champion Balance Framework which monitors League's roster of 148 champions along consistent, measurable definitions of over- and underperformance for four different player groups: Average, Skilled, Elite, and Professional. If a champion is overperforming in ANY of the four groups, they're in need of nerfs, and if they're underperforming in ALL of the four groups, they're ready for buffs." [SUMMONERS RIFT TEAM, 2020](https://www.leagueoflegends.com/en-us/news/dev/dev-balance-framework-update/)
- "To introduce new features in the game while keeping the balance, Riot Games releases compulsory patches, usually biweekly. Besides new features, these patches are used to multiple ends, but in most cases they target Champions or items that became too dominant (thus being played by most of the players) or that are too weak in comparison (thus, nobody is playing them) (...) Therefore, players in League of Legends have a feeling of competence that is proportional to their in-game assigned level. Is this feeling of fairness what engages players? According to Smeddinck et al. (2016), getting the level of challenge to match the capabilities and needs of a player is a core element of good PE. In the case of competitive FPS, differences in skill levels affect enjoyment: weaker players become frustrated and stronger players become less engaged (Vicencio-Moreira, Mandryk, and Gutwin 2015), so balance is key. According to the obtained results, the League of Legends ranking system seems to balance perceived skill levels fairly accurately." [Mora-Cantallops, 2018](https://www.researchgate.net/publication/326262788_Exploring_player_experience_in_ranked_League_of_Legends)

### Suggested/adopted PM solutions
- "We were able to create a Title Update [patch] that addressed all the balance issues. If we were not listening to the community, it would not have been possible to get this done as quickly as we did" [Deadliest Warrior (2010)](https://github.com/polako/pms-prob-after-years/blob/master/data/postmortems/pdfs/gamasutra/2010/pm-49-deadliest_warrior.pdf)
- "Only after some ad hoc brainstorming sessions and grueling mission-by-mission playability tests did the pieces come together." [Heavy Gear II (1999)](https://github.com/polako/pms-prob-after-years/blob/master/data/postmortems/pdfs/gamasutra/1999/pm-203-heavy_gear_2.pdf)
- "We realized too late that the methodical gameplay of Blob really doesn't support actiony bosses of this nature. (...) In future games like Blob, boss battles would be better as methodical puzzles that play to the strengths of the gameplay." [A Boy and His Blob (2010)](https://github.com/polako/pms-prob-after-years/blob/master/data/postmortems/pdfs/gamasutra/2010/pm-58-a_boy_and_his_blob.pdf)
- "The issues with the game's difficulty were compounded by the game's design too clearly telegraphing transitions between 'enemy' areas and 'non-enemy' areas. Analyzing the game in light of the player responses online, this is clearly one aspect of the game in which TCR failed." [Amnesia: A Machine for Pigs (2014)](https://github.com/polako/pms-prob-after-years/blob/master/data/postmortems/pdfs/gamasutra/2014/pm-1-amnesia_a_machine_for_pigs.pdf)

## PM Sources
- [A Boy and His Blob (2010)](https://github.com/polako/pms-prob-after-years/blob/master/data/postmortems/pdfs/gamasutra/2010/pm-58-a_boy_and_his_blob.pdf)
- [Amnesia: A Machine for Pigs (2014)](https://github.com/polako/pms-prob-after-years/blob/master/data/postmortems/pdfs/gamasutra/2014/pm-1-amnesia_a_machine_for_pigs.pdf)
- [Deadliest Warrior (2010)](https://github.com/polako/pms-prob-after-years/blob/master/data/postmortems/pdfs/gamasutra/2010/pm-49-deadliest_warrior.pdf)
- [Heavy Gear II (1999)](https://github.com/polako/pms-prob-after-years/blob/master/data/postmortems/pdfs/gamasutra/1999/pm-203-heavy_gear_2.pdf)
- [DotA (2004), not in the 200 PM sample](https://www.gamedeveloper.com/design/postmortem-i-defense-of-the-ancients-i-)

## Other Sources
- [Andrade et al, 2006](https://www.aaai.org/Papers/AIIDE/2006/AIIDE06-005.pdf)
- [Palm and Norén, 2010](https://www.diva-portal.org/smash/get/diva2:818292/FULLTEXT01.pdf)
- [Mora-Cantallops, 2018](https://www.researchgate.net/publication/326262788_Exploring_player_experience_in_ranked_League_of_Legends)
- [Mukherjee, 2021](https://www.sportskeeda.com/esports/the-icefrog-mystery-how-dota-2-s-master-balance-kept-game-engaging-decade)
- [Silva et al, 2017](https://arxiv.org/pdf/1706.02796.pdf)
- [SUMMONERS RIFT TEAM, 2020](https://www.leagueoflegends.com/en-us/news/dev/dev-balance-framework-update/)

## Old content/Comments
Symptoms: People in the project frequently discuss the need of making levels and challenges harder/easier, Testers or players frequently report that they are not satisfied with the game's challenges

Solutions: Get the team aligned on the same vision for the game's levels and challenges early in the project, Continuously test the game's challenges and adapt the design according to the feedback from the target players