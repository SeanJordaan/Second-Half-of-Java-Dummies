/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Chapter1;

/**
 *
 * @author Sean
 */
public class Notes {

    /**
     * @param args the command line arguments
     */
    {
        /*
        
        Programming Threads
        
        In Java, threads are the equivalent of the spinning-plate guy. Threads let you divide
        the work of an application into separate pieces, all of which then run simultaneously
       
        
        Understanding Threads
        A thread is a single sequence of executable code within a larger program.
        Programs that use threads
        1) Web browsers can download files while letting you view web pages
        2)Emails, they dont let you wait till the email is downloaded they display it as its being 
          downloaded 
        3)Word processors can print long documents in the background while you 
          continue to work.And it checks for spelling while you are typing 
        4)Games, process a few threads to make the game compile and work
        5) All GUI-based programs use at least two threads
            5.1)One to run the main logic 
            5.2)The other then tracks the mouse and kyeboard 
        6)Java also  uses diffrent threads 
        
        
        Creating a Thread
        
        creting a thread is to create a sequence of actions that happen while the program is running
        as example the count down clock of a spacecraft 
        
        
        Understanding the Thread class
        
        The Thread class lets you create an object that can be run as a thread in 
        a multithreaded Java application
        
        
        Extending the Thread class
        
        The easiest way to create a thread is to write a class that extends the Thread class. 
        Then all you have to do to start a thread is create an instance of your thread class 
        and call its start method.
        
        Go to CountDownClock 
                               
        Creating and starting a thread

        After you define a class that defines a Thread object, you can create and start the 
        thread        
        
        
        
        Implementing the Runnable Interface
        
        In order to do this we have to ctrate another class and it has a fre more lines of code but is more flexable 
        The problem with creating a class that extends the Thread class is that a class can 
        have one superclass
        Using the Runnable interface
    To use the Runnable interface to create and start a thread, you have to do the 
    following:
    1)Create a class that implements Runnable.
    2)Provide a run method in the class you created in Step 1.
    3_Create an instance of the Thread class and pass your Runnable object to 
      its constructor as a parameter eg.
      A Thread object is created that can run your Runnable class.
    4)Call the Thread object’s start method.
     The run method of your Runnable object is called and executes in a separate 
     thread.
        
    Creating a class that implements Runnable
        
    The constructor for this class accepts two parameters: the 
    countdown time at which the event fires and the message that is displayed when 
    the time arrives. The run method for this class uses Thread.sleep to wait until 
    the desired time arrives. Then it displays the message
        
    Go to LaunchEvent
        
    Creating Threads That Work Together
        
        Having strings that work together will help your opperation 
        it seems that if they do  not work together events can be triggered at diffrent times 
        every time the program runs and i real world situations this an be harmfull 
        And we would like them to  run independantly from each other as not to cause futher damage 
        if one is not working properly 
        
    Go to countdownapp 
        
    Go to countdownclocknew 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        */
        
        
        
    }
    
}
