[Home](../README.md) > [Catalogue](/games-catalogue/Antipatterns_catalogue_games.md) > Unreliable Middleware

# Unreliable Middleware

## Summary
A project faces technical problems because it is heaviliy dependent on third-party middleware or hardware, and at some point this dependencies become buggy or unsupported.

## Context
The PM from Crackdown (2009) states that the developers chose Criterion's Renderware Graphics engine to "reduce development time". However, this measure backfired when they discovered that newest version of their target platform, the original Xbox, was not supported by the version 3.7 of the engine, which they were using. They were left with no option but migrating to version 4.0, which was "a work in progress" and "each update came with a whole new set of bugs".

In the PM from CoD 2 (2005), Grant Collier reports that that "more than half" of the Xbox 360's dev kits supplied to the studio by Microsoft "just died" throughout development.

## Symptoms
- The project's middleware is frequently broken by updates, which demand workarounds
- The project's middleware is barely documented/supported
- People in the project are not experienced in the utilized middleware and/or have not dedicated enough time to study it

## Refactored Solutions
- Study and test multiple middleware before defining the toolset that will be used throughout the project. This is a way to check if it is a good fit for the project and the desired target platforms
- Choose the project's middleware according to the people's skills and previous experience
- Choose middleware that is adequately documented and supported

## Suggested/adopted PM solutions
- "In hindsight, we realize that we simply did not adequately investigate the suitability and potential pitfalls of this new version of Renderware. Had we done so, we would have known that the correct decision would have been to back out and replace it all with our own technology." (Crackdown, 2009)

## Sources
[https://www.gamedeveloper.com/business/postcard-from-the-montreal-game-summit-i-call-of-duty-2-i-postmortem]
[https://www.gamedeveloper.com/business/postmortem-realtime-worlds-i-crackdown-i-]
