/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter3;

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
public class SceneSwitcher extends Application
{
 public static void main(String[] args)
 {
 launch(args);
 }
 // class fields for Click-Counter scene →15
 // The section of the programs defines class fields that will be used by the 
 //scene for the Click-Counter portion of the program.
 //These include
 //The count of clicks and the buttons 
 int iClickCount = 0;
 Label lblClicks;
 Button btnClickMe;
 Button btnSwitchToScene2;
 Scene scene1;
 // class fields for Add-Subtract scene →22
 //These lines define class variables used by the Add-Subtract portion of 
 //the program, including the counter

 int iCounter = 0;
 Label lblCounter;
 Button btnAdd;
 Button btnSubtract;
 Button btnSwitchToScene1;
 Scene scene2;
 // class field for stage
 Stage stage;// →31
 @Override public void start(Stage primaryStage)
 {
 stage = primaryStage;// →35
 // A class field named stage is used to hold a reference to the primary 
 //stage so it can be accesed throut the program 
 // Build the Click-Counter scene →37
 //This line sets stage class field to reference the primary stage
 lblClicks = new Label();
 lblClicks.setText("You have not clicked the button.");
 btnClickMe = new Button();
 btnClickMe.setText("Click me please!");
 btnClickMe.setOnAction(
 e -> btnClickMe_Click() );
 btnSwitchToScene2 = new Button();
 btnSwitchToScene2.setText("Switch!");
 btnSwitchToScene2.setOnAction(
 e -> btnSwitchToScene2_Click() );
  VBox pane1 = new VBox(10);
 pane1.getChildren().addAll(lblClicks, btnClickMe,
 btnSwitchToScene2);
 scene1 = new Scene(pane1, 250, 150);
 // Build the Add-Subtract scene →59
 //This section of the program builds the Add-Subtract scene by creating 
 //the label and the buttons displayed by the scene
 lblCounter = new Label();
 lblCounter.setText(Integer.toString(iCounter));
 btnAdd = new Button();
 btnAdd.setText("Add");
 btnAdd.setOnAction(
 e -> btnAdd_Click() );
 btnSubtract = new Button();
 btnSubtract.setText("Subtract");
 btnSubtract.setOnAction(
 e -> btnSubtract_Click() );
 btnSwitchToScene2 = new Button();
 btnSwitchToScene2.setText("Switch!");
 btnSwitchToScene2.setOnAction(
 e -> btnSwitchToScene1_Click() );
 HBox pane2 = new HBox(10);
 pane2.getChildren().addAll(lblCounter, btnAdd,
 btnSubtract, btnSwitchToScene2);
 scene2 = new Scene(pane2, 300, 75);
 // Set the stage with scene 1 and show the stage →84
 //These lines set the Click-Counter scene as the root scene for the primary stage 
 primaryStage.setScene(scene1);
 primaryStage.setTitle("Scene Switcher");
 primaryStage.show();
 }
 // Event handlers for scene 1 →91
 //This section of the program provides the event handlers for the buttons 
 //in the Click-Counter scene. The event handler for the Click Me! button 
 //increments the click counter, then sets the label to display an appropriate message
  public void btnClickMe_Click()
 {
 iClickCount++;
 if (iClickCount == 1)
     {
 lblClicks.setText("You have clicked once.");
 }
 else
 {
 lblClicks.setText("You have clicked "
 + iClickCount + " times." );
 }
 }
 private void btnSwitchToScene2_Click()
 {
 stage.setScene(scene2);
 }
 // Event handlers for scene 2 →112
 //This section of the program provides the event handlers for the buttons 
 //in the Add-Subtract scene. The event handler for the Add and Subtract 
 //buttons increment or decrement the counter and update the text 
 //displayed by the label
  private void btnAdd_Click()
 {
 iCounter++;
 lblCounter.setText(Integer.toString(iCounter));
 }
 private void btnSubtract_Click()
 {
 iCounter--;
 lblCounter.setText(Integer.toString(iCounter));
 }
 private void btnSwitchToScene1_Click()
 {
 stage.setScene(scene1);
 }
}*
