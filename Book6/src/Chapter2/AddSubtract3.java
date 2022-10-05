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
import javafx.event.*;
public class AddSubtract3 extends Application
{
 public static void main(String[] args)
 {
 launch(args);
 }
 Button btnAdd;
 Button btnSubtract;
 Label lbl;
 int iCounter = 0;
 @Override public void start(Stage primaryStage)
 {
 // Create the Add button
 btnAdd = new Button();
 btnAdd.setText("Add");
 btnAdd.setOnAction(
 new EventHandler<ActionEvent>() //This line calls the setOnAction method of the Add button and creates 
                                 //an anonymous instance of the EventHandler class, specifying ActionEvent as the type
 {
 public void handle(ActionEvent e) //The handle method must be defined within the body of the anonymous class
 {
 iCounter++; //Because this handle method will be called only when the Add button is clicked
 lbl.setText(Integer.toString(iCounter));
 }
 } );
 // Create the Subtract button
 btnSubtract = new Button();
 btnSubtract.setText("Subtract");
 btnSubtract.setOnAction(
 new EventHandler<ActionEvent>() //This line calls the setOnAction method of the Subtract button and 
                                //creates another anonymous instance of the EventHandler class
 {
 public void handle(ActionEvent e) //This time, the handle method decrements the counter variable and updates
 {
 iCounter--;//Because this handle method will be called only when the Subtract button is clicked
 lbl.setText(Integer.toString(iCounter));
 }
 } );
 // Create the Label
 lbl = new Label();
 lbl.setText(Integer.toString(iCounter));
 // Add the buttons and label to an HBox pane
 HBox pane = new HBox(10);
 pane.getChildren().addAll(lbl, btnAdd, btnSubtract);
 // Add the layout pane to a scene
 Scene scene = new Scene(pane, 200, 75);
 // Add the scene to the stage, set the title
 // and show the stage
 primaryStage.setScene(scene);
 primaryStage.setTitle("Add/Sub");
 primaryStage.show();
 }
}
