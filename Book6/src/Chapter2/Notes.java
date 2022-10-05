/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

/**
 *
 * @author Sean
 */
public class Notes {
    /*
    
    
    Handling Events
    
    In this chapter we handle events and the actions that happen when an event is triggered 
    in this chapter you’re introduced to the idea of property bindings, which 
    let you write code that responds to changes in the value of certain types of class 
    fields, dubbed property fields
    
    
    
    Examining Events
    
    An event is an object that’s generated when the user does something noteworthy 
    with one of your user-interface components
     Then this event object is passed to a 
    special method you create, called an event handler. The event handler can examine 
    the event object, determine exactly what type of event occurred, and respond accordingly
    The event is something that happends on a page like moving over a button or entering some data
    the event handler then makes whatever should happen, happen
    An event is represented by an instance of the class javafx.event.Event or one of its many subclasses
    Here are four important terms you need to know
    1)Events 
         An object that’s created when the user does something noteworthy
    2)Event source
        The object on which the event initially occurred
    3) Event target
        The node that the event is directed at.
        This is usually the button or other control that the user clicked or otherwise manipulated
    4) Event handler
        The object that listens for events and handles them when they occur.
    
    
    Handling Events
    
    There are 3 steps to handeling an event 
    1) Create an event source.
        An event source is simply a control, such as a button, that can generate events
    2)Create an event handler.
        To create an event handler, you must create an object that implements an 
        interface appropriately named EventHandler.You can do this in 4 ways
            2.1)Add implements EventHandler to the program’s Application class and 
                provide an implementation of the handle method
            2.2)Create an inner class that implements EventHandler within the Application class
            2.3)Create an anonymous class that implements EventHandler
            2.4)Use a lambda expression to implement the handle method.
    3) Register the event handler with the event source.
        The final step is to register the event handler with the event source so that the 
        handle method is called whenever the event occurs
    Every component that serves as an event source provides a method that lets 
    you register event handlers to listen for the event
    
    
    
    Implementing the EventHandler Interface
    
    look at AddSubtract in netBeans and see it works in intelij
    
    
    Handling Events with Inner Classes
    
    An inner class is a class that’s nested within another class. Inner classes are commonly used for event handlers. 
    That way, the class that defines the application 
    doesn’t also have to implement the event handler.
    look at AddSubtract2 in netBeans and see it works in intelij
    
    
    Handling Events with Anonymous Inner Classes
    
    An anonymous inner class, usually just called an anonymous class, is a class that’s 
    defined on the spot, right at the point where you need ityou don’t have to give it a name;
    that’s why it’s called an anonymous class.
    Anonymous classes are often used for event handlers to avoid the need to create a 
    separate class that explicitly implements the EventHandler interface
    
    
    Using Lambda Expressions to Handle Events
    
    A lambda expression lets you create an anonymous class that implements a specific type of interface
    A functional interface 
    One of the interesting things about lambda expressions is that you don’t need to know the name of the method being called
    - This is possible because a functional interface used with a lambda expression can have only one abstract method.
    You also do not need to know the name of the interface being implemented.
    -This is possible because the interface is determined by the context
    t when 
    you use a lambda expression, you don’t have to know or specify the name of the 
    class, the method, or a variable used to reference it. All you have to do, essentially, 
    is provide the body of the handle method
    look at AddSubtract4
    Note that in this example, the lambda expressions for the two event handlers are 
    simple because very little processing needs to be done when either of the buttons 
    in this program are clicked
    Look at AddSubtract5 to see another way to implent a lambda expression 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    */
}
