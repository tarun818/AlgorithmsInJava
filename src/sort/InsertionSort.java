package sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort
{

	public static void main(String[] args)
	{
		Scanner inputscanner = new Scanner(System.in);
		int size=0;
		int [] unsortedArray;
		System.out.print("Please enter size of un sorted array :");
		size = inputscanner.nextInt();
		if(size <= 0)
		{
			System.out.println("Input array size should be grater than Zero");
			System.exit(0);
		}
		unsortedArray= new int[size];
		for(int i=0 ;i<size;i++)
		{
			System.out.println("Please enter an integer value for index "+i+": ");
			unsortedArray[i]=inputscanner.nextInt();
		}
		inputscanner.close();
		System.out.println("Unsorted array :"+Arrays.toString(unsortedArray));
		
		insertSort(unsortedArray);
		
		System.out.println("Sorted array after insertion sort :"+Arrays.toString(unsortedArray));

	}

    /**
     * @param unsortedArray
     */
    private static void insertSort(int[] unsortedArray) 
    {
        //Started from i=1 because we divide array in imaginary two parts one is sorted another is unsorted.
        //and single element is always in sorted form 
        for(int i=1;i<unsortedArray.length;++i)
        {
            for(int j = i ; j > 0 ; j--)
            {
                if(unsortedArray[j] < unsortedArray[j-1])
                {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j-1];
                    unsortedArray[j-1] = temp;
                }
            }
        }
    }
}