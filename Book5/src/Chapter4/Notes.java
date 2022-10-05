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
    
    Working with Dates and Times
    
    Java finally got with the times with the release of Java 8, which introduced an 
    entirely new framework for working with dates and times, usually referred to 
    as the Date-Time API in this chapter we go through a few of these 
    
    Pondering How Time is Represented
    
    Humans and computors have diffrent ways of tracking time 
    We as humans track time from seconds on to years and then centuries(obviosly there 
    are other ways aswwell like days weeks months years and decades) 
    In contrast, the way computers keep track of time is much simpler:
    Computers simply count the number of units that have elapes since a given start
    and that start is 00:00 in Jan 1970 (nobody knows why except it was adopted fromm unix) 
    
    
    Picking the Right Date and Time Class for Your Application

    The first order of business when developing an application that must work with 
    dates or times (or both) is picking the Date-Time class to represent your date and 
    time values. The java.time package defines ten distinct classes used to represent 
    different types of times and dates
    Look at the book 541 to see the diffrent classes for time and dates 
    
    
    Using the now Method to Create a Date-Time Object
    
    All Date-Time classes have a static now method, which creates an object representing the current date and/or time. 
    For example, to get the current date, you would use code similar to this:
        LocalDate date = LocalDate.now();
    To get the current date and time with time zone, use this code:
        ZonedDateTime datetime = ZonedDateTime.now();
    Go to the TimeTester class to see how the things work 
    
    
    Using the parse Method to Create a Date-Time Object
    
    Another way to create a Date-Time object is to use the static parse method, 
    which creates a Date-Time object from a string that represents a specific date or time
    The parse method is especially useful for converting user input to a Date-Time object
        
    
    Using the of Method to Create a Date-Time Object
    
    A third way to create Date-Time objects is to use the static of method to create a Date-Time object from its constituent parts. For example, you can create a 
    LocalDate object by supplying integers that represent the year, month, and day 
    like this:
        LocalDate date = LocalDate.of(2014,12,15);
    
    
    Using the ZoneId class
    
    To create a ZonedDateTime, you must first create a time zone object by using the 
    ZoneId class. To create a time zone, you must know the standard name of the time 
    zone you want to create. Unfortunately, there are more than 500 distinct zone IDs, 
    and they periodically change. So listing them here would be impractical, but you 
    can easily list them all by using this handy bit of code:
        for (String id : ZoneId.getAvailableZoneIds())
        System.out.println(id);
    this will list the zone id's on the consol 
    Once you know the name of the ZoneId you want to use, you can create it using 
    ZoneId.of , then use it to create a ZonedDateTime as in this example:
        ZoneId z = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zdate;
        zdate = ZonedDateTime.of(2014, 12, 15, 0, 0, 0, 0, z);
    
    
    Using the ZoneOffset class
    
    The of method OffsetTime and OffsetDateTime classes use an additional class 
    named ZoneOffset to indicate the offset from UTC.
    You can create a ZoneOffSet by using the following
        of(String offsetId)
        ofHours(int hours)
        ofHoursMinutes(int hours, int minutes)
        ofHoursMinutesSeconds(int hours, int minutes, int seconds)
        ofTotalSeconds(int totalSeconds)
    
    
    Looking Closer at the LocalDate Class
    
    The basic java.time classes are similar enough that once you learn how to use 
    one of them, you’ll find it easy to learn how to use the rest
    
    
    Extracting Information About a Date
    
    Several methods of the LocalDate class let you extract useful information about 
    a given date. For instance, the following example shows how you can extract the 
    current year, month, and day:
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
    
    Comparing dates
    
    you cant compare dates using the = sign 
    you can however do it with isEqqual,isBefore or isAfter
    
    
    Calculating with Dates
    
    You can use plus minus methods in order to calculate
    Some date calculations can be a bit more complex. For example, consider a business that prepares invoices on the 15th of each month. The following snippet of 
    code displays the number of days from the current date until the next invoicing date:
        LocalDate today = LocalDate.now();
        LocalDate invDate = LocalDate.of(today.getYear(),
         today.getMonthValue(), 15);
        if (today.getDayOfMonth() > 15)
         invDate = invDate.plusMonths(1);
        long daysToInvoice = today.until(invDate,
         ChronoUnit.DAYS);
        System.out.println(daysToInvoice
         + " until next invoice date.");
    This example works by first getting the current date, then creating a 
    new LocalDate object that represents the 15th of the current month
    ChronoUnit is an enumeration that defines the various units of time that can be used in date and time calculations.
    ChronoUnit is in the java.time.temporal package, so be sure to include 
    the following statement at the top of any program that uses ChronoUnit:
        import java.time.temporal.*
    
    
    
    Formatting Dates
    
    If you use the toString() method to convert a LocalDate to a string, you get 
    a string such as 2014-10-31
    In order to display the date diffently you will a DateTimeFormatter
    
    
    
        
    
    
    
    
    
    
    
        
    
    
    
    
    
    
    
        
    
    
    
    
    
    
    
        
    
    
    
    
    
    
    
        
    
    
    
    
    
    
    
        
    
    
    
    
    
    
    
        
    
    
    
    
    
    
    
        
    
    
    
    
    
    
    
    
    
    */
}
