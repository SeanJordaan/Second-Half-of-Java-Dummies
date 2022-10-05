/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter1;

/**
 *
 * @author Sean
 */
import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;

public class FileVisitorDemo {

    public static void main(String[] args) {
        Path start = Paths.get("c:\\Windows\\System32"); // Creates an instance of the Path class that starts the file tree at C:\Windows\
                                                         //System32. You could substitute any directory you want for this path.
                                                         //Soo it shows where the file is in the PC
        MyFileVisitor visitor = new MyFileVisitor();//Creates an instance of the MyFileVisitor class, thats defined on line 29
        try {
            Files.walkFileTree(start, visitor); //Walks the file tree, starting at the directory indicated by start using the 
                                                //fileVisitor object
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static class MyFileVisitor extends SimpleFileVisitor<Path> //Defines the MyFileVisitor class, which extends the SimpleFileVisitor class
                                                                       //The SimpleFileVisitor class is a generic class so you must specify the 
    {                                                                  //type usually you specify the Path type

        public FileVisitResult visitFile(Path file, // Overrides the visitFile method, which is called once for each file that 
                                                    //is accessed as the file tree is walked
                                                    //this method prints the file in the console 
                BasicFileAttributes attr) {
            System.out.println(file.toString());
            return FileVisitResult.CONTINUE;// Produces the return value of the visitFile method, which is of type 
                                            //FileVisitResult
                                            //the most commin return value is continue 
        }

        public FileVisitResult visitFileFailed(Path file, // Overrides the visitFileFailed method, which is called whenever a file 
                                                         //can’t be accessed and then prints an error message 
                BasicFileAttributes attr) {
            System.out.println(file.toString() + " COULD NOT ACCESS!");
            return FileVisitResult.CONTINUE;
        }

        public FileVisitResult preVisitDirectoryFailed //Overrides the preVisitDirectoryFailed method, which is called 
                                                       //whenever a directory can’t be accessed.
                                                       //and it will also just print a error mesage 
                (Path dir, IOException e) {
            System.out.println(dir.toString() + " COULD NOT ACCESS!");
            return FileVisitResult.CONTINUE;
        }
    }
}
