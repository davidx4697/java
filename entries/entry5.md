# Entry 5: Methods

## Object Oriented Java
Going back to codeacademy, I have learned more about methods. I already know what methods are and what they are used for thanks to Ruby and p5js. Therefore I picked up method syntax in Java pretty quickly. The syntax is similar to Ruby and the only difference is the calling of methods and there is more strict syntax in Java. There is an example of a method below:

```java 
class Dog {
  int age;
  int feet;
public Dog(int dogsAge) {
  age = dogsAge;
}

public void bark() {
System.out.println("Woof!");
}

   public void run (int feet) {
 	System.out.println("Your dog ran " + feet + " feet!");
 }
	public static void main(String[] args) {
		Dog spike = new Dog(7);
        spike.bark();
        spike.run(54);
	}
}
```
Just like in Ruby you have to create the variables first, call a method that defines those variables, and then you can make the methods that determine what those variables can do. In this case the method, `bark` prints `"Woof!"` and the method `run` prints `"Your dog ran " + feet + " feet!"`. Additionally the method below ...
```java 
public void run (int feet) {
 	System.out.println("Your dog ran " + feet + " feet!");
 }
	public static void main(String[] args) {
		Dog spike = new Dog(7);
        spike.bark();
        spike.run(54);
	}
```
...must be called or the whole file will respond with a error. The method 'main' must be called atleast once in every Java file for it to run. The reasoning behind this rule was said to be a convention according to the java reference website. 

## Innerclasses
In java you can create classes inside classes. The information inside the inside classes can then be used by the other inside classes within the outer class. The following shows an example of how Java Innerclasses work and look like.

```java
class Outer_Cat {
   
   private class Inner_Whiskers {
      public void print() {
         System.out.println("My cat has whiskers");
      }
   }
   
   void display_Inner() {
      Inner_Whiskers inner = new Inner_Whiskers();
      inner.print();
   }
}
   
public class Main {

   public static void main(String args[]) {
      Outer_Cat outer = new Outer_Cat();
  
      outer.display_Inner();
   }
}
```

## Takeaways
The main takeaway is to keep notes updated throughout the week. Writing down a sentence for every important thing you learned or came across will make it easier to remember things for when I write my entry. Also keeping my notes updated will make me remember the syntax and what certain keywords do in Java. Therfore keeping my notes benefits me in two ways. It helps me memorize certain syntax, and it also helps me keep track of what I have learned every seven days.