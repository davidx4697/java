# Entry 7: Improving the MVP

## Improving the MVP
After finishing the mvp the next move was to think about what I can add realistically within the time frame. One of the difficult tasks I faced was creating a website project using an app development language. Having java as a app development language made it difficult for me to present my code on a website 

#### Features Added

Some features I added to since last week was clearing the text field after the user had submitted their response to "What's on your mind". This was a simple solution that required to check if the button was pressed and only then will the value of the text field be changed to null/empty. 

```java 
thoughtlabel.setText(input); //fix input to center!	
thoughttext.setText("");
```


Another feature that I added was I made the mouse cursor focus on the text field box after submitting the user's input. This was done with a single line of code yet it changed the flow of the GUI and made it less hassle if you had more than one thing on your mind.

```java 
thoughttext.requestFocusInWindow();
```

#### Arrays
A thing I started to work on is creating an array that grabs the user's input after pressing the button. After grabbing the user's input and adding it into the array, it should go a few lines down so that theres space for another input. So far I created an ArrayList and have successfully added all the user's input into the Array but I do not know how to stop getting the value of the variable `thoughtlabel` from getting replaced by a new user input. I'm thinking of making a forloop that creates variable names and makes the user input equal to a variable name like `variable12 = "hello world"`. This has proven to be a difficult task and do not even know where to start to create this. I need more time to think about a solution. I'll get back to it later.


#### Takeaways
As the SEP expo is only a day away, I think a major takeaway I learned this week was adding to the MVP rather than trying to make the final project. I see classmates trying really hard to finish their final project in time for the Expo and although it's impressive that they are trying to present it a few weeks earlier than the deadline, I think it's also important to make realistic deadlines and goals for timeframes. I think most of my classmates will benefit if they simply just added features to their MVP rather than trying to make the final project and completely disregarding their MVP.
