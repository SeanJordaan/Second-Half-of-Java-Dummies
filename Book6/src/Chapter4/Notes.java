/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter4;

/**
 *
 * @author Sean
 */
public class Notes {
    /*
    Using Layout Panes to Arrange Your Scenes
    
    Controlling the layout of components in a scene is often one of the most difficult aspects of working with JavaFX
    The pane determins how everything looks within the frame or panel 
    Layout panes are special classes whose sole purpose in life is to control the arrangement of the nodes that 
    appear in a scene.
    The trick to everything is to layout your scene in such a way that the panes work togehter
    with you and everything looks how you want it to look 
    
    
    Working with Layout Panes
    
    Understanding layout panes is the key to creating JavaFX frames that are attractive 
    and usable
    
    Introducing five JavaFX layout panes
    
    JavaFX provides many different layout panes for you to work with
    There are 5 in this chapter
    1)HBox
        This layout pane arranges nodes horizontally, one next to the other
    2)VBox
        This layout pane arranges nodes vertically, one above the other
    3)FlowPane
         This layout pane arranges nodes next to each other until it runs 
         out of room; then, it wraps to continue layout nodes
    4)Border
        This layout pane divides the pane into five regions: Top, Left, Center, 
        Right, and Bottom.When you add a node you have to specify where you  want it to be 
    5)GridPane
        This layout pane divides the pane into a grid, affording you 
        complete control of the arrangement of elements in rows and columns
    
    
    Creating layout panes
    
    The basic process of working with layout panes is simple. Here is the general 
    procedure for creating a layout node
    1)Create the controls or other nodes you want to add to the pane
        For example, if the layout pane will contain two buttons, you should create the two buttons
        You do this by using the code below
            Button btnOK = new Button();
            btnOK.setText("OK");
            btnOK.setOnAction( e -> btnOK_Click() );
            Button btnCancel = new Button();
            btnCancel.setText("Cancel");
            btnCancel.setOnAction( e -> btnCancel_Click() );
    2) Create a layout pane by calling its constructor.
        For example:
            HBox pane = new HBox();
    3)Fine-tune the optional settings used by the layout pane.
        Each type of layout pane has a unique assortment of optional parameters that 
        govern the details of how nodes are laid out within the pane
        E.g the HBox lets you set the number of pixels that are around the buttons 
            HBox.setSpacing(10);
    4)Add each of the nodes that will appear in the layout pane
        Each type of layout pane provides a method for adding nodes to the pane. For 
        the HBox pane, you must first call the getChildren method to get a list of all 
        the nodes that have been added to the pane. Then, you call the addAll
        method to add one or more nodes to the pane. Use the code below.
            pane.getChildren().addAll(btnOK, btnCancel);
    5)Create the scene, specifying the layout pane as the scene’s root node.
        e.g.
            Scene scene = new Scene(pane, 300, 400);
        In this example, pane is added as the root node for the scene

    Combining layout panes
    
    You can combine several layout panes to create layouts that are more complicated 
    than a single layout pane can provide example let say you want to create 
    a scene where there are horizontal and vertical buttons 
    To do that you need to put the buttons in the Vbox(vertical box) and then 
    the others in the HBox and use the Border Pane to split them both 
    Combinations like this are possible because all the layout panes inherit the base class javafx.scene.layout.Pane
    
    Using the HBox Layout
    
    The HBox class provides one of the simplest of all JavaFX’s layout managers: It 
    arranges one or more nodes into a horizontal row
    The HBox class is defined in the javafx.scene.layout package
    The easiest way to create an HBox is to first create the nodes that you want to place 
    in the HBox and then call the HBox constructor and pass the nodes as arguments. 
    For example:
        Button btn1 = new Button("Button One");
        Button btn2 = new Button("Button Two");
        Button btn3 = new Button("Button Three");
        HBox hbox = new HBox(btn1, btn2, btn3);
    If you prefer to create the HBox control in an initially empty state and later add the 
    controls, you can do so like this:
        HBox hbox = new HBox();
        Hbox.getChildren().addAll(btn1, btn2, btn3);
    Here, the getChildren method is called, which returns a collection
    of all the children added to the HBox pane
    
    
    Spacing Things Out
    
    By default, child nodes in a layout pane are arranged immediately next to one 
    another, with no empty space in between.
    You can add spaces in diffrent ways and those spacese are messured in pixels 
    1)Adding spacing between elements within the pane
    2)Adding padding around the inside edges of the pane
    3)Adding margins to the individual nodes in the pane
    4)Creating spacer nodes that can grow to fill available space
    
    
    Adding Space with Margins
    
    Another way to add space around the nodes in a layout pane is to create margins 
    around the individual nodes
    This way you  can target specific nodes and have full control over each one
    To create a margin, call the setMargin method for each node you want to add a 
    margin to
    The setMargin method accepts two parameters:
    1)The node you want to add the margin to
    2)An Insets object that defines the margins you want to add
    e.g
        HBox hbox = new HBox();
        hbox.setMargin(btn1, new Insets(10));
    Here’s an example that sets a different margin for each side of the pane:
        Hbox.setMargin(btn1, new Insets(10, 15, 20, 10));
    
    
    Using the VBox Layout
    
    The VBox class is similar to the HBox class but this is Vertical arrangements
    The VBox class is defined in the javafx.scene.layout package
    import javafx.scene.layout.*;
    Here’s an example that creates three buttons and uses a VBox to arrange them 
    into a column:
            Button btn1 = new Button("Button One");
            Button btn2 = new Button("Button Two");
            Button btn3 = new Button("Button Three");
            VBox vbox = new VBox(btn1, btn2, btn3);
    You can do the same but calling the getChildren() methed 
        VBox vbox = new VBox();
        Vbox.getChildren().addAll(btn1, btn2, btn3);
    Setting the spacing or margins within the VBox you can use it the same as you 
    did  in the HBox 
    
    
    Aligning Nodes in a Layout Pane

    Both the HBox and the VBox layout panes have a setAlignment method that lets 
    you control how the nodes that are contained within the pane are aligned with one 
    another. The setAlignment method accepts a single argument, which is one of the 
    constants defined by the Pos enumeration
    And Pos is defined in the import javafx.geometry.* packages
    After creating the buttons and then setting the spacing you can use
    vbox.setAlignment(Pos.CENTERED); to center the buttons in the VBox or HBox 
    
    Making Nodes the Same Width
    
    You can easily dictate that the buttons all have the same width by setting
    the maximum width of each of the buttons to Double.MAX_VALUE
    Heres some code-
    Button btn1 = new Button("Number One");
    Button btn2 = new Button("Two");
    Button btn3 = new Button("The Third Button");
    btn1.setMaxWidth(Double.MAX_VALUE);
    btn2.setMaxWidth(Double.MAX_VALUE);
    btn3.setMaxWidth(Double.MAX_VALUE);
    VBox vbox = new VBox(10, btn1, btn2, btn3);
    vbox.setPadding(new Insets(10));
    vbox.setAlignment(Pos.CENTERED);
    We first created the buttons 
    The we set the max width(wich is normally the word)to double that 
    Then the spacing marging to 10 pixels 
    The we align them and center them 
    Page 639
    
    
    Using the Flow Layout
    
    The flow layout comes in two flavors: horizontal and vertical
    Horizaontal-With the horizomtal flow it makes the nodes big enough to be next to each other and then puts them next to eachother
                and when the space runs out it starts a new row
    Vertical-This one works the same but obviosly from top to bottom 
    The FlowPane class is defined in the javafx.scene.layout package
        import javafx.scene.layout.*;
    The constructors for this class let you specify the horizontal and vertical gaps, 
    which provide the spacing between the horizontal and vertical elements of the layout
    To set the limit at which the flow layout wraps, you use the setPrefWrapLength method.
    horizontal flow layout works with the width
    vertical flow layout works with the length
    
    
    Using the Border Layout
    
    The border layout is a pane that is carved into five regions: Top, Left, Center, 
    Right, and Bottom
    You use the BorderPane class to create a border layout
    The BorderPane class is defined in the javafx.scene.layout package,
        import javafx.scene.layout.*;
    Here, three buttons are created and added to a VBox. Then, a border layout is 
    created, and the VBox is added to its center region.
        Button btn1 = new Button("Button One");
        Button btn2 = new Button("Button Two");
        Button btn3 = new Button("Button Three");
        VBox vbox = new VBox(btn1, btn2, btn3);
        BorderPane pane = new BorderPane();
        pane.setCenter(vbox);
    
    
    Using the GridPane Layout
    
    The grid pane layout manager lets you arrange GUI elements in a grid of rows and 
    columns. Unlike a tile pane, the rows and columns of a grid pane do not have to 
    be the same size. Instead, the grid pane layout automatically adjusts the width of 
    each column and the height of each row based on the components you add to the panel.
    some important features of the grid pane layou
    1)You can specify which cell you want each component to go in, and you can 
      control each component’s position in the panel.
    2)You can create components that span multiple rows or columns
    3)You can stretch components  You can specify that this stretching be done horizontally, vertically, or both.
    4)If a component doesn’t fill its allotted area, you can tell the grid pane layout 
      manager how you want the component to be positioned within the area
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    */
}
