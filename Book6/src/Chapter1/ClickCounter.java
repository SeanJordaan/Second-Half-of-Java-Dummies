/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter1;

/**
 *
 * @author Sean
 */
import javafx.application.*;//The import statements reference the javafx packages
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
public class ClickCounter extends Application//The ClickMe class extends javafx.application.Application
{
 public static void main(String[] args)//the main method is the main entry point for all JavaFX programs
 {
 launch(args);// The launch method, in turn, creates an instance of the ClickMe class and then calls the start method.
 }
 Button btn;//A variable named btn of type javafx.scene.control
 Label lbl;// A class variable named lbl of type javafx.scene.control.Label
           //represents the Label control so that it can be accessed from any method in the class.
 int iClickCount = 0;//  A class variable named iClickCount will be used to keep track of the number of clicks 
 @Override public void start(Stage primaryStage)// The declaration of the start method uses the @override annotation, 
                                                //indicating that this method overrides the default start method 
                                                //provided by the Application class.
 {
 // Create the button
 btn = new Button(); //The start method begins by creating a Button object
 btn.setText("Click me please!");//The button’s setText method is called to set the text displayed
 btn.setOnAction(e -> buttonClick());// The setOnAction is called to create an event handler for the button
 // Create the Label
 lbl = new Label(); //The constructor of the Label class is called to create a new label
 lbl.setText("You have not clicked the button.");// The label’s setText method is called to set the initial text value of the label
 // Add the label and the button to a layout pane
 BorderPane pane = new BorderPane();//A border pane object is created by calling the constructor of the 
                                    //BorderPane class, referencing the border pane via a variable named pane
 pane.setTop(lbl); //The border pane’s setTop method is called
 pane.setCenter(btn); // The border pane’s setCenter method is called to add the button to the center region
 // Add the layout pane to a scene
 Scene scene = new Scene(pane, 250, 150);//  A scene object is created by calling the constructor of the Scene class
                                        //250 pixels in width and 150 pixels in height
 // Add the scene to the stage, set the title
 // and show the stage
 primaryStage.setScene(scene); //  The setScene method of the primaryStage is used
 primaryStage.setTitle("Click Counter");//  The setTitle method is used to set the text displayed
 primaryStage.show();//The show method is called to display the primary stage. When this line is executed, the window that was shown
 }
 public void buttonClick() //The buttonClick method is called whenever the user clicks the button.
 {
 iClickCount++;// The iClickCount variable is incremented
 if (iClickCount == 1) //  An if statement is used to determine whether the button has been clicked
 {
 lbl.setText("You have clicked once.");//  If the button has been clicked once
 }
 else
 {
 lbl.setText("You have clicked " //If clicked more than once it displays this its the counter plus the string 
 + iClickCount + " times." );
 }
 }
}