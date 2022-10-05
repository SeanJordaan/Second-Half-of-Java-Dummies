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
    Using Regular Expressions
    
    A regular expression is a special type of pattern-matching string 
    that can be very useful for programs that do string manipulation.
    Regular expression strings contain special pattern-matching characters that can be 
    matched against another string to see whether the other string fits the pattern
    Regular expressions are also useful for many other purposes, including searching text files 
    In this chapter they focus on the validation of an expression 
    
    
    Creating a Program for Experimenting with Regular Expressions
    
    We first go to listing 2-1
    First, this program lets you enter a regular expression. Next, you can enter a string, and the 
    program tests it against the regular expression and lets you know whether the 
    string matches the regex. Then the program prompts you for another string to 
    compare. You can keep entering strings to compare with the regex you’ve already 
    entered. When you’re done, just press the Enter key without entering a string. 
    The program asks whether you want to enter another regular expression. If you 
    answer yes (y), the whole process repeats. If you answer no (n), the program ends
    This program uses the Pattern and Matcher classes
    
    
    Performing Basic Character Matching
    
    Most regular expressions simply match characters to see whether a string complies
    with a simple pattern
    
    
    
    Matching single characters
    
    The simplest regex patterns match a string literal exactly
    
    Using predefined character classes
    
    A character class represents a particular type of character rather than a specific character
    You can use a .(period) as a wildcatrd character to see if things match 
    The \d class represents a digit and is often used in regex patterns to validate input 
    data. Here’s a simple regex pattern that validates a U.S. Social Security number, 
    which must be entered in the form xxx-xx-xxxx:
    Enter regex: \d\d\d-\d\d-\d\d\d\d
    Enter string: 779-54-3994
    Match.
    Enter string: 550-403-004
    Does not match.
    a regex pattern can also have a capple \D in it and that specifies any character that is not between 0-9
    Enter regex: \D\d-\D\d
    Enter string: R2-D2
    Match
    The \s class matches white-space characters including spaces, tabs, newlines, 
    returns, and backspaces this is when a user must leave a white space within whatever info they are giving
    The last set of predefined classes is \w and \W. The \w class identifies any character 
    that’s normally used in words, including uppercase and lowercase letters, digits, 
    and underscores. An example shows how all that looks:
    Enter regex: \w\w\w\W\w\w\w
    Enter string: abc def
    Match.
    Enter string: 123 456
    Match.
    Enter string: 123_456
    Does not match
    The \W is a charchacter that is anything but a word 
    Using custom character classes
    To create a custom character class, you simply list all the characters that you want 
    to include in the class within a set of brackets
    so what ever is in the brackets can be used to match the string with another 
       
    
     Using ranges
    
    Custom character classes can also specify ranges of letters and numbers, like this:
    Enter regex: [a-z][0-5]
    so anything within this range will match 
    
    Using negation
    
    Regular expressions can include classes that match any character but the ones 
    listed for the class. To do that, you start the class with a caret, like this:
    Enter regex: [^cf]at
    Enter string: bat
    Match.
    Enter string: cat
    Does not match.
    Enter string: fat
    Does not match.
    so here we see that whatever is in the brackets can not match with the new string that is given 
    
    
    Matching multiple characters
    
    The regex patterns described so far in this chapter require that each position 
    in the input string match a specific character class. The pattern \d\W[a-z]
    but you can put in spcial factors that assist 
    {n} so this shows that a number must be put in the amount of n({3} for example)


Using escapes
    
    In regular expressions, certain characters have special meaning. What if you want 
    to search for one of those special characters? In that case, you escape the character 
    by preceding it with a backslash. Here’s an example:
    Enter regex: \(\d{3}\) \d{3}-\d{4}
    Enter string: (559) 555-1234    
    Here \( represents a left parenthesis, and \) represents a right parenthesis. 
    Without the backslashes, the regular expression treats the parenthesis as a grouping element

    
    Using parentheses to group characters

    You can use parentheses to create groups of characters to apply other regex elements to
        Enter regex: (bla)+
    Enter string: bla
    Match.
    Enter string: blabla
    Match.
    Enter string: blablabla
    Match.
    Enter string: bla bla bla
    Does not match.
    Here the parentheses treat bla as a group, so the + quantifier applies to the entire 
    sequence. Thus, this pattern looks for one or more occurrences of the sequence 
    bla
    so a + is a sequence and ifyou put a ? it is optional to enter 
        Enter regex: (\(\d{3}\)\s?)?\d{3}-\d{4}
    Enter string: 555-1234
    Match.
    Enter string: (559) 555-1234
    Match.
    Enter string: (559)555-1239
    Match
    When you mark a group of characters with parentheses, the text that matches that 
    group is captured so that you can use it later in the pattern
    
    
    Using the pipe symbol

    The vertical bar (|) symbol defines an or operation, which lets you create patterns 
    that accept any of two or more variations. Here’s an improvement of the pattern 
    for validating droid names:
    Enter regex: (\w\d-\w\d)|(\w-\d\w\w)
    Enter string: r2-d2
    Match.
    Enter string: c-3po
    Match.
    The | character indicates that either the group on the left or the group on the right 
    can be used to match the string.
    
    
    Understanding the String problem

    String regex = "\w\d-\w\d"; // error: won't compile
    The compiler sees the backslashes in the string and expects to find a valid Java 
    escape sequence, not a regular expression.
    unfortunately, the solution to this problem is ugly:
    You have to double the backslashes wherever they occur
    String regex = "\\w\\d-\\w\\d"; // now it will compile
    
  
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    */
}
