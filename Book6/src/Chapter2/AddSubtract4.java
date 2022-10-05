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
public class AddSubtract4 extends Application
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
 btnAdd.setOnAction( e ->//This statement uses a lambda expression to add an event handler to the 
                         //Add button. The method body of this lambda expression increments the 
                         //counter variable and then sets the label text to reflect the updated value
 {
 iCounter++;
 lbl.setText(Integer.toString(iCounter));
 } );
 // Create the Subtract button
 btnSubtract = new Button();
 btnSubtract.setText("Subtract");
 btnSubtract.setOnAction( e -> //→34
 {
 iCounter--;
 lbl.setText(Integer.toString(iCounter));
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
