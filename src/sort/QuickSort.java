package sort;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	/**
	 * The worst case time complexity of this algorithm is O(n*n).
	 */
	public static void main(String[] args) 
	{
		Scanner inputscanner = new Scanner(System.in);
		int size = 0;
		int[] unsortedArray;
		System.out.print("Please enter size of un sorted array :");
		size = inputscanner.nextInt();
		if (size <= 0) {
			System.out.println("Input array size should be grater than Zero");
			System.exit(0);
		}
		unsortedArray = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Please enter an integer value for index " + i + ": ");
			unsortedArray[i] = inputscanner.nextInt();
		}
		inputscanner.close();
		System.out.println("Unsorted array :" + Arrays.toString(unsortedArray));
		quickSort(unsortedArray,0,unsortedArray.length-1);
		System.out.println("Sorted array :" + Arrays.toString(unsortedArray));
	}

	private static void quickSort(int[] unsortedArray,int low,int high) 
	{
		if (unsortedArray == null || unsortedArray.length == 0) 
		{
			return;
		}
		int i = low;
		int j = high;
		// pivot is middle index
		int pivot = unsortedArray[low + (high - low) / 2];

		// Divide into two arrays
		while (i <= j) 
		{
			while (unsortedArray[i] < pivot) {
				i++;
			}
			while (unsortedArray[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = unsortedArray[i];
				unsortedArray[i] = unsortedArray[j];
				unsortedArray[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j) 
		{
			quickSort(unsortedArray, low, j);
		}

		if (i < high) 
		{
			quickSort(unsortedArray, i, high);
		}
	}
}












