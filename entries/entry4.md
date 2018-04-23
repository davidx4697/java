# Entry 4: Object Oriented

## Inheritance and extend 
Inheritance in java allows a subclass to 'inherit' everything inside a superclass. This makes it easy to create a parent class with multiple subclasses with the properties of the superclass and is pretty simple to do as well. 

An example of inheritance: 
```java
class Drink {
  public void move () {
    System.out.print("Dogs like to drink");
  }
}
class Dog extends Drink{
  public void move(){
    System.out.print(" water!");
  }
}
public class Main {
  public static void main(String[] args){
    Drink a = new Drink();
    Drink b = new Dog();
    a.move();
    b.move();
  }
}

```

The print in the Drink class is combined with the print from the Dog class. Therefore, it should return ``Dogs like to drink water!`` in the terminal. Extend allows the user to create a subclass with the properties from another subclass. Additionally, you can only inherit the properties of one single subclass or superclass. 

## Import Scanner 

The scanner keyword allows the coder to grab information from a user. In order to use the scanner keyword you must first import it by pasting this at the very start of your program: ``import java.util.Scanner;``. The code below shows one way the scanner keyword can be used in Java.

```java 
import java.util.Scanner;

class Main {
  public static void main (String[] args) {
    String answer;
    Scanner football = new Scanner(System.in);
    System.out.println("Do you like football? (y or n)");
    answer = football.next();
    if (answer.equalsIgnoreCase("y")) {
      System.out.println("cool");
    } else {
      System.out.println("Thats fine");
    }
  }
}

```
This will result in the user being asked "Do you like football? (y or n)". Depending on the user's response, the terminal will respond with "cool" or "Thats fine". Learning how to use the scanner keyword was my favorite part of this week and there is so much I want to do using this. 


## Takeaways
I did not expect to learn object orientation for Java this week. I was planning to complete the Codeacademy course first before doing anything that involved object orientation. My main takeaway was doing something I did not think I was ready for. My attitude this week was being careless since I didn't care if I was not going to understand the object oriented part of java. Doing something I was worried being confused of actually resulted in me understanding more of the Java syntax and made me realise I can actually CREATE something using this language. Therefore I suggest doing something completely different than usual  for a whole week or learn something you think is way too advanced for you. 
## Resources

[REPL](https://repl.it/)

[Scanner keyword on REPL](https://repl.it/@davidx4697/Java-Scanner-Class)

[Inheritance and extend on REPL](https://repl.it/@davidx4697/PreemptiveSophisticatedOmnipage)


