/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter3;

/**
 *
 * @author Sean
 */
public class QuickSortApp {

    public static void main(String[] args) {
        int LEN = 100;
        int[] unsorted = new int[LEN];
        for (int i = 0; i < LEN; i++)// This for loop assigns 100 random values to the array.As we can see it uses
                                     //it uses this for loop with math.random 
        {
            unsorted[i]
                    = (int) (Math.random() * 100) + 1;
        }
        System.out.println("Unsorted array:");
        printArray(unsorted); //The printArray method is called to print the unsorted array,
        int[] sorted = sort(unsorted);// →11
        System.out.println("\n\nSorted array:");
        printArray(sorted); //This prints the sorted array
    }

    private static void printArray(int[] array)// The printArray method uses a for loop to print array elements. Each 
                                               //element is separated by two spaces. An additional space, however, is 
                                               //printed before each element if the element’s value is less than 10. That 
                                               //way, the values line up in columns. Also, the remainder operator (%) is 
                                               //used to call the println method every 20 elements. Thus this method 
                                               //prints 5 lines with 20 values on each line
    {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10) {
                System.out.print(" ");
            }
            System.out.print(array[i] + " ");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }//so this entire loop gives our print out some structure so it is readable 
    private static int[] a; //  A static variable named a is used to hold the array while it is being sorted.

    public static int[] sort(int[] array)//The sort method has two versions. The first accepts an int array as a 
                                         //parameter and returns an int array with the sorted values.
    {
        a = array;
        sort(0, a.length - 1);
        return a;
    }

    public static void sort(int low, int high)//This line is the second sort method. It sorts the partition indicated by the parameters
    {
        if (low >= high) {
            return;
        }
        int p = partition(low, high);
        sort(low, p);
        sort(p + 1, high);
    }

    public static int partition(int low, int high) // The partition method is explained in detail in the preceding section
    {
        int pivot = a[low];
        int i = low - 1;
        int j = high + 1;
        while (i < j) {
            for (i++; a[i] < pivot; i++);
            for (j--; a[j] > pivot; j--);
            if (i < j) {
                swap(i, j);
            }
        }
        return j;
    }

    public static void swap(int i, int j)//The swap method simply exchanges the two indicated values
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
