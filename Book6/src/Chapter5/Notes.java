/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter5;

/**
 *
 * @author Sean
 */
public class Notes {
    /*
    
    Getting Input from the User
    
    In this chapter we disucs how to use labels and buttons and getting the user input from 
    there 
    first it willl be labels and controls then it going to be buttons and check boxes
    to get info from the user 
    
    Using Text Fields
    
    A text field is a box into which the user can type a single line of text. You create text 
    fields by using the TextField class
    The TextField class is defined in the javafx.scene.control package
        imports javafx.scene.control.*;    
    The most common way to create a text field is to call the constructor without 
    arguments, like this:
        TextField text1 = new TextField();
    To retrieve the value that the user has entered into a text field, call the getText
    method like this:
        String value = text1.getText();
    You can set minimum and maximum limits for the text field size by calling the 
    setMinWidth and setMaxWidth methods, and you can indicate the preferred width 
    via the setPrefWidth method, as in this example:
        TextField text1 = new TextField();
        text1.setMinWidth(150);
        text1.setMaxWidth(250);
        text1.setPrefWidth(200);
    
    Go to RolePlayer
    
    Validating Numeric Data
    
    You need to take special care if you’re using a text field to get numeric data from 
    the user. The getText method returns a string value
    To convert the value entered in a text box to an int, use the parseInt method:
        int count = Integer.parseInt(txtCount.getText());
    
    
    
    Using Check Boxes
    
    A check box is a control that the user can click to check or clear. Check boxes let 
    the user specify a Yes or No setting for an option.
    Strictly speaking, a check box can have three states: checked, unchecked, and 
    undefined. The undefined state is most often used in conjunction with a TreeView control.
    If you want, you can add event listeners to check boxes to respond to events
    generated when the user clicks those check boxes.
    To add this event listener to the Anchovies check box, call its setOnAction method, like this:
        chkAnchovies.setOnAction(e -> chkAnchovies_Click() );
    Add a listener to a check box only if you need to provide immediate feedback to the 
    user when she selects or deselects the box. In most applications, you wait until the 
    user clicks a button to examine the state of any check boxes in the frame.
    
    Using Radio Buttons
    
    Radio buttons are similar to check boxes, but with a crucial difference: They travel 
    in groups, and a user can select only one radio button at a time from each group. 
    When you click a radio button to select it, the radio button within the same group 
    that was previously selected is deselected automatically
    To work with radio buttons, you use two classes. First, you create the radio buttons themselves
    with the RadioButton class,
    A ToggleGroup object is simply a way of associating a set of radio buttons so that 
    only one of the buttons can be selected. The toggle group object itself is not a 
    control and is not displayed.
    he usual way to create a radio button is to declare a variable to refer to the button as a class variable
    so that it can be accessed anywhere in the class, as in this example:
        RadioButton rdoSmall, rdoMedium, rdoLarge;
    Then, in the start method, you call the RadioButton constructor to create the radio button:
        rdoSmall = new RadioButton("Small");
    Toggle groups have nothing to do with how radio buttons display. To display radio 
    buttons, you must still add them to a layout pane.
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    */
}
