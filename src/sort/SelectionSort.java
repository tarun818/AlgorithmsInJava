package sort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort
{

	public static void main(String[] args)
	{
		Scanner inputScanner = new Scanner(System.in);
		int size=0;
		int [] unsortedArray;
		
		System.out.print("Please enter size of unsorted list: ");
		size = inputScanner.nextInt();
		if(size<= 0)
		{
			System.out.println("UnSorted Array size should be grater than 0.");
			System.exit(0);
		}
		unsortedArray = new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Please enter an integer element for index "+i+": ");
			unsortedArray[i]=inputScanner.nextInt();
		}
		inputScanner.close();
		System.out.println("UnSorted Array :"+Arrays.toString(unsortedArray));
		
		doSelectionSort(unsortedArray,size);
		
		System.out.println("Sorted Array :"+Arrays.toString(unsortedArray));
		
	}

	private static void doSelectionSort(int[] unsortedArray, int size)
	{
		for(int i=0;i<size;i++)
		{
			//Find the minimum element index in unsorted array
			int min_index=i;
			for(int j=i+1;j<size;j++)
			{
				if(unsortedArray[j] < unsortedArray[min_index])
				{
					min_index=j;
				}
			}
			//Swap the minimum element with first element
			int temp = unsortedArray[i];
			unsortedArray[i]= unsortedArray[min_index];
			unsortedArray[min_index]= temp;
		}
	}

}
