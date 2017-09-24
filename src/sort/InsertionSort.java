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
		System.out.println("Unsorted array :"+Arrays.toString(unsortedArray));
		
		
		

	}

}
