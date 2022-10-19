/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter4;

/**
 *
 * @author Sean
 */
import java.sql.*;
import java.text.NumberFormat;

public class ListMovies {

    public static void main(String[] args)// →6 The main method begins by calling the getMovies method to get a 
                                          //ResultSet object that contains the movies to be listed. Then a while
                                          //loop reads each row of the result set. The getMovie method is called to 
                                          //create a Movie object from the data in the current row.
    {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        ResultSet movies = getMovies();
        try {
            while (movies.next()) {
                Movie m = getMovie(movies);
                String msg = Integer.toString(m.year);
                msg += ": " + m.title;
                msg += " (" + cf.format(m.price) + ")";
                System.out.println(msg);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static ResultSet getMovies() //→28 The getMovies method is responsible for getting a database connection, 
                                        //and then querying the database to get the movies. The first task is 
                                        //delegated to the getConnection method
    {
        Connection con = getConnection();
        try {
            Statement s = con.createStatement();
            String select = "Select title, year, price "
                    + "from movie order by year";
            ResultSet rows;
            rows = s.executeQuery(select);
            return rows;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static Connection getConnection() //→46  The getConnection method creates a Connection object to the 
                                              //database. Note that the user ID and password are hard-coded into this method. 
    {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/Movies";
            String user = "root";
            String pw = "PassWord";
            con = DriverManager.getConnection(url, user, pw);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return con;
    }

    private static Movie getMovie(ResultSet movies)// →70 The getMovie method extracts the title, year, and price from the current 
                                                    //row and uses these values to create a Movie object.
    {
        try {
            String title = movies.getString("Title");
            int year = movies.getInt("Year");
            double price = movies.getDouble("Price");
            return new Movie(title, year, price);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static class Movie //→86  The Movie class is created as an inner class. To keep this application 
                               //simple, this class uses public fields and a single constructor that initializes 
                               //the fields with the values passed as parameters.
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
