/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter1;

/**
 *
 * @author Sean
 */
public class Notes {
    /*
    Using the File Class
    
The File class is your key to processing files and directories
A file object represents a single file or directory.
The File class is in the java.io package, so any program that uses it should 
import java.io.File or java.io.*    


    Creating a File object
To create a File object, you call the File constructor, passing a string representing the filename as a parameter. Here’s an example:
File f = new File("hits.log"); so as we can see the file name is hits.log 
you can also hard code the path for this file within the file name...
String path = "c:\\logs\\hits.log";

    Creating a file
Creating a File object doesn’t create a file on the hard drive
To find out if the file exist on the hard drive you can use the exist method;
File f = new File(path);
if (!f.exists())
 System.out.println
 ("The input file does not exist!");
an error message will appear if the file doesnt exist 
To create a new file on the hard drive, create a File object with the filename you 
want to use and then use the createNewFile method
File f = new File(path);
if (f.createNewFile())
 System.out.println("File created.");
else
 System.out.println("File could not be created.");
This method will return true if the file has been created and false if the file is already there 



    Getting information about a file
Several of the methods of the File class simply return information about a file or 
directory
You can also see if the file is there or not, is read only or how long the file has been there 
To get just the filename, use the getName method(this is just the fle name and not the path) 
To get the path that was specified to create the File object (such as \logs\
hit.log), use the toString method instead
To get the full path for a file use the getCannonicalPath method


    Getting the contents of a directory
A directory is a file that contains a list of other files or directories
To check if a file object is a directory you can call the isDirectory method
it will return a boolean if it is a directory or not and then call a array 
of the files by using listFiles 
if a path name is stored as a string  veriable use the following to get the name:
File dir = new File(path);
if (dir.isDirectory())
{
 File[] files = dir.listFiles();
 for (File f : files)
 System.out.println(f.getName());
}
the following code will show only files and not directories and not hidden files:
File dir = new File(path);
if (dir.isDirectory())
{
 File[] files = dir.listFiles();
 for (File f : files)
 System.out.println(f.getName());
}


    Renaming files
You can rename a file by using the renameTo method    
It will return a boolean to say that it has been change true if yes false if no    
File f = new File("hits.log");
if (f.renameTo(new File("savedhits.log")))
 System.out.println("File renamed.");
else
 System.out.println("File not renamed.");    
depending on the operating system the renameTo method can also move one file to another place     
File f = new File("logs\\hits.log");
if (f.renameTo(new File("savedlogs\\hits.log")))
 System.out.println("File moved.");
else
 System.out.println("File not moved.");    
the code above moved the files from hits.log to a folder savedlogs     
alwayse test your renameTo.     
    
    Deleting a file
To delete a file, create a File object for the file and then call the delete method, 
as in this example:
File f = new File("hits.log");
if (f.delete())
 System.out.println("File deleted.");
else
 System.out.println("File not deleted.");    
the files directory must be emptied to be deleted     
With some recursive programming, you can create a method that deletes a non-empty directory    
The method looks 
something like this:
private static void deleteFile(File dir)
{
 File[] files = dir.listFiles();
 for (File f : files)
 {
 if (f.isDirectory())
 deleteFile(f);
 else
 f.delete();
 }
 dir.delete();
}
Then, to delete a folder named folder1 along with all its files and subdirectories, 
call the deleteFile method:
deleteFile(new File("folder1");    
 

    Using Command-Line Parameters
since chapter 1 we have been using;
public static void main(String[] args)
Now the "args" stands for an array of strings that lets you access any 
command-line parameters for the person that runs the pprogram. 
Suppose that you run a Java program named Test from a command program like 
this:
C:\>java Test the quick brown fox
Java now passes four parameters(The words) you can acces them via the args 
uppose that the main method of the Test class is written like this:
public static void main(String[] args)
{
 for (String s : args)
 System.out.println(s);
}
the return will then be
the
qouick
brown
fox



    Choosing Files in a Swing Application
For the most part, you don’t want to mess around with command-line parameters 
in Swing applications. Instead, you want to use the JFileChooser class to let 
users pick the files they want to work with
The important thing to know about the JFileChooser class is that it doesn’t 
actually open or save the file selected by the user; instead, it returns a File object 
for the file the user selects
The JFileChooser class has many additional methods that you can use to tailor 
its appearance and behavior in just about any way imaginable



    Creating an Open dialog box
First, you call the JFileChooser constructor to create a JFileChooser instance; 
then you call the showOpenDialog method to display an Open dialog box.
as seen like this.
JFileChooser fc = new JFileChooser();
int result = fc.showOpenDialog(this);    
If you don’t pass a parameter to the constructor, the file chooser starts in the 
user’s default directory    
if you want to start the file in another directory you have 2 options 
     Create a File object for the directory and then pass the File object to the 
     constructor or,
     Pass the pathname for the directory where you want to start to the constructor.
The JFileChooser class also includes methods that let you control the appearance 
of the chooser dialog box. You can use the setDialogTitle method to set the title
You can use the setFileHidingEnabled method to control whether hidden files are shown
If you want to allow the user to select more than one file,use the 
setMultiSelectionEnabled method
A setFileSelectionMode method lets you specify whether users can select files, 
directories, or both. explain below. 
JFileChooser.FILES_ONLY: With this option (which is the default), the user can choose files only with the 
file-chooser dialog box the user can navigate directories but cant actually select them 
JFileChooser.DIRECTORIES_ONLY: With this option, the user can select only directories, not files
JFileChooser.FILES_AND_DIRECTORIES: This option lets the user select 
either a file or a directory for most apps the it is best if the user picks one or the other 
In addition to an Open dialog box, you can display a Save dialog box by calling the 
showSaveDialog method.


    Getting the selected file
The file-chooser dialog box is a modal dialog box.
You can find out which button the user clicked by inspecting the value returned by 
the showOpenDialog method:
If the user clicked Open, the return value is JFileChooser.APPROVE_OPTION.
If the user clicked Cancel, the return value is JFileChooser.CANCEL_OPTION.
If an I/O (input/output) or other error occurred, the return value is 
JFileChooser.ERROR_OPTION.
Assuming that the showOpenDialog method returns APPROVE_OPTION, you can use 
the getSelectedFile method to get a File object for the file selected by the user.
then you can use the file object somewhere else in the program to read and write data 
here we are using a if statement to show if the user chose something and if the didnt or there is an 
error it will then return null
private File getFile()
{
 JFileChooser fc = new JFileChooser();
 int result = fc.showOpenDialog(null);
 File file = null;
 if (result == JFileChooser.APPROVE_OPTION)
 file = fc.getSelectedFile();
 return file;
}
You can call this method from an action event handler when the user clicks a 
button

    Using file filters
The file-chooser dialog box includes a Files of Type drop-down list filter that the 
user can use to control what types of files are displayed by the chooser
by default the only thing that will be there  is the all files dropdown 
that doesnt fillter the files but if you want to you must create a class 
extends the FileFilter abstract class and then pass an instance of this class to 
the addChoosableFileFilter method
FileFilter only hass two methodss you need to implement and that is 
public boolean abstract accept(File f);
You must implement this method to return true if you want the file to be 
displayed in the chooser or false if you don’t want the file to be displayed.
public String abstract getDescription();
You must implement this method to return the description string that is 
displayed in the Files of Type drop-down list in the chooser dialog box
Here’s a FileFilter class that displays files with the extension .java:
private class javaFilter
 extends javax.swing.filechooser.FileFilter
{
 public boolean accept(File f)
 {
 if (f.isDirectory())
 return true;
 String name = f.getName();
 if (name.matches(".*\\.java"))
 return true;
 else
 return false;
 }
 public String getDescription()
 {
 return "Java files (*.java)";
 }
}
    

    Using Path Objects
The path class helps by pointing out errors, ass the File class doesnt
give a detailed discription of where the error is eg,
if a file needs to  be deleted the Files class returns a boolean to say it has or has not
been deleted but with the Path class it is more detailed to say why the file could not have been 
deleted 
Note that Path is not actually a class; instead, it’s an interface. That means you can’t 
directly create a Path object by calling a constructor. Instead, you use a method 
of new class called Paths to create Path objects.
Both the Path interface and the Paths class are in the java.nio.File package, so 
any program that uses them should import java.nio.file.*.


    Creating files with the Paths class
Path and Paths are two distinct things 
Path is an interface
Paths is a class
To create a Path object, use the get method of the static Paths class, like this:
Path p = Paths.get("c:\\test.txt");
To create a new file, use the createFile method, like this:
Path p = Paths.get("c:\\test.txt");
try
{
 p.createFile();
 System.out.println ("File created!");
}
catch (Exception e)
{
System.out.println ("Error: " + e.getMessage());
}
if a file couldnt be created it thrrows an exeption 
The getMessage method of this exception returns a message that explains 
why the file couldn’t be created.



    Getting the contents of a directory
One of the weaknesses of the File class is that it doesn’t deal well with large directories. 
In particular, methods such as listFiles that allow you to access the 
contents of a directory return an array of File objects
But what if it is thousands of files in a directory, the File class is not scalable to  this 
The Path class remedies this deficiency by letting you access the contents of a 
directory via a stream object defined by DirectoryStream
You can acces the directory using an inhanced for method.
Path c = Paths.get("C:\\");
try
{
 DirectoryStream<Path> stream
 = c.newDirectoryStream();
 for (Path entry: stream)
 System.out.println(entry.toString());
}
catch (Exception e)
{
 System.out.println("Error: " + e.getMessage());
}
This example displays a listing of the contents of the C:\ directory
You can change the example to show just the txt files but changing the statement
after the try statement;
by changing the first statement after the try statement to this:
 DirectoryStream<Path> stream
 = c.newDirectoryStream("*.txt")


    Using a File Visitor to Walk a File Tree
walking the file tree — visiting every file in the tree and calling 
one or more methods defined by a special class you create, called a file visitor
1)Create a file-visitor class, which is extended from FileVisitor or, more 
often, SimpleFileVisitor.
The SimpleFileVisitor class defines several methods that are called for 
every file in the file tree
2)In the file visitor, override one or more methods that are defined by the 
SimpleFileVisitor class.
These methods are where you write the code that you want to execute for 
every file visited when the directory tree is walked.
visitFile, which is called for every file in the file tree
visitFileFailed, which is called for every file that can’t be accessed 
(usually due to permissions issues)
preVisitDirectoryFailed, which is called for every directory that 
couldn’t be accessed
3)Create a Path object that indicates the starting point (that is, the root) of 
the file tree you want to walk.
If you want to visit all the files on your C: drive, for example, this path should 
point to C:\.
4)Call the walkFileTree method of the static Files class to process the files.
This method takes just two arguments: the Path object (which identifies the 
root of your file tree) and an instance of your file-visitor class












    
    
    */
}
