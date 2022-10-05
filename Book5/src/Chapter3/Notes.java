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
    Using Recursion

    Recursion is a basic programming technique in which a method calls itself to 
    solve some problem
    
    Calculating the Classic Factorial Example
    
    One of the classic problems for introducing recursion is calculating the factorial 
    of an integer. The factorial of any given integer we'll call it n
    
    The nonrecursive solution
   
    You don’t have to use recursion to calculate factorials. Instead, you can use a 
    simple for loop
        private static long factorial(int n)
    {
     long f = 1;
     for (int i = 1; i <=n; i++)
     f = f * i;
     return f;
    int n = 5;
    long fact;
    fact = factorial(n);
    System.out.println("The factorial of "+ n + " is "
     + fact + ".");
    If you run this code, the following line is displayed on the console:
    The factorial of 5 is 120
        }
    Factorials get big fast. You should use a long rather than an int to calculate the result
    andd use a number formatting class as this makes the numbers that are returned alot easier to read 
    
    
    The recursive solution
    
    The nonrecursive solution to the factorial problem works, but it isn’t much fun
    This definition of factorial is recursive because the definition 
    includes the factorial method itself
    
    Displaying Directories
    
    Recursion lends itself well to applications that have to navigate directory structures, 
    such as a Windows or Unix file system
     For each directory, this method does two things: (1) prints the 
    directory’s name and (2) calls itself to print any subdirectories of that directory.
    
    Writing Your Own Sorting Routine
    
    This technique is called Quicksort, and it’s a very ingenious 
    use of recursion. I even show you a simple Java implementation of it
    
    Understanding how Quicksort works
    
    The Quicksort technique sorts an array of values by using recursion. Its basic steps 
    are thus:
    1)Pick an arbitrary value that lies within the range of values in the array
      This value is the pivot point. The most common way to choose the pivot point 
      is to simply pick the first value in the array 
    2) Rearrange the values in the array so that all the values that are less than 
       the pivot point are on the left side of the array and all the values that are 
       greater than or equal to the pivot point are on the right side of the array.
       The pivot value indicates the boundary between the left side and the right side of the array
       this first step s partitioning, it shows whats on the left annd right side of the array 
    3)Now treat each of the two sections of the array as a separate array, and 
      start over with Step 1 for that section.That’s the recursive part of the algorithm.
    The hardest part of the Quicksort algorithm is the partitioning step
    Here we see an array
    17 12 22 28 31 38 88 69 86 58
    this array is still out of order but the pivit point is 38 and on the left we see
    that everything less than 38 is there and on the right we see that its more than 38
    You can now repeat the proces and then pick 17 ass the pivit point and then the left side
    will be in order 
    
    
    Using the sort method
    
    The actual code that drives a Quicksort routine is surprisingly simple:
    public static void sort(int low, int high)
    {
     if (low >= high)
     return;
     int p = partition(low, high);
     sort (low, p);
     sort (p+1, high);
    }
    This method sorts the portion of an array indicated by the low and high index 
    values passed to it
    Each time the sort method executes, it calls itself twice to sort smaller partitions of the array.
    The if statement at the beginning of the sort method compares the low value 
    with the high value. If the low value is equal to or greater than the high value
    
    
    Using the partition method
    
    The sort method itself is the simple part of the Quicksort technique. The hard 
    part is the partition method.
    The basic outline of the partition method goes something like this
    1)Pick a pivot point
    2)Move all elements that are less than the pivot point to the left side of the partition
    3)Move all elements that are less than the pivot point to the right side of the partition
    4)Return the index of the pivot point
    The most common technique for partitioning the array is to maintain two index
    variables, named i and j, that work from both ends of the array toward the center
    
    
    Putting it all together
    
    Go to QuickSortApp
    
    
    
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    */
}
