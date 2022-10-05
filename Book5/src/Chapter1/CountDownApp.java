/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter1;

/*
 *
 * @author Sean

public class CountDownApp {

    public static void main(String[] args) {
        Thread clock = new CountDownClock(); //The main method starts by creating an instance of the Count DownClock class
                                             //and saving it in the clock variable
        Runnable flood, ignition, liftoff;//Creating three launch objects(these things happen on the times) 
        flood = new LaunchEvent(16, "Flood the pad!");
        ignition = new LaunchEvent(6, "Start engines!");
        liftoff = new LaunchEvent(0, "Liftoff!");
        clock.start(); //The clock thread is started. The countdown starts ticking.
        new Thread(flood).start(); //This enitiates the lauch objects within the clock. 
        new Thread(ignition).start();
        new Thread(liftoff).start();
    }
}
Go back to notes  
/***/
import java.util.ArrayList;
// version 2.0 of the Countdown application
/*
public class CountDownApp {

    public static void main(String[] args) {
        CountDownClock clock = new CountDownClock(20);//CountDownClock class now 
                                                      //accepts a parameter to specify the starting time for the countdown
 ArrayList<Runnable> events
                = new ArrayList<Runnable>();//An ArrayList of LaunchEvent objects is used to store each launch events
 events.add(new LaunchEvent(16,//The lines that create the LaunchEvent objects pass the Count Down
                               //Clock object as a parameter to the LaunchEvent constructor.
 "Flood the pad!", clock
        ));
 events.add(new LaunchEvent(6,
                "Start engines!", clock));
        events.add(new LaunchEvent(0,
                "Liftoff!", clock));
        clock.start();// The clock is started
 for (Runnable e : events) {
            
        }//An enhanced for loop starts threads to run the LaunchEvent objects
   
 new Thread(e).start();
    }
}

interface TimeMonitor //The TimeMonitor interface defines just one method, named getTime. 
                      //This method returns an integer that represents the number of seconds 
                      //left on the countdown timer
{
    int getTime();
}

class CountDownClock extends Thread
        implements TimeMonitor //The CountDownClock class implements the TimeMonitor interface
{
 private int t;//private field named t is used to store the current value of the countdown clock.
               //and this helps the get time method 
 public CountDownClock(int start) //The constructor for the CountDownClock class accepts the starting time for the countdown as a parameter.
 {
 this.t = start;
    }

    public void run() {
        for (; t >= 0; t--) {
            
        }//The for loop in the run method tests and decrements the t variable
 {
 System.out.println("T minus " + t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public int getTime()// The getTime() method simply returns the value of the t variable
 {
 return t;
    }
}

class LaunchEvent implements Runnable //This line is the start of the LaunchEvent class
{
 private int start;
    private String message;
    TimeMonitor tm;//A private field of type TimeMonitor is used to access the countdown 
                   //clock. A reference to this object is passed to the LaunchEvent class via 
                   //its constructor
 public LaunchEvent(int start, String message,
            TimeMonitor monitor) {
        this.start = start;
        this.message = message;
        this.tm = monitor;
    }

    public void run() {
        boolean eventDone = false;
        while (!eventDone) {
            try {
                Thread.sleep(10);//The while loop includes a call to Thread.sleep that sleeps for just 
                                 //10 milliseconds. Thus, this loop checks the countdown clock every 
                                 //10 milliseconds to see whether its time has arrived.
 }
 catch (InterruptedException e) {
            }
            if (tm.getTime() <= start) {
                
            }//This statement calls the getTime method of the countdown clock to see whether it’s time to start the event
 {
 System.out.println(this.message);
                eventDone = true;
            }
        }
    }
}
*/

import java.util.ArrayList;

public class CountDownApp //→3
{

    public static void main(String[] args) {
        CountDownClock clock = new CountDownClock(20);
        ArrayList<Runnable> events
                = new ArrayList<Runnable>();
        events.add(new LaunchEvent(16,
                "Flood the pad!", clock));
        events.add(new LaunchEvent(6,
                "Start engines!", clock));
        events.add(new LaunchEvent(0,
                "Liftoff!", clock));
        clock.start();
        for (Runnable e : events) {
            new Thread(e).start();
        }
    }
}

interface TimeMonitor {

    int getTime();

    void abortCountDown();// →26
}

class CountDownClock extends Thread
        implements TimeMonitor {

    private int t;

    public CountDownClock(int start) {
        this.t = start;
    }

    public void run() {
        boolean aborted = false;// →40
        for (; t >= 0; t--) {
            System.out.println("T minus " + t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                aborted = true;// →50
            }
            if (Thread.interrupted()) {
                aborted = true; //→53
            }
            if (aborted) //→54
            {
                System.out.println(
                        "Stopping the clock!");
                break;
            }
        }
    }

    public int getTime() {
        return t;
    }

    public synchronized void abortCountDown() //→67
    {
        Thread[] threads
                = new Thread[Thread.activeCount()]; //→69
        Thread.enumerate(threads); //→70
        for (Thread t : threads) //→71
        {
            t.interrupt();
        }
    }
}

class LaunchEvent implements Runnable {

    private int start;
    private String message;
    TimeMonitor tm;

    public LaunchEvent(int start, String message,
            TimeMonitor monitor) {
        this.start = start;
        this.message = message;
        this.tm = monitor;
    }

    public void run() {
        boolean eventDone = false;
        boolean aborted = false; //→92
        while (!eventDone) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                aborted = true; //→101
            }
            if (tm.getTime() <= start) {
                System.out.println(this.message);
                eventDone = true;
                System.out.println("ABORT!!!!");
                tm.abortCountDown(); //→108
            }
            if (Thread.interrupted()) {
                aborted = true; //→111
            }
            if (aborted) //→112
            {
                System.out.println(
                        "Aborting " + message);
                break;
            }
        }
    }
}
