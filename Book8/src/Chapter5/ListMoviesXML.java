/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter5;

/**
 *
 * @author Sean
 */
import javax.xml.parsers.*;// →1 Java xml psckages 
import org.xml.sax.*;
import org.w3c.dom.*;
import java.text.*;

public class ListMoviesXML {

    private static NumberFormat cf
            = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) //→11  The main method starts by calling the getDocument method to get a 
                                           //     Document object from the file movies.xml. Then it gets the root element 
                                           //     As each Movie element is processed, it’s 
                                           //     passed to the getMovie method, which extracts the year attribute and 
                                           //     the title and price elements, and returns a Movie object. 
                                           //     Then the movie is printed on the console.
    {
        Document doc = getDocument("movies.xml");
        Element root = doc.getDocumentElement();
        Element movieElement = (Element) root.getFirstChild();
        Movie m;
        while (movieElement != null) {
            m = getMovie(movieElement);
            String msg = Integer.toString(m.year);
            msg += ": " + m.title;
            msg += " (" + cf.format(m.price) + ")";
            System.out.println(msg);
            movieElement
                    = (Element) movieElement.getNextSibling();
        }
    }

    private static Document getDocument(String name)// →29 The getDocument method accepts a filename as a parameter and 
                                                    //     returns a Document object. Before it creates the DocumentBuilder
                                                    //     object, it sets the configuration options so that
    {
        try {
            DocumentBuilderFactory factory
                    = DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);
            factory.setIgnoringElementContentWhitespace(true);
            factory.setValidating(true);
            DocumentBuilder builder
                    = factory.newDocumentBuilder();
            return builder.parse(new InputSource(name));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static Movie getMovie(Element e)// →49  The getMovie method is passed an Element object that represents a 
                                            //      Movie element. It extracts the year attribute, gets the text value of the 
                                            //      title element, and parses the text value of the price element to a double.
    {
        // get the year attribute
        String yearString = e.getAttribute("year");
        int year = Integer.parseInt(yearString);
        // get the Title element
        Element tElement = (Element) e.getFirstChild();
        String title = getTextValue(tElement).trim();
        // get the Price element
        Element pElement
                = (Element) tElement.getNextSibling();
        String pString = getTextValue(pElement).trim();
        double price = Double.parseDouble(pString);
        return new Movie(title, year, price);
    }

    private static String getTextValue(Node n) //→65  The getTextValue method is simply a little helper method that gets the 
                                               //     text content from a node. This method assumes that the node has a 
                                               //     child node containing the text value, so you shouldn’t call this method 
                                               //     unless you know that to be the case
    {
        return n.getFirstChild().getNodeValue();
    }

    private static class Movie //→70  The Movie class is a private inner class that represents a single movie. It 
                               //     uses public fields to hold the title, year, and price data, and it 
                               //     provides a simple constructor that initializes these fields
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
