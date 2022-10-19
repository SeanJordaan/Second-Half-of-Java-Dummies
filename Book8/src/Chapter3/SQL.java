/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter3;

/**
 *
 * @author Sean
 */
public class SQL {
    /*
    
drop database if exists movies; →1 It’s common for a script that creates a database to begin with a drop database statement 
                                   to delete any existing database with the same name. During 
                                   testing, it’s common to delete and re-create the database, so you want to 
                                   include this statement in your scripts.
create database movies; →2 This statement creates a new database named movies
use movies; →3 The use statement indicates that the script statements that follow apply to 
               the newly created movies database
create table movie ( →4 This create table statement creates a table named movie with columns 
                        named id, title, year, and price. 
 id int not null auto_increment, →5 The id column’s data type is int, which corresponds to Java’s int type. This 
                                    column also specifies not null, which means that it must have a value for 
                                    every row, and it specifies auto increment, which means that the database 
                                    server itself provides values for this column
 title varchar(50), →6 The title column’s data type is varchar, which is like a Java String
 year int, →7 The year column’s data type is int
 price decimal(8,2), →8 The price column’s data type is decimal. Java doesn’t have a decimal type, 
                        so the values from this column are converted to double
 primary key(id) →9 The create table statement specifies that the id column is the table’s primary key.
);
insert into movie (title, year, price)→11 The insert statements add data to the database. Each of these ten statements adds a row 
                                          to the movie table. The syntax of the insert statements is 
                                          weird, because you first list all the columns that you want to insert data for 
                                          and then list the actual data
 values ("It's a Wonderful Life", 1946, 14.95);
insert into movie (title, year, price)
 values ("Young Frankenstein", 1974, 16.95);
insert into movie (title, year, price)
 values ("Star Wars", 1977, 17.95);
insert into movie (title, year, price)
 values ("The Princess Bride", 1987, 16.95);
insert into movie (title, year, price)
 values ("Glory", 1989, 14.95);
insert into movie (title, year, price)
 values("The Game",1997,14.95);
insert into movie (title, year, price)
 values("Shakespeare in Love",1998,19.95);
insert into movie (title, year, price)
 values("Zombieland",2009,18.95);
insert into movie (title, year, price)
 values("The King's Speech",2010,17.85);
insert into movie (title, year, price)
 values("Star Trek Into Darkness",2013,19.95);    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    */
    
    
    
    
    
    
    
    
    
    
    
}
