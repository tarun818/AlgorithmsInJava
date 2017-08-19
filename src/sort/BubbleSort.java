package sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort 
{
    /*
     * Bubble Sort is an algorithm which is used to sort N elements that are
     * given in a memory eg: an Array with N number of elements. Bubble Sort
     * compares all the element one by one and sort them based on their values.
     * Although bubble sort is one of the simplest sorting algorithms to
     * understand and implement, its O(n2) complexity means that its efficiency
     * decreases dramatically on lists of more than a small number of elements.
     * Even among simple O(n2) sorting algorithms, algorithms like insertion
     * sort are usually considerably more efficient.
     * Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
     * Auxiliary Space: O(1)
     */
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int[] unSortedArray;
        int size = 0;
        boolean swap = false;
        System.out.print("Please enter size of unsorted Array: ");
        size = inputScanner.nextInt();
        if (size <= 0) {
            System.out.println("UnSorted Array size should be grater than 0.");
            System.exit(0);
        }
        unSortedArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("\nPlease enter an integer element for index " + i
                    + " :");
            unSortedArray[i] = inputScanner.nextInt();
        }
        inputScanner.close();
        System.out.println("UnSorted Array :"+Arrays.toString(unSortedArray));
        
        //bubble sort logic 
        
        for (int i = 0; i < size - 1; i++) 
        {
            swap=false;
            for(int j=0;j<size-1-i;j++)
            {
                if(unSortedArray[j]>unSortedArray[j+1])
                {
                    int temp= unSortedArray[j];
                    unSortedArray[j]=unSortedArray[j+1];
                    unSortedArray[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap)
            {
                break;
            }
        }
        System.out.println("Sorted Array :"+Arrays.toString(unSortedArray));
    }

}
