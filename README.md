# Design Pattern

#### Design Principle

- Identify the aspects of your application the vary and separate them from what stays the same ( **Take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting those that don't** )

- Program to an interface, not an implementation ( The design principle *interface* **refers to lose coupling between modules or systems**. Whenever you build a larger piece of software, you will have dependencies to other systems. For example to a relational database or to a REST service. All of those dependencies represent tools for your software to fulfil its goals. Such a goal might be to manage contacts in an address bock app or to process orders in an online shop. But whatever the goal of your software is, your goal as a software developer should be to model your problem domain nice and clean )

  ![programming-to-an-interface](C:\Users\Pc\Desktop\programming-to-an-interface.png)

- Favor composition over inheritance. ( Creating systems using composition gives you a lot more flexibility. Not only does it let you encapsulate a family of algorithms into their own set of classes, but it also lets you **change behavior at runtime** as long as the object you're composing with implements the correct behavior interface )

## Strategy Pattern

###### " Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from the clients that use it "

<img src="C:\Users\Pc\Desktop\design-patterns-strategy-diagram.png" alt="design-patterns-strategy-diagram" style="zoom:200%;" />

## Observer Pattern

###### " Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically "

![design-patterns-observer-diagram](C:\Users\Pc\Desktop\design-patterns-observer-diagram.png)