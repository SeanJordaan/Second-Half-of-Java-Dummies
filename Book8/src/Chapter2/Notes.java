/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

/**
 *
 * @author Sean
 */
public class Notes {
    /*
    Understanding Streams
A stream is simply a flow of characters to and from a program. The other end of 
the stream can be anything that can accept or generate a stream of characters, 
including a console window, a printer, a file on a disk drive, or even another 
program   
You can roughly divide the world of Java stream I/O into two camps:
1)Character streams: Character streams read and write text characters that 
represent strings.You can connect these text files to store data on the hardrive 
text files use special characters called delimiters to separate elements of the file
 A comma-delimited file uses commas to separate individual fields of data.
 A tab-delimited file uses tabs to separate fields.(Someone needs to explain this diffrently) 
2)Binary streams: Binary streams read and write individual bytes that represent 
primitive data types. You can connect a binary stream to a binary file to store binary data on a hard drive


    Reading Character Streams
To read a text file through a character stream, you usually work with the following classes:
1) File: The File class represents a file on the hard drive the ain reason for this class,
is to identify which file you want to read or right from 
2) FileReader: The FileReader class provides basic methods for reading data 
from a character stream that originates from a file it provides a method to let you 
read data one character at a ttime 
You can instead, you create a FileReader object to connect your 
program to a file and then pass that object to the constructor of the 
BufferedReader class, which provides more efficient access to the file
the fileReader class Creates a file reader from the specified File object
3)BufferedReader: This class “wraps” around the FileReader class to provide 
more efficient input.. This hellps the program work faster, because it reads big chunks 
of data and not a byte at a time. the bufferReader extends the reader class 


    Creating a BufferedReader
The normal way to connect a character stream to a file is to create a File object 
for the file.
Then you can call the FileReader constructor to create a FileReader object and pass this 
object to the BufferedReader constructor to create a BufferedReader object
File f = new File("soccer.txt");
BufferedReader in = new BufferedReader(
 new FileReader(f));
Here a BufferedReader object is created to read the soccer.txt file*.

    
    
    Reading from a character stream
To read a line from the file, you use the readLine method of the BufferedReader
class.    
After you read a line of data from the file, you can use Java’s string-handling 
features to pull individual bits of data out of the line    
In particular, you can use the 
split method to separate the line into the individual strings that are separated 
by tabs.    
Here’s a routine that converts a line read from the soccer.txt file to the title 
(a string), year (an int), and price (a double):
String[] data = line.split("\t");
String title = data[0];
int year = Integer.parseInt(data[1]);
double price = Double.parseDouble(data[2]);
After the entire file is read, you can close the stream by calling the close method.
in.close();    
    
    
Writing Character Streams
    
The usual way to write data to a text file is to use the PrintWriter class
As a result,the only real trick to writing output to a text file is figuring out how to connect a 
print writer to a text file. To do that use the codes below
     1)FileWriter
        The FileWriter class connects to a File object but provides 
        only rudimentary writing ability.
     2)BufferedWriter
       This class connects to a FileWriter and provides output 
       buffering. Without the buffer, data is written to the hard drive one character at a time.
     3) PrintWriter
    This class connects to a Writer, which can be a Buffered
    Writer, a FileWriter, or any other object that extends the abstract Writerclass
    
   
Connecting a PrintWriter to a text file
    
To connect a character stream to an output file, you first create a File object for 
the file,then you call the PrintWriter constructor to create a PrintWriter object 
that you can use to write to the file
Both the FileWriter and the PrintWriter classes have an optional boolean
parameter you can use to add extra capabilities to the file stream. If you specify 
true in the FileWriter constructor, the file is appended if it exists
If you specify false instead of true, or if you leave this parameter out, an existing 
file is deleted, and its data is lost.

    
Writing to a character stream
    
After you successfully connect a character stream to a file, writing data to it is as 
easy as writing text to the console. You just use the print and println methods 
exactly as though you were writing to the console.
If you didn’t specify the flush option when you created the PrintWriter object, 
you can still periodically force any data in the buffer to be written to the hard drive 
by calling the flush method, as follows:
    out.flush();
Also, when you’re finished writing data to the file, you can close the file by calling 
the close method, like this:
    out.close();

    
Writing the movies.txt file

view listing 2.2 WriteFile
The data written is taken from an array that’s hard-coded into the file,   

    
Reading Binary Streams
    
Binary streams, used to store data in raw binary format rather than in text format and 
are a bit tougher to read than character streams.
 The biggest obstacle to pass 
when you’re reading a binary stream is that you need to know exactly the type 
of each item that was written to the file. If any incorrect data is in the file, the 
program won’t work
To read a binary file you usally work with these classes 
    1)File
        Once again, you use the File class to represent the file itself
    2)FileInputStream
        FileInputStream is what connects the input stream to a file
    3)BufferedInputStream
        To improve effincitcy add this to the FileInputStream
    4)DataInputStream
        This class is the one you actually work with to read data 
        from the stream. The other Stream classes read a byte at a time. T

    
Creating a DataInputStream
    
To read data from a binary file, you want to connect a DataInputStream object to 
an input file. 
To do that you use a File object to represent the file, a FileInput
Stream object that represents the file as an input stream, a BufferedInputStream
object that adds buffering to the mix, and finally a DataInputStream object to 
provide the methods that read various data types
    
    
Reading from a data input stream
    
With binary files, you don’t read an entire line into the program and parse it into 
individual fields. Instead, you use the various read methods of the DataInput
Stream class to read the fields one at a time.
To do that, you have to know the 
exact sequence in which data values appear in the file.
After you read a line of data from the file, you can use Java’s string-handling features to pull individual bits of data out of the line. 
In particular, you can use the split method to separate the line into the individual strings that are separated by tabs
    
    
Reading the movies.dat file

Go to listing 2.3 ReadBinary
This program reads the movies.dat file; creates a Movie object for each 
title, year, and price value; and prints a line on the console for each movie.  

    
Writing Binary Streams
    
To write data to a binary file, you use the following classes: 
1)FileOutputStream: The FileOutputStream class connects to a File object 
  and creates an output stream that can write to the file. This output stream is limited in its capabilities
2)BufferedOutputStream
  This class connects to a FileOutputStream and adds output buffering
3)DataOutputStream
  This class adds the ability to write primitive data types and strings to a stream
  

    
Creating a DataOutputStream
    
Creating a DataOutputStream object requires yet another one of those crazy 
nested constructor things
The FileOutputStream class has an optional boolean parameter that you can use 
to indicate that the file should be appended if it exists.    
    
  
Writing to a binary stream
    
After you successfully connect a DataOutputStream to a file, writing data to it is 
simply a matter of calling the various write methods to write different data types 
to the file    
If you included the BufferedOutputStream class in the stream, it accumulates 
data in its buffer until it decides to write the data to the hard drive. If you want, 
you can force the buffer to be written to the hard drive by calling the flush
method   
    
Writing the movies.dat file

Go to listing 2.4 Write binary file     
    
    
    
     
    
    
    
    
    
    
    
    
     
    
    
    
    
    
    
    
    
     
    
    
    
    
    
    
    
    
     
    
    
    
    
    
    
    
    
    
    
    
    */
}
