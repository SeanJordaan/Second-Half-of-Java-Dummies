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

public class AddSubtract2 extends Application //The AddSubtract2 class still extends Application but doesn’t 
//implement EventHandler.
{

    public static void main(String[] args) {
        launch(args);
    }
    Button btnAdd;
    Button btnSubtract;
    Label lbl;
    int iCounter = 0;

    @Override
    public void start(Stage primaryStage) {
        // Create a ClickHandler instance
        ClickHandler ch = new ClickHandler();// This statement creates an instance of the ClickHandler class
        //wich is an inner class
        // Create the Add button
        btnAdd = new Button();
        btnAdd.setText("Add");
        btnAdd.setOnAction(ch); //  This statement sets ch as the action listener for the Add button
        // Create the Subtract button
        btnSubtract = new Button();
        btnSubtract.setText("Subtract");
        btnSubtract.setOnAction(ch);//This statement sets ch as the action listener for the Subtract button
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

    private class ClickHandler // The ClickHandler class is declared as an inner class by placing its 
            //declaration completely within the AddSubtract2 class
            implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent e) // The handle method here is identical to the handle method in the 
        //AddSubtract1 program but resides in the inner class 
        {
            if (e.getSource() == btnAdd) {
                iCounter++;
            } else {
                if (e.getSource() == btnSubtract) {
                    iCounter--;
                }
            }
            lbl.setText(Integer.toString(iCounter));
        }
    }
}
