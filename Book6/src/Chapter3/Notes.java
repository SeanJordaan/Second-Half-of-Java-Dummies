/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter3;

/**
 *
 * @author Sean
 */
public class Notes {
    /*
    
    Setting the Stage and Scene Layout
    
    Specifically, this chapter introduces you to important details about the Stage class 
    and the Scene class to control if the window is rezisable or wether it has a max size 
    
    
    Examining the Stage Class
    
    A stage, which is represented by the Stage class, is the topmost container in 
    which a JavaFX user interface appears
    A reference to this stage is passed to the application’s start
    method via the primaryStage parameter:
        @Override public void start(Stage primaryStage)
        {
         // primaryStage refers to the
         // application's primary stage.
        }
    The primary stage initially takes on the default characteristics of a normal 
    windowed application depending on what you open the page with.(Wich depends on the opperating system) 
    The Stage class comes equipped with many methods that let you manipulate the 
    appearance and behavior of a stage
    The following points, point out some of the ins and outs of using the Stage class methods
    You need to use are setScene, setTitle, and show.
    1)Every stage must have a scene
    2)Every stage should have a title
    3)There’s not much point in creating a stage if you don’t intend on showing it 
      to the user.
    There are diffrent methods on changing to apperaanch of the window but the default way normaly works
    If you dont want the user to be able to resize the window use the method below
        primaryStage.setResizable(false);
    If you want the user to be able to resize the window you can set parrameters like below
        primaryStage.setResizable(true);
        primaryStage.setMinWidth(200);
        primaryStage.setMinHeight(200);
        primaryStage.setMaxWidth(600);
        primaryStage.setMaxHeight(600);
    If you want the window to be maxed use the method below
        primaryStage.setMaximized(true);
    There is also an option to have a full screen view(video or piture)
        primaryStage.setFullScreen(true);
    The initModality and initStyle methods are interesting because they 
    can be called only before you call the show method. 
    initModality-Allows you to create a dialog box 
    initStyle-Allows you  to create a default window with a label and a X button 
    
    
    Examining the Scene Class
    
    Like the Stage class, the Scene class is fundamental to JavaFX programs
    In every FX program there is at least one time you will use scene 
    to hold the ui controlls. 
    The following paragraphs explain some of the more interesting details of the 
    constructors and methods of the Scene class
    1)All the Scene class constructors require that you specify the root node
        You can change the root node later by calling the setRoot method
    2)The Parent class is actually 
      a subclass of the Node class, which represents a node that can have child nodes
    3) You can set the scene’s initial size when you create it by specifying the Width and Height parameters
        if you dont set the size then it wiill be determend what is out in the scene 
    4)You can retrieve the size of the scene via the getHeight and getWidth
    5)In general, the size of the scene determines the size of the stage
        provided that that scene is not smaller than the minimum size specified for 
        the stage or larger than the maximum size
    6)If the user resizes the stage, the size of the scene is resized accordingly
        
    
    
    Switching Scenes
    
    The primary stage of a JavaFX program can only have one scene displayed at a time 
    But your program can create servral senes and then swap them around if need be 
    In order to change the scenes you will have to use the setSven method to do that
    Look at SceneSwitcher
    
    Creating an Alert Box
    
    JavaFX provides a simple means of displaying a basic message box by using 
    the Alert class.
    The AlertType parameter lets you specify one of several types of Alert dialogs:
    1)AlertType.CONFIRMATION, which prompts the user to confirm an action.
    2) AlertType.ERROR, which display an error message
    3) AlertType.INFORMATION, which displays an information dialog box
    4)AlertType.WARNING, which displays a warning message.
    5)AlertType.NONE, which display a generic alert dialog.
    code that displays a simple informational message using the Alert class:
        Alert a = new Alert(Alert.AlertType.INFORMATION, "You have clicked once.");
        a.showAndWait();
    You can control what buttons appear on the Alert box by using the optional 
    ButtonType parameter. You can choose from among the following types of buttons:
    ButtonType.APPLY
    ButtonType.CANCEL
    ButtonType.CLOSE
    ButtonType.FINISH
    ButtonType.NEXT
    ButtonType.NO
    ButtonType.OK
    ButtonType.PREVIOUS
    ButtonType.YES
    You can put more than one button in a alert
    Alert a = new Alert(Alert.AlertType.INFORMATION, "Are you certain?",
        ButtonType.YES, ButtonType.NO)
    In this example, the Alert box will include both a YES and a NO button.
    To determine which button the user clicked, you must test the value returned by the showAndWait method
    Here’s an example that determines whether the user clicked the YES button:
        Alert a = new Alert(Alert.AlertType.INFORMATION, "Are you certain?",
         ButtonType.YES, ButtonType.NO);
        Optional<ButtonType> r = a.showAndWait();
        if (r.isPresent() && r.get() == ButtonType.YES)
        {
         // The user clicked OK!
        }
    Go to ClickCounterAlert
    This one is almost the same as the one in chapter 2 but thwere are 2 diffrences 
    1)No label is defined in this program because a message box, not a label, is 
    used to display the number of times the button has been clicked.
    2)In the buttonClick method of the Chapter 2 version, the label’s setText
    method was called to display the number of times the button has been 
    clicked. In this version, an Alert box is used instead.
    
    Exiting the Stage 
    
    There’s a right way and a wrong way to exit the stage.
    Most programs we have been exiting we used  the X button but that is actually incorrect
    In most cases, the correct way to exit a program involves the following details:
    1)Adding a button, menu command, or other way for the user to signal 
      that she wishes to close the program
        Many programs include a button labeled Exit or Close
    2) Optionally displaying a confirmation box that verifies whether the 
       user really wants to close the program
        Like when you click the X and it asks are you  sure
        You use ConfirmationBox for that and normally when someone has made changes to a document and 
        it needs to  be saved to a database 
    3)If the user really does want to close the program, the program should 
      perform any necessary clean-up work
            Saving changes to documents, databases, or other files.
            Properly closing databases and other resources
    4)After you’ve done any necessary clean-up work, you can close the 
      application by calling the primary stage’s close method.
    5)After you’ve done any necessary clean-up work, you can close the 
      application by calling the primary stage’s close method.
    
    
    Creating a Close button
    
    To add a button or other user-interface element that allows the user to close the 
    button, all you have to do is provide an action event handler that calls the stage’s 
    close method.
    To call the closing stage use the code below
        Button btnClose = new Button();
        btnClose.setText("Close");
        btnClose.setOnAction( e -> primaryStage.close() );
    If you want the stage to do more you can connect the button to an event handler 
    like so:
        btnClose.setOnAction( e -> btnClose_Clicked());
    Because the btnClose_Clicked method will need to access the primary stage to 
    close it, you need to define a class field of type Stage
    To be able to do that use the code below
        private void btnClose_Click()
        {
         boolean reallyQuit = false;
         reallyQuit = ConfirmationBox.show(
         "Are you sure you want to quit?",
         "Confirmation",
         "Yes", "No");
         if (reallyQuit)
         {
         // Perform cleanup tasks here
         // such as saving files or freeing resources
         stage.close();
         }
        }
    
    
    Handling the CloseRequest event
    
    Providing a Close button is an excellent way to allow your users to cleanly exit 
    from your program
    Whenever the user attempts 
    to close the window within which a JavaFX stage is displayed, JavaFX generates a 
    CloseRequest event, which is sent to the stage. You can provide an event handler 
    for this event by calling the setOnCloseRequest method of the Stage class. Then, 
    the event handler is called whenever the user tries to close the window.
    You can set an event handler to act the same as if the person was closing the window
    with the X or with the button using the code below
    btnClose.setText("Close");
    btnClose.setOnAction( e -> btnClose_Click () );
    primaryStage.setOnCloseRequest( e -> btnClose_Click () );
    
    
    Putting it all together
    
    Now that you know how to add a Close button to a scene and how to handle the 
    CloseRequest event, I look at a program that puts together these two elements to 
    demonstrate the correct way to exit a JavaFX program
    SO  the next listing (that doesnt work in netbeans) shows the code for the click counter 
    it puts it all in together. 
    When a person closes a program the can close it but its best to stage these closes because the person must be asked if they sure
    they want to close this program.
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    */
}
