/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter6;

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
public class SpinOffs extends Application
{
 public static void main(String[] args)
 {
 launch(args);
 }
 TreeView<String> tree;// →15  The tree and list models are defined as class instance variables.
 Label lblShowName;
 @Override public void start(Stage primaryStage)
 {
 TreeItem<String> root, andy, archie,// →20  TreeItem variables are defined for the root node and each show that has spinoff shows 
 happy, george, maude;
 root = new TreeItem<String>("Spin Offs");// →23   The root node is created with the text Spin-Offs
 root.setExpanded(true);
 andy = makeShow( //→26 These lines create the nodes for The Andy Griffith Show and its spinoffs.
 "The Andy Griffith Show", root);
 makeShow("Gomer Pyle, U.S.M.C.", andy);
 makeShow("Mayberry R.F.D", andy);
 archie = makeShow("All in the Family", root); //→31 These lines create the nodes for All in the Family and its spinoffs.
 george = makeShow("The Jeffersons", archie);
 makeShow("Checking In", george);
 maude = makeShow("Maude", archie);
 makeShow("Good Times", maude);
 makeShow("Gloria", archie);
 makeShow("Archie Bunker's Place", archie);
 happy = makeShow("Happy Days", root);// →39 These lines create the nodes for Happy Days and its spinoffs.
 makeShow("Mork and Mindy", happy);
 makeShow("Laverne and Shirley", happy);
 makeShow("Joanie Loves Chachi", happy);
 tree = new TreeView<String>(root);// →44  This line creates the TreeView control, specifying root as the root node 
                                  //for the tree. The next line hides the root node.
 tree.setShowRoot(false);
 tree.getSelectionModel().selectedItemProperty() //→46 This line creates the event listener for the selected item property. The 
                                                //Lambda expression causes the method named tree_Selection
                                                //Changed to be called whenever the selection status of the TreeView control changes
 .addListener( (v, oldValue, newValue) ->
 tree_SelectionChanged(newValue) );
 lblShowName = new Label();
 VBox pane = new VBox(10);
 pane.setPadding(new Insets(20,20,20,20));
 pane.getChildren().addAll(tree, lblShowName);// →54   The TreeView control and the label are added to a VBox layout pane, 
                                              //which is then added to the scene just before the stage is shown
 Scene scene = new Scene(pane);
 primaryStage.setScene(scene);
 primaryStage.setTitle("My Favorite Spin Offs");
 primaryStage.show();
 }
 public TreeItem<String> makeShow(String title,// →64   The makeShow method creates a node from a string and adds the node to 
                                              //the node passed as the parent parameter
 TreeItem<String> parent)
 {
 TreeItem<String> show = new TreeItem<String>(title);
 show.setExpanded(true);
 parent.getChildren().add(show);
 return show;
 }
 public void tree_SelectionChanged(TreeItem<String> item)// →73   The tree_SelectionChanged method is called whenever the selected 
                                                        //node changes. It simply displays the title of the selected show in the 
                                                        //lblShowName label, provided the passed TreeItem is not null.
 {
 if (item != null)
 {
 lblShowName.setText(item.getValue());
 }
 }
}
