/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter1;

/**
 *
 * @author Sean
 */
public class Notes {
    /*
    
    Hello, JavaFX!
    
    up to this point in the book we have only worked with console based programs
    but in this book we will use a  graphical user interface (GUI).
    Ths packeage will help us create simple buttons, tables and tabs'
    
    
    Perusing the Possibilities of JavaFX
    
    One of the basic strengths of JavaFX is its ability to let you easily create 
    complicated GUIs with all the classic user interface gizmos everyone knows and loves
    Where JavaFX begins to shine is in its ability to allow you to easily improve the 
    appearance of your user interface by using Cascading Style Sheets
    JavaFX offers many other capabilities. For example:
    1)Visual effects: You can add a wide variety of visual effects to your user 
      interface elements, including shadows, reflections, blurs, lighting, and perspective effects.
    2)Animation: You can specify animation effects that apply transitions gradually over time.
    3)3-D objects: You can draw three-dimensional objects such as
      cubes, cylinders,spheres, and more complex shapes.
    4)Touch interface: JavaFX can handle touchscreen devices, such as smartphones and tablet computers with ease
    
    
    
    Looking at a Simple JavaFX Program
    
    Go to the click me thing 
    
    
    Importing JavaFX Packages
    
    Like any Java program, JavaFX programs begin with a series of import statements 
    that reference the various JavaFX packages that the program will use
    the click me class uses 5 diffrent pieces of the javafx package 
    import javafx.application.*;
    import javafx.stage.*;
    import javafx.scene.*;
    import javafx.scene.layout.*;
    import javafx.scene.control.*;
    1)javafx.application: This package defines the core class on which all JavaFX 
      applications depend
    2)javafx.stage: The most important class in this package is the Stage class, 
      which defines the top-level container for all user interface objects
    3)javafx.scene: The most important class in this package is the Scene class, 
      which is a container that holds all the user interface elements displayed by the program
    4)javafx.scene.layout: This package defines a special type of user-interface element called a layout manager
    5)Java.scene.control: This package contains the classes that define individual user interface controls such as
      buttons, text boxes, and labels
    
    
    
    Extending the Application Class
    
    A JavaFX application is a Java class that extends the javafx.application.
    Application class. Thus, the declaration for the Click Me application’s main class 
    is this:
        public class ClickMe extends Application
    The Application class is responsible for managing what is called the life cycle of a JavaFX application
    1)Create an instance of the Application class
    2)Call the init method.
      The default implementation of the init method does nothing, but you can 
      override the init method to provide any processing you want to be performed 
      before the application’s user interface displays.
    3)Call the start method.
      The start method is an abstract method, which means that there is no default 
      implementation provided as a part of the Application class. Therefore, you must provide your own version of the start method
    4) Wait for the application to end, which typically happens when the user 
       signals the end of the program by closing the main application window or choosing the program’s exit command
    5)Call the stop method.
      Like the init method, the default implementation of the stop method doesn’t 
      do anything, but you can override it to perform any processing necessary as 
      the program terminates, such as closing database resources or saving files.
    
    
    
    Launching the Application
    
    As you know, the standard entry-point for Java programs is the main method
    The launch method is what actually starts a JavaFX application. The launch
    method is a static method, so it can be called in the static context of the main
    method. It creates an instance of the Application class and then starts the JavaFX 
    lifecycle, calling the init and start methods, waiting for the application to finish, 
    and then calling the stop method.
    
    
    
    Overriding the start Method
    
    Every JavaFX application must include a start method. You write the code that 
    creates the user interface elements your program’s user will interact with in the start method.
    When a JavaFX application is launched, the JavaFX framework calls the start
    method after the Application class has been initialized
    the start method performs the following four basic steps:
    1)Create a button control named btn
      a method named buttonClick will be called when the user clicks the button
    2)Create a layout pane named pane and add the button to it
    3)Create a scene named scene and add the layout pane to it(Scene is still coming)
    4)Finalize the stage by setting the scene, setting the stage title, and showing the stage
    
    
    Creating a Button
    
    The button displayed by the Click Me program is created using a class named 
    Button. This class is one of many classes that you can use to create user interface 
    controls and the button is found in javafx.scene.control package
    To create a button, simply define a variable of type Button and then call the 
    Button constructor like this:
        Button btn;
        btn = new Button();
    To set the text value displayed by the button, call the setText method, passing the 
    text to be displayed as a string:
         btn.setText("Click me please!");
    
    
    Handling an Action Event
    
    When the user clicks a button, an action event is triggered. Your program can 
    respond to the event by providing an event handler, which is simply a bit of code 
    that will be executed whenever the event occurs
    To specify the method to be called, you call the setOnAction method of the button 
    class. Here’s how it’s done in Listing 1-1:
        btn.setOnAction(e -> buttonClick());
    So the buttonClick calls a method wich has a if statement in in to change 
    if its clicked or not 
    The buttonClicked method uses two methods of the Button class to perform its work:
       1)getText: Returns the text displayed by the button as a string
       2)setText: Sets the text displayed by the button
    
    
    Creating a Layout Pane
    
    By itself, a button is not very useful. You must actually display it on the screen 
    for the user to be able to click it, if your application has two buttons, do you want them to be stacked 
    vertically, one above the other, or side by side?
    This is where the layout pane comes into play.
    A layout pane is a container class to which you can add one or more user-interface elements
    To use a layout pane, you first create an instance of the pane. Then, you add one or more controls to the pane
    JavaFX provides a total of eight distinct types of layout panes, all defined by 
    classes in the package javafx.scene.layout.
    The Click Me program uses a type of layout called a border pane, which arranges the contents of the pane into five 
    general regions: top, left, right, bottom, and center
    The lines that create the border pane in the Click Me program are
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);
    Here, a variable of type BorderPane is declared with the name pane, and the 
    BorderPane constructor is called to create a new BorderPane object. Then, the 
    setCenter method is used to display the button (btn) in the center region of the pane
    
    
    Making a Scene
    
    After you create a layout pane that contains the controls you want to display, the 
    next step is to create a scene that will display the layout pane
    You can do this in a single line itt declares a variable of type Scene and calls the Scene class 
    constructor. 
         Scene scene = new Scene(pane, 300, 250);
    The Scene constructor accepts three arguments:
    1)A node object that represents the root node to be displayed by the scene
      A scene can have only one root node, so the root node is usually a layout 
      pane, which in turn contains other controls to be displayed
    2)The width of the scene in pixels
    3)The hight of the scene in pixels
    
    
    Setting the Stage
    
    If the scene represents the nodes (controls and layout panes) that are displayed by 
    the application, the stage represents the window in which the scene is displayed
    Having created your scene, you’re now ready to finalize the primary stage so that 
    the scene can be displayed. To do that, you must do at least two things:
    1)Call the setScene method of the primary stage to set the scene to be displayed
    2)Call the show method of the primary stage to display the scene
    
    
    Examining the Click Counter Program
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    */
}
