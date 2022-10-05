/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

/**
 *
 * @author Sean
 */
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;//This package defines ActionEvent class and the EventHandler interfaces
public class AddSubtract extends Application
 implements EventHandler <ActionEvent>// As in any JavaFX program, the AddSubtract1 class extends the 
                                      //Application class. However it also implements the action event class
{
 public static void main(String[] args) //The main method is required as usual. This method simply calls the launch method
 {
 launch(args);
 }
 Button btnAdd; //Declairing a buttonAdd
 Button btnSubtract;//Declairing a buttonSubtract
 Label lbl;
 int iCounter = 0;//Here we declaire the counter to start at 0
                  //The iCounter variable keeps track of the value displayed by the label
 @Override public void start(Stage primaryStage) //The start method is called when the application is started.
 {
 // Create the Add button
 btnAdd = new Button();//Add button 
 btnAdd.setText("Add");//set its text to display the word Add
 btnAdd.setOnAction(this);// This line sets the current object as the event handler for the btnAdd
                          //button. The this keyword is used here because the AddSubtract class implements the EventHandler
 // Create the Subtract button
 btnSubtract = new Button();//Subtract button
 btnSubtract.setText("Subtract");//set its text
 btnSubtract.setOnAction(this);
 // Create the Label These two lines create the label and set its initial text value to a string 
 //equivalent of the iCounter variable.
 lbl = new Label();
 lbl.setText(Integer.toString(iCounter));
 // Add the buttons and label to an HBox pane
 HBox pane = new HBox(10); //Fot this program border pain is not used
                           //An HBox pane arranges any controls you add to it in a horizontal 
                           //row. The parameter 10 indicates that the controls should be separated 
                           //from one another by a space 10 pixels wide.
 pane.getChildren().addAll(lbl, btnAdd, btnSubtract);// This line adds the label and the two buttons to the horizontal box
 // Add the layout pane to a scene
 Scene scene = new Scene(pane, 200, 75);//  This line creates a new scene, using the HBox pane as its root node
 // Add the scene to the stage, set the title
 // and show the stage
 primaryStage.setScene(scene); // This line sets the scene created in line 42 as the primary scene for the stage
 primaryStage.setTitle("Add/Sub");
 primaryStage.show();
 }
 @Override public void handle(ActionEvent e) // The handle method must be coded because the AddSubtract class 
                                             //implements the EventHandler interface
 {
 if (e.getSource()==btnAdd) //The getSource method of the ActionEvent parameter is called to determine the event source.
 {
 iCounter++;
 }
 else
 {
 if (e.getSource()==btnSubtract)// If, on the other hand, the event source is btnSubtract, the iCounter variable is decremented
  {
 iCounter--;
 }
 }
 lbl.setText(Integer.toString(iCounter));// The label’s text value is set to the string equivalent of the iCounter variable
 }
}
