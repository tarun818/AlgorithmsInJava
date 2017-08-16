package searches;

import java.util.Scanner;

public class BinarySearch {

	/*Binary search requires that the collection is already sorted. For example by Quicksort or Mergesort.
	Binary search checks the element in the middle of the collection. 
	If the search element is smaller or greater than the found element, 
	then a sub-array is defined which is then searched again. If the searched element is smaller than the found element, 
	then the sub-array is searched from the start of the array until the found element. 
	If the searched element is larger than the found element, then the sub-array is searched 
	from the found element until the end of the array. Once the searched element is found
	 or the collection is empty then the search is over.*/
    //Therefore, the worst case runtime for this function is O(log n)O(logn)
	public static void main(String[] args) 
	{
		Scanner inputScanner = new Scanner(System.in);
		int[] sortedArray;
		int size=0;
		
		System.out.print("Please enter size of sorted Array: ");
		size= inputScanner.nextInt();
		if(size<=0)
		{
			System.out.println("Sorted Array size should be grater than 0.");
			System.exit(0);
		}
		sortedArray= new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.print("\nPlease enter an integer element for index "+i+" :");
			sortedArray[i]=inputScanner.nextInt();
		}

		System.out.print("\nEnter the number to be searched :");
		int searchedInt = inputScanner.nextInt();
		
		int position = doBinerySearch(sortedArray,searchedInt,size);
		if(position != -1)
			System.out.println("Number found at :"+position);
		else
			System.out.println("Number not found :"+position);
		inputScanner.close();
		
	}

	private static int doBinerySearch(int[] sortedArray, int searchedInt, int size)
	{
		if(size ==0)
			return -1;
		int start=0;
		int end= size-1;
		while(start <= end)
		{
			int mid = (start+end)/2;
			if(searchedInt == sortedArray[mid])
				return mid;
			if(searchedInt < sortedArray[mid])
				end = mid-1;
			else
				start= mid+1;
		}
		return -1;
	}

}











