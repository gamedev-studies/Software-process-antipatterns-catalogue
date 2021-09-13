[Home](../README.md) > [Catalogue](/games-catalogue/Antipatterns_catalogue_games.md) > Balancing issues

# Balancing issues

## Summary
Game designers often struggle to build levels and puzzles that present the right amount of challenge for the target audience. Creating game balance demands continuous testing and causes rework that often propagates to art, design and coding teams.

## Context
Balancing a game consists in changing parameters, scenarios and behaviors in order to avoid the extremes of getting the player frustrated because the game is too hard or becoming bored because the game is too easy. [Andrade et al., 2006](https://www.aaai.org/Papers/AIIDE/2006/AIIDE06-005.pdf)

Difficulty is often a point of discussion on game projects. The PM from [A Boy and His Blob (2010)](https://github.com/polako/pms-prob-after-years/blob/master/data/postmortems/pdfs/gamasutra/2010/pm-58-a_boy_and_his_blob.pdf) reports that balancing boss battles was "a source of strife throughout development". The developers from [Amnesia: A Machine for Pigs (2014)](https://github.com/polako/pms-prob-after-years/blob/master/data/postmortems/pdfs/gamasutra/2014/pm-1-amnesia_a_machine_for_pigs.pdf) report that the difficulty of puzzles caused disagreements between studio (The Chinese Room) and publisher (Frictional Games). In the end, the studio has conceded to the publisher's vision and made gameplay changes that "impacted a number of scenarios in the game".

In [Heavy Gear II (1999)](https://github.com/polako/pms-prob-after-years/blob/master/data/postmortems/pdfs/gamasutra/1999/pm-203-heavy_gear_2.pdf), developers and testers noticed early in the project that the game had "a distinct absence of thrilling game play". In [Deadliest Warrior (2010)](https://github.com/polako/pms-prob-after-years/blob/master/data/postmortems/pdfs/gamasutra/2010/pm-49-deadliest_warrior.pdf), despite "100,000 battle simulations" and a "fulltime team of dedicated testers", a balancing problem was discovered only after the game's release: the Ninja character was overpowered.

The PMs offer us insight on balancing games from 4 genres: fighting (Deadliest Warrior), platform (A Boy and His Blob), shooter (Heavy Gear II) and action/horror (Amnesia: A Machine for Pigs). However, this kind of issue is also popular on games such as online multiplayer RPGs and MOBAs. Especially in the context of competitive gaming, it is "important to have a balanced game so that the most skilled player is the winner". [Palm and Norén, 2010](https://www.diva-portal.org/smash/get/diva2:818292/FULLTEXT01.pdf)

## Symptoms and Consequences
- (The evidence comes first from the PM. The Symptoms and Consequences comes from other sources.)

## Refactored Solutions
- (Base the recommendations in other sources)

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

## Other Sources
- [Andrade et al, 2006](https://www.aaai.org/Papers/AIIDE/2006/AIIDE06-005.pdf)
- [Palm and Norén, 2010](https://www.diva-portal.org/smash/get/diva2:818292/FULLTEXT01.pdf)

## Old content/Comments
Symptoms: People in the project frequently discuss the need of making levels and challenges harder/easier, Testers or players frequently report that they are not satisfied with the game's challenges

Solutions: Get the team aligned on the same vision for the game's levels and challenges early in the project, Continuously test the game's challenges and adapt the design according to the feedback from the target players