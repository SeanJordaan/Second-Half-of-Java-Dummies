/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter4;

/**
 *
 * @author Sean
 */
import java.util.*;
import java.time.*; //The program uses classes from three packages-time,format and teporal 
import java.time.format.*;
import java.time.temporal.*;

public class BirthdayFun {

    static Scanner sc = new Scanner(System.in);//A Scanner is used to get the user input it can be asccesed by the main
                                               //and the ask again method 

    public static void main(String[] args) {
        do {
            LocalDate birthDate;//The birthdate variable is used to store the birthdate entered by the user
            DateTimeFormatter fullFormat
                    = //   The program uses two formatters:montDay format and fullFormat
                    DateTimeFormatter.ofPattern("MMMM d, YYYY");
            DateTimeFormatter monthDayFormat
                    = DateTimeFormatter.ofPattern("MMMM d");
            System.out.println("Today is "//This line displays the current date
                    + LocalDate.now().format(fullFormat) + ".");
            System.out.println();
            System.out.print("Please enter your birthdate "
                    + "(yyyy-mm-dd): ");
            String input = sc.nextLine();
            try {
                birthDate = LocalDate.parse(input);//The string entered by the user is parsed
                if (birthDate.isAfter(LocalDate.now())) //The if statement ensures that the user has not entered a date in the future
                {
                    System.out.println("You haven't been born yet!");
                    continue;
                }
                System.out.println();
                System.out.println(birthDate.format(fullFormat)//The date entered by the user is displayed.
                        + " was a very good day!");
                DayOfWeek birthDayOfWeek = birthDate.getDayOfWeek();//The day of the week is calculated and displayed.
                System.out.println("You were born on a "
                        + birthDayOfWeek + ".");
                long years = birthDate.until(LocalDate.now(), //The persons age is calculated 
                        ChronoUnit.YEARS);
                System.out.println("You are " + years + " years young.");
                LocalDate nextBDay = birthDate.plusYears(years + 1); //The next birthday is calculated 
                                                                     //with the year entered + 1 year to  sheow when the next birthday is 
                System.out.println("Your next birthday is "
                        + nextBDay.format(fullFormat) + ".");
                long wait = LocalDate.now().until(nextBDay, //number of days are calculated 
                        ChronoUnit.DAYS);
                System.out.println("That's just " + wait
                        + " days from now!");
                LocalDate halfBirthday = birthDate.plusMonths(6); //  The person’s half birthday is calculated by adding six months to the
                                                                  //origenal date
                System.out.println("Your half-birthday is "
                        + halfBirthday.format(monthDayFormat) + ".");
            } catch (DateTimeParseException ex) {
                System.out.println("Sorry, that is not a valid date.");
            }
        } while (askAgain());
    }

    private static boolean askAgain() {
        System.out.println();
        System.out.print("Another? (Y or N) ");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y")) {
            return true;
        }
        return false;
    }
}
