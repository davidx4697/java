# Entry 8

### Message clients
My MVP is a primitive version of a messenger client made in pure java. There is a problem with it being made in pure java and that it's impossible to make this into a website. I've tried using Tomcat, a free to use server that runs java but it cannot run pure java. It can only accept applications written in jsp, a java language with html integrated. JSP solely used for web development and is kind of similar to Java. I will attempt to rewrite my project in JSP so i can run it on a local host webpage rather on a java app.  

### Are templates cool?
Although templates are amazing and save time, I really wanted to code my MVP from scratch. I wanted to know just how much that i've learned could be implemented into my MVP. Now that theres a week left from presentation, I've started to regret that decision. Since I started from scratch my code is all over the place and my variable names are inefficient. Im currently changing variable names, fixing indentation, and commenting my code to make it presentable friendly.


### Challenges 
Some of the challenges I faced today was creating a for loop that takes the user's input and makes it equal to a JLABEL. A JLABEL is like a variable for those unfamiliar with Java GUI. 

``` java 
for (int i = 0; i < thoughts.size(); i++) {			
                     			System.out.println(thoughts.get(i));
                     			String thoughtsword = thoughts.get(i);
                     			
                     			JLabel thoughtwordlabel =new JLabel(thoughtsword);
                     			thoughtwordlabel.setText("<html> <br>" +thoughtsword + " <br> </html>");
                     			thoughtpanel.add(thoughtwordlabel);
                     			thoughts.remove(0);
```

This for loop successfully grabs and creates a new JLabel using the user's input except there's a small problem. JLabels do not accept line breaks or go to the next line by default. It seems after googling the only way to make a user's input print on a seperate line is by creating a JTextArea. The syntax for a JTextArea is different and I will learn it in the next couple of days. 

Challenge:
<img src="../images/challenge ent8.PNG"/>

### Takeaways

The only takeaway I had this week is to start making your code presentable. I decided to fix the indentation in my project and added more comments so that people can see the way I think or the reasons why I wrote that line of code. This will make it easier to understand when I present infront of my classmates. 