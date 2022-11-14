# Tech Store Front-End Challenge

## Description

This is an exercise to test the website (<https://www.demoblaze.com>).

## How To

To execute the tests, you must have installed Selenium IDE. Tests are executed from the IDE; in this case, we used IntelliJ by IDEA.

## Observations

- It is very useful that web elements can be identified with the id, instead of some element more general.
- Checking validations, I considered it was an E2E case, and that is the reason why all assertions are found inside the same text.

## Next Steps

- Try to assign a unique id for each of the web elements, so we can find them easily. At the moment, some elements have the same id.
- Create a separate file to map all the elements and avoid unnecessary repetition.
- We can do the same with the config.