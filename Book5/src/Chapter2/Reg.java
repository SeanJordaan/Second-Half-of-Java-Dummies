/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

/**
 *
 * @author Sean
 */

//This program just sees if you enter 2 strings that actually match with eac other
import java.util.regex.*;
import java.util.Scanner;

public final class Reg {

    static String r, s;
    static Pattern pattern;//This program uses the Pattern and Matcher classes
    static Matcher matcher;
    static boolean match, validRegex, doneMatching;//matching happens with this 
    private static Scanner sc
            = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the "
                + "Regex Tester\n");
        do {
            do {
                System.out.print("\nEnter regex: ");
                r = sc.nextLine();
                validRegex = true;
                try {//the do while loop sees if we entered a string 
                    pattern = Pattern.compile(r);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    validRegex = false;
                }
            } while (!validRegex);
            doneMatching = false;
            while (!doneMatching) {
                System.out.print("Enter string: ");
                s = sc.nextLine();
                if (s.length() == 0) {
                    doneMatching = true;
                } else {
                    matcher = pattern.matcher(s);
                    if (matcher.matches()) {
                        System.out.println("Match.");
                    } else {
                        System.out.println(
                                "Does not match.");
                    }
                }//in this while loop the matching happens 
            }
        } while (askAgain());
    }

    private static boolean askAgain() {
        System.out.print("Another? (Y or N) ");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y")) {
            return true;
        }
        return false;
    }//this method just asks if we want to enter another string 
}
/*
Here’s a sample run of this program. For now, don’t worry about the details of 
the regular expression string. Just note that it should match any three-letter word 
that begins with f; ends with r; and has a, i, or o in the middle.
*/



