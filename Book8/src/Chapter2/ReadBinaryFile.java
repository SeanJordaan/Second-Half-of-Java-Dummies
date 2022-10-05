/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

/**
 *
 * @author Sean
 */
import java.io.*;
import java.text.NumberFormat;

public class ReadBinaryFile {

    public static void main(String[] args)// →5 he main method is intentionally kept simple so that it can focus on controlling the flow of the program rather than doing the detail work of accessing 
                                          //the file. As a result, it calls a method named getStream to get a data input 
                                          //stream object to read the file. Then it uses a while loop to call a method 
                                          //named readMovie to get a movie object. If the Movie object isn’t null, the 
                                          //movie’s data is printed to the console. Finally, when the loop ends, a method 
                                          //named closeFile is called to close the file
    {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        DataInputStream in = getStream("movies.dat");
        boolean eof = false;
        while (!eof) {
            Movie movie = readMovie(in);
            if (movie == null) {
                eof = true;
            } else {
                String msg = Integer.toString(movie.year);
                msg += ": " + movie.title;
                msg += " (" + cf.format(movie.price) + ")";
                System.out.println(msg);
            }
        }
        closeFile(in);
    }

    private static DataInputStream getStream(String name)// →25 The getStream method creates a DataInputStream object for the filename 
                                                        //passed as a parameter. If any exceptions are thrown, the program exits
    {
        DataInputStream in = null;
        try {
            File file = new File(name);
            in = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream(file)));
        } catch (FileNotFoundException e) {
            System.out.println("The file doesn't exist.");
            System.exit(0);
        }
        return in;
    }

    private static Movie readMovie(DataInputStream in) //→42 The readMovie method reads the data for a single movie and creates a 
                                                        //Movie object. If the end of the file is reached, the method returns null.
    {
        String title = "";
        int year = 0;;
        double price = 0.0;;
        try {
            title = in.readUTF();
            year = in.readInt();
            price = in.readDouble();
        } catch (EOFException e) {
            return null;
        } catch (IOException e) {
            System.out.println("I/O Error");
            System.exit(0);
        }
        return new Movie(title, year, price);
    }

    private static void closeFile(DataInputStream in) //→64 The closeFile method closes the input stream.
    {
        try {
            in.close();
        } catch (IOException e) {
            System.out.println("I/O Error closing file.");
            System.out.println();
        }
    }

    private static class Movie //→76  As in the other programs in this chapter, the Movie class is defined as a 
                                //private inner class.
    {

        public String title;
        public int year;
        public double price;

        public Movie(String title, int year, double price) {
            this.title = title;
            this.year = year;
            this.price = price;
        }
    }
}
