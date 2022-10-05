/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter3;

/**
 *
 * @author Sean
 */
import java.io.File; //This import statement is required to use the File class.
import java.util.Scanner;

public class DirList {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print(
                "Welcome to the Directory Lister");
        do {
            System.out.print("\nEnter a path: ");
            String path = sc.nextLine(); //A Scanner object is used to get the pathname from the user
            File dir = new File(path);//The pathname is passed to the File class constructor to create a new File object
            if (!dir.exists() || !dir.isDirectory())//The exists and isDirectory methods are called to make sure that the 
                                                    //path entered by the user exists
            {
                System.out.println(
                        "\nThat directory doesn't exist.");
            } else {
                System.out.println(
                        "\nListing directory tree of:");
                System.out.println(dir.getPath()); //  If the user entered a good path, the getPath method is called
                listDirectories(dir, " "); //   The listDirectories method is called to list all the subdirectories
            }
        } while (askAgain());//The user is asked whether he wants to list another directory 
                             //if the person says yes the loop runs again 
    }

    private static void listDirectories(/*
            This line is the start of the listDirectories method. This method takes 
            two parameters: a File object representing the directory to be listed 
            and a String object that provides the spaces used to indent each line of 
            the listing. When this method is first called from the main method, the 
            indentation is set to two spaces by a string literal
            */
            File dir, String indent) {
        File[] dirs = dir.listFiles();//The listFiles method is called to get an array of all the File objects
        for (File f : dirs)//An enhanced for loop is used to process all the File objects in the array
        {
            if (f.isDirectory())// This if statement checks to see whether a file is a directory rather than a file.
            {
                System.out.println(
                        indent + f.getName());//If the File object is a directory, the indentation string is printed,
                listDirectories(f, indent + " ");//the listDirectories method is called recursively to list the 
                                                 //contents of the f directory
            }//use comment below to test
        }//C:\Users\Sean\OneDrive - Reboss\Desktop\Coding\Java\NetBeansProjects\Book5\build\classes\Chapter3
    }

    private static boolean askAgain() {
        System.out.print("Another? (Y or N) ");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y")) {
            return true;
        }
        return false;
    }
}
