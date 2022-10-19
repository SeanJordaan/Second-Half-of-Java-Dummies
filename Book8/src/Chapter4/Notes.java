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
    
Using JDBC to Connect to a Database
    
JDBC — Java Database Connectivity — is a Java feature that lets you connect to 
almost any relational database system, execute SQL commands, and process 
the results, all from within a Java program.    

    
Setting Up a Driver

Before you can write a Java program to access a database via JDBC, you must 
first install a driver that links Java’s database API classes to an actual database    


Connecting to a Database

Before you can use JDBC to access a SQL database, you must first establish a 
connection to the database. The first step to establishing a connection involves 
registering the driver class so the class is available. To do that, use the forName
method of the Class class, specifying the package and class name of the driver    
You do it like this
    Class.forName("com.mysql.jdbc.Driver");
Note that the forName method throws ClassNotFoundException, so you have to 
enclose this statement in a try/catch block that catches ClassNotFoundException.
After you register the driver class, you can call the static getConnection method of 
the DriverManager class to open the connection
where subprotocol is mysql for a MySQL database and odbc for an ODBC driver. 
The subname is the database name. For a MySQL database, this can be a complete 
URL, but for a database on your own computer, just specify //localhost/ plus the 
name of the database
The user and password parameters must also be valid for the database server 
you’re using. To test the password you can use the same one you used when installing MySql 
the getConnection method throws SQLException, so you need to 
enclose it in a try/catch block statement that catches this exception
Ti use sql in your code you need to import sql
    import.java.sql.*;
    
    
Querying a Database
    
After you establish a connection to a database, you can execute select statements 
to retrieve data, you have to use servral classes and interfaces to do so 
1)Connection
    The Connection class has two methods you’re likely to use. The 
    close method closes the connection, and the createStatement method 
    returns a Statement object
2)Statement
    The Statement interface contains the methods necessary to send 
    statements to the database for execution and return the results. In particular, 
    you use the executeQuery method to execute a select statement or the 
    executeUpdate method to execute an insert, update, or delete statement.
3)ResultSet
    The ResultSet interface represents rows returned from a query.
   
    
Executing a select statement
    
The following snippet executes a select statement and gets the result set:
    Statement s = con.createStatement();
    String select = "Select title, year, price "
     + "from movie order by year";
    ResultSet rows = s.executeQuery(select);
Here the result set is stored in the rows variable    
    
    
Navigating through the result set
    
The ResultSet object returned by the executeQuery statement contains all the 
rows that are retrieved by the select statement. You can access only one of those 
rows at a time. The result set maintains a pointer called a cursor to keep track of 
the current row  
    
    
    
    
Go to the listing     
    
    
Updating SQL Data
    
Besides executing select statements, you can also use a Statement object 
to execute insert, update, or delete statements as well. To do that, call the 
executeUpdate method instead of the executeQuery method. This method 
returns an int value that indicates how many rows were updated    
While you’re testing database code that executes SQL statements constructed from 
strings like this, throw in a System.out.println call to print the statement to the 
console. That way, you can verify that the statement is being created properly    
    
    
    
Using an Updatable RowSet Object
    
If you’re using a newer JDBC driver (one that supports JDBC 2.0 or later), you have 
another option for updating data: with an updatable result set. With an updatable 
result set, you can change data in a result set row, add a row to the result set, or 
delete a row from the result set.   
To create an updatable result set, you must specify the ResultSet.CONCUR_
UPDATABLE field on the createStatement method when you create the Statement
object
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    */
}
