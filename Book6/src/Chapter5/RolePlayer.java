/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter5;

/**
 *
 * @author Sean
 */
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
public class RolePlayer extends Application //The name of the program’s main class is RolePlayer
{
 public static void main(String[] args)
 {
 launch(args);
 }
 TextField txtCharacter;//These class variables allow any of the RolePlayer class methods to 0
                        //access the two text fields.
 TextField txtActor;
 @Override public void start(Stage primaryStage)
 {
 // Create the Character  These lines create a label to identify the Character text box. The field is 
//set to a minimum width of 100 pixels and is right-justified so that the 
//labels for that identify the two text fields will be aligned properly
     Label lblCharacter = new Label("Character's Name:");
 lblCharacter.setMinWidth(100);
 lblCharacter.setAlignment(Pos.BOTTOM_RIGHT);
 // Create the Character text field →hese lines create the Character text field with a minimum and maximum width of 200 pixels. 
 //The prompt text is set to Enter the name of the character here
 txtCharacter = new TextField();
 txtCharacter.setMinWidth(200);
 txtCharacter.setMaxWidth(200);
 txtCharacter.setPromptText(
 "Enter the name of the character here.");
 // Create the Actor label →32  These lines create a label to identify the Actor text field. Like the Character labe
 Label lblActor = new Label("Actor's Name:");
 lblActor.setMinWidth(100);
 lblActor.setAlignment(Pos.BOTTOM_RIGHT);
 // Create the Actor text field →37  These lines create the Actor text field, set its width to 200 pixels, and 
 //assign prompt text
 txtActor = new TextField();
 txtActor.setMinWidth(200);
 txtActor.setMaxWidth(200);
 txtActor.setPromptText("Enter the name of the actor here.");
 // Create the OK button → These lines create the OK button. The btnOK_Click method is called when the button is clicked
 Button btnOK = new Button("OK");
 btnOK.setMinWidth(75);
 btnOK.setOnAction(e -> btnOK_Click() );
 // Create the Character pane →48  These lines create an HBox pane and add the Character label and text 
 //box to it.
 HBox paneCharacter = new HBox(20, lblCharacter, txtCharacter);
 paneCharacter.setPadding(new Insets(10));
 // Create the Actor pane →This one like above creates a HBox and adds the Actor label and text
 HBox paneActor = new HBox(20, lblActor, txtActor);
 paneActor.setPadding(new Insets(10));
 // Create the Button pane →56  These lines create a third HBox pane to hold the button
 HBox paneButton = new HBox(20, btnOK);
 paneButton.setPadding(new Insets(10));
 paneButton.setAlignment(Pos.BOTTOM_RIGHT);
 // Add the Character, Actor, and Button panes to a VBox →61  Now that all the controls are created and added to HBox panes, the 
 //three HBox panes are added to a VBox pane so that the text boxes with 
 //their associated labels and the button are stacked vertically.
 VBox pane = new VBox(10, paneCharacter, paneActor, paneButton);
 // Set the stage →64  These lines create a scene to show the VBox pane and then add the 
//scene to the primary stage
 Scene scene = new Scene(pane);
 primaryStage.setScene(scene);
 primaryStage.setTitle("Role Player");
  primaryStage.show();
 }
 public void btnOK_Click() //→71 The btnOK_Click method is called whenever the user clicks OK
 {
 String errorMessage = ""; //→73 The errorMessage variable holds any error message that might be 
 //necessary to inform the user of missing data
 if (txtCharacter.getText().length() == 0) //→75 This if statement ensures that the user has entered data into the 
 //Character text box if there is no data then the error message comes up
 {
 errorMessage += "\nCharacter is a required field.";
 }
 if (txtActor.getText().length() == 0)// →80 the same as 75 but for the character 
 {
 errorMessage += "\nActor is a required field.";
 }
 if (errorMessage.length() == 0) //→85 this line test the length that was entered and if nothing is entered then error comes up,
     //but essentially it tests what was entered and then displays the text 
 {
 String message = "The role of "
 + txtCharacter.getText()
 + " will be played by "
 + txtActor.getText()
 + ".";
 Alert a = new Alert(Alert.AlertType.INFORMATION, message);
 a.setTitle("Cast");
 a.showAndWait();
 }
 else
 {
 Alert a = new Alert(Alert.AlertType.WARNING, errorMessage); //→98 error if nothing was entered 
 a.setTitle("Missing Data");
 a.showAndWait();
 }
 }
}
