/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter6;

/**
 *
 * @author Sean
 */
public class Notes {
    /*
    
    
    Choosing from a List
    
    An entire category of JavaFX controls are designed to let the user choose one 
    or more items from a list
    This chapter presents three such controls: choice boxes, combo boxes, and lists
    Actually, if you’ve read along so far, you’ve already been briefly introduced to the 
    ObservableList interface, as it’s also used to manage the list of controls that are 
    displayed in a layout pane.
    You also discover how to add an event listener that can respond when the user 
    changes the current selection
    
    Using Choice Boxes
    
    A choice box is a control that lets the user choose an item from a drop-down list. 
    Initially, the choice box shows just the item that’s currently selected
    You use the ChoiceBox class to create choice boxes
    
    Creating a choice box
    
    Creating a choice box is easy. The ChoiceBox class is generic, so specify a type for 
    the list that will be associated with the choice box. For example:
        ChoiceBox<String> choice = new ChoiceBox<String>();
    Yoou can add items to a choice box using a .add method or you can 
    use the .addAll method for less lines of code to wright 
    so to see these items you use the getItem method that will return the object 
    in the Observeable list
    You can add any kind of object you want to a choice box. The choice box calls the 
    toString method of each item to determine the text to display in the choice list.
    
    
    Setting a default value
    
    By default, a choice box has no initial selection when it’s first displayed. To set an 
    initial value, call the setValue method, passing it the list object that you want to 
    make the initial selection
    
    Getting the selected item
    
    You can call the getValue method to get the item selected by the user. The type of 
    the value returned depends on the type specified when you created the choice box
    For example, if you specified type String, the getValue method returns strings. 
    The getValue method is often used in the action event handler for a button
    
    
    Working with Observable Lists
    
    As you saw in the previous section, the ChoiceBox class does not include methods 
    that let you directly add or remove items from the list displayed by the choice 
    box. Instead, it includes a method named getItems that returns an object of type 
    ObservableList. The object returned by this method is an observable list; 
    it represents the list displayed by the choice box.
    To work with the items displayed by a choice box, you must first access the 
    observable list and then use methods of the ObservableList class to access the 
    individual items in the list
    Observable lists are also used by layout panes, such as HBox and VBox
    The ObservableList class extends the List class, which is implemented by 
    classes, such as ArrayList and Vector
    
    
    
    Listening for Selection Changes
    
    It’s not uncommon to want your program to respond immediately when the user 
    changes the selection of a choice box or other list control, without waiting for 
    the user to click a button to submit the data.
    So in order to change whats happening on a list/check boxes 
    you need to use an action event listener and cannot just use setOnAction 
    you will have to use change listner and you use that in the following sequence 
    1)Get the selection model by calling the getSelectionModel method on the 
      choice box.
    2)Get the selectedItem property by calling the selectedItemProperty
      method on the selection model
    3)Add a change listener by calling the addListener method on the selected
     Item property.
    You normally do all three of these steps in a single statement, as in this example:
        choice.getSelectionModel().selectedItemProperty()
         .addListener( (v, oldValue, newValue) ->
         lbl.setText(newValue); );
    In the preceding example, the change listener sets the value displayed by a label 
    control to the new value selected by the user.
    Being a functional interface, ChangeListerner defines a single function named 
    changed, which is called whenever the value of the property changes. The changed
    method receives three arguments:
        1)observable: The property whose value has changed
        2)oldValue: The previous value of the property
        3)newValue: The new value of the property
    These three parameters are specified in the parentheses at the beginning of the Lambda expression
    
    
    Using Combo Boxes
    
    A combo box is a more advanced sibling to the choice box control. The main 
    improvements you get with a combo box are
    1)A combo box includes the ability to limit the number of items displayed 
      when the list is shown.
            If the number of items in the list exceeds the limit, a scroll bar is added automatically
    2)A combo box includes a text field that lets the user enter a value directly 
      rather than select the value from a list.
            The text field is optional and is not shown by default, but you can add it with a 
            single method call
    3)A combo box fires an action event whenever the user changes the selection
            Thus, setting up an event handler to respond to the user’s selection change is 
            easier with a combo box than it is with a choice box
    
    
    Creating combo boxes
    
    Creating a combo box is much like creating a choice box. Because the ComboBox is 
    generic, specify a type for the items it will contain, as in this example:
        ComboBox<String> cbox = new ComboBox<String>();
    Then you can use the getItems method to access the ObservableList object that 
    contains the content of the list displayed by the combo box
    By default, the user isn’t allowed to edit the data in the text field portion of the combo box. 
    To allow them to do it use the code below
      cbo.setEditable(true);
    To limmit the items they see on the list use the code blowe 
        cbo.setVisibleRows(10);
    To promt a text use setPromptText
        cbo.setPromptText("Make a choice");
    
    
    
    
    
    Getting the selected item
    
    To get the item selected by the user, use the getValue method, just as you do for 
    a choice box. You typically do that in an action event handler that responds to a 
    button click.
    Bear in mind that the value returned by the getValue method may not be one of 
    the values in the combo box’s list. That’s because the user can enter anything he 
    wishes to in the text field of an editable combo box
    
    Handling combo box events
    
    When the user selects an item from a combo box, an action event is generated. In 
    most applications, you simply ignore this event because you usually don’t need to 
    do anything immediately when the user selects an item.
    If you want to provide immediate feedback when the user selects an item, you can 
    set up an event handler by calling the combo box’s setOnAction method
    in most cases this is the easist way to set up an action to happen when something happens 
    
    
    
    Using List Views
    
    A list view is a powerful JavaFX control that displays a list of objects within a box. 
    Depending on how the list is configured, the user can select one item in the list or 
    multiple items. 
    List views and combo boxes have several important differences
    1)A list view doesn’t have a text field that lets the user edit the selected item. 
        Instead, the user must select items directly from the list view.
    2)The list view doesn’t drop down. 
      Instead, the list items display in a box whose size you can specify
    3)The items in a list view can be arranged vertically (the default) or horizontally
    4)List views allow users to select more than one item.
        So at default a list view only lets you choos one thing 
        but it can be easily manipulated so you can choose multipil objects 
        To select multiple items in a list, hold down the Ctrl key and click the items you 
        want to select. To select a range of items, click the first item, hold down the 
        Shift key, and click the last item
    
    
    Creating a list view
    
    Creating a list view control is similar to creating a combo box.
    As with a combo box, a scroll bar is automatically added to a list view if the 
    total number of items in the items collection cannot be displayed.
    To add multipile selections add the line below
        list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    To arrange the list view horizontally rather than vertically, add this line:
        list.setOrientation(Orientation.HORIZONTAL);
    
    
    Getting the selected items
    
    Getting the selected items from a list view control is a bit tricky. First, you must 
    get the selection model object by calling the getSelectionModel. Then, you 
    call the selection model’s getSelectedItems method. This returns a list that is read only 
    
    
    Using Tree Views
    
    A tree view is a fancy JavaFX control that displays hierarchical data in outline form, 
    which we computer nerds refer to as a tree. Tree structures are very common in 
    the world of computers.
    A tree has a few eliments itself
    1)Node
        Each element in the tree is a node. Each node in a tree is created from 
        TreeItem class. The TreeItem class is a generic class, so you can associate a 
        type with it
    2)Root node
        A root node is the starting node for a tree. Every tree must have 
        one — and only one — root node. When you create a tree component, you 
        pass the root node to the TreeView constructor.
    3)Child node
        The nodes that appear immediately below a given node are that 
        node’s child nodes. A node can have more than one child.
    4)Parent node
        The node immediately above a given node is that node’s parent 
        node. Every node except the root node must have one — and only one — parent
    5) Sibling nodes
        Sibling nodes are children of the same parent.
    6) Leaf node
        A leaf node is one that doesn’t have any children
    7) Path
        A path contains the node and all its ancestors — that is, its parent, its 
        parent’s parent, and so on — all the way back to the root.
    8)Expanded node
        An expanded node is one whose children are visible
    9) Collapsed node
        A collapsed node is one whose children are hidden.
    
    
    Building a tree
    
    Before you can actually create a tree view, you must first build the tree it displays. 
    1)The value
        which contains the data represented by the node.
    2)The parent of this node
        unless the node happens to be the root.
    3)The children of this node
        represented as an ObservableList.
    You can take many approaches to building trees, most of which involve some recursive programming.
    The first step in creating a tree is declaring a TreeItem variable for each node that isn’t a leaf node
    These variables can be local variables within the start method because once you 
    get the tree set up, you won’t need these variables anymore.
    create the root node and set its expanded status to true so that it will 
    expand when the tree displays initially
    
    
    Creating a TreeView control
    
    You use the TreeView class to create a tree component that displays the nodes of a tree
    The first step in creating a TreeView control is declaring a TreeView variable as a 
    class instance variable so that you can access it in any method within your program, as follows:
        TreeView tree;
    Then, in the application’s start method, you call the TreeView constructor to 
    create the tree view control, passing the root node of the tree you want it to display as a parameter:
        tree = new TreeView(root);
    
    Getting the selected node
    
    There are several ways to determine which node or nodes are currently selected 
    in a tree view. One way is to access the tree’s selection model by calling the 
    getSelectionModel. Then, you can call the selection model’s getSelectedItems
    method to return a read-only observable list that contains the items that have 
    been selected.
    
    
    
    
    */
}
