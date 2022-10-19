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
    
    Database for $100, 
Please SQL stands for Structured Query Language.
It is a relational databyse it is the foundation of how java proceses databaeses
Java provides Java Database Connectivity (JDBC), which lets you formulate SQL 
statements, send them off to a database server, and process the results.

    
    
Defining a Relational Database
    
The term relational database is one of the most used and abused buzzwords in all 
of computerdom.
1)A database in which data is stored in tables
    Relationships can be established between tables based on common information.
    A database is devided into collums and these collums can serve as a connection between tables 
2)A database that is accessed via SQL
    IBM invented SQL to provide a practical way to access data stored in relational databases.

    
    
Understanding (and Pronouncing) SQL
    
SQL is a query language, which means that it’s designed to extract, organize, and 
update information in relational databases    
The rest of the subchapter just explains how to say SQL
    

Introducing SQL Statements
    
Unlike Java, SQL is not object-oriented. Like Java, however, SQL uses statements to get work done
SQL is not case sensitive 
    

    
Creating a SQL Database
    
Before you can store data in a relational database, you must create the database. 
Normally you don’t do that from a Java program.    
Script statements end with semicolons, which is about the only thing that SQL 
scripts have in common with Java scripts. Be aware, however, that the semicolon 
isn’t required when you use SQL statements in a Java program.
Go to SQL Listing     
    
    
Querying a Database
    
As the name Structured Query Language suggests, queries are what SQL is all about. 
A query is an operation performed against one or more SQL tables.
A crucial point to understand is that the result set is itself a table consisting of 
rows and columns. When you query a database from a Java program, the result 
set is returned to the program in an object created from the ResultSet class.
    
    
    
Using a basic select statement
    
To query a database, you use the select statement. In this statement, you list the 
table or tables from which you want to retrieve the data; the specific table columns 
you want to retrieve   
In a SQL database, the rows 
stored in a table aren’t assumed to be in any particular sequence. As a result, if 
you want to display the results of a query in sequence, you must include an order 
by in the select statement
    
    
    
    
Narrowing the query
    
Suppose that you want to find information about one particular video title. To 
select certain rows from a table, use the where clause in a select statement    
    
    
    
Excluding rows
    
Perhaps you want to retrieve all rows except those that match certain criteria.    
(You do this by exluding the rows from the search that you are doing using the select statment) 
    
    
Using singleton selects
    
When you want to retrieve information for a specific row, mention the primary 
key column in the where clause    
    mysql> select title, year from movie where id = 7;
This type of select statement is called a singleton select because it retrieves only one row. 
Singleton selects are commonly used in Java programs to allow users to access or 
update a specific database row
    
    
    
Finding what something sounds like
    
One of the most interesting variations of the where clause throws in the word like, which 
lets you search rows using wildcards.   
    
    
Using column functions
    
You can calculate the sum, average, or largest or smallest value, or count the 
number of values for an entire column    
To use one of these functions, specify the function rather than a column name in a 
select statement. The following select statement calculates the number of rows 
in the table and the year of the oldest movie:
    mysql> select count(*), min(year) from movie;    
This will give you a count of the amount of movies older than the min year
    
    
    
Selecting data from more than one table
    
In the real world, most select statements retrieve data from two or more tables    
You need the create the nnew table then put data in it 
then you need to call both tables in one statement 
    
    
Eliminating duplicates
    
If you want to know just the names of all your friends who have a movie checked 
out, you can do a simple select from the friend table    
You can eliminate duplicate rows by adding the distinct keyword in the select
statement
    
    
Updating and Deleting Rows
    
You’ve already seen how to create databases, insert rows, and retrieve result sets. 
All that remains now is updating and deleting data in a table. For that, you use the 
update and delete statements, as described in the following sections.     
    
Using the delete statement
    
The basic syntax of the delete statement is
    delete from table-name where condition;    
    mysql> delete from movie where id = 10;

Using the update statement
    
The update statement selects one or more rows in a table and then modifies the 
value of one or more columns in the selected rows. Its syntax is this:
        update table-name
         set expressions...
         where condition;   
    
    
   
    
    
    */
}
