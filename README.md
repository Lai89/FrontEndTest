# Tech Store Front-End Challenge

## Description

This is an exercise to test the website (<https://www.demoblaze.com>).

## How To

To execute the tests, you must have installed Selenium Driver for the navigator you are going to use. 
Tests are executed from the IDE; in this case, we used IntelliJ by IDEA.

## Observations

- It is the first time I create automation tests with Selenium and Java.
- It is very useful that web elements can be identified with a unique id, instead of "link text" or "xpath". 
- Checking validations, I considered it was an E2E case, and that is the reason why all assertions are found inside the same text.
- Variables could be saved in the before section, but I prefer to build tests first with all the variables public and then, when needed, move them to the desired space. It would be an improvement.
- The assertions when getting to cart and placing order have been commented because cannot be validated at the moment. It would be another improvement.
- In order to log Id and Purchase Amount would need to break the text block of the element so they can be logged separately. That is why it is commented.

## Next Steps

- Try to assign a unique id for each of the web elements, so we can find them easily. At the moment, some elements have the same id.
- Create a separate file for each webpage to test in order to map all the elements and avoid unnecessary repetition.
- We can do the same with the config.
- We can improve the actions with the delete button in the cart, so it gets more dynamic
