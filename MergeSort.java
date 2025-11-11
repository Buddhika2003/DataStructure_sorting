import java.util.*;

public class MergeSort
{
	
	public void mergeSort(int[] array, int left, int right)
	{
	
		if (left < right)
		{
			
			int mid = left + (right - left) / 2; 

			mergeSort(array, left, mid);
			
			mergeSort(array, mid + 1, right);

			
			merge(array, left, mid, right);
		}
	}

	
	public void merge(int[] array, int left, int mid, int right)
	{
		
		int n1 = mid - left + 1;
		int n2 = right - mid;

		
		int[] L = new int[n1];
		int[] R = new int[n2];

		
		for (int i = 0; i < n1; i++)
		{
			L[i] = array[left + i];
		}
		
		for (int j = 0; j < n2; j++)
		{
			
			R[j] = array[mid + 1 + j];
		}

		
		int i = 0, j = 0;
		int k = left; 

		while (i < n1 && j < n2)
		{
			if (L[i] <= R[j])
			{
				array[k] = L[i];
				i++;
			}
			else
			{
				array[k] = R[j];
				j++;
			}
			
			k++;
		}
		
		
		while (i < n1)
		{
			array[k] = L[i];
			i++;
			k++;
		}
		

		while (j < n2)
		{
			array[k] = R[j];
			j++;
			k++;
		}
	}
	
	
	public static void printarrayay(int[] array)
	{
		for (int value : array)
		{
			
			System.out.print(value + " "); 
		}
		System.out.println();
	}
	
	
	public static void main(String[] args)
	{
		int[] array = {7,5,3,8,6,4,10,2,9,1};
		System.out.println("Before Sorting: ");
		printarrayay(array);
		
		MergeSort ob = new MergeSort(); 
		ob.mergeSort(array, 0, array.length - 1);
		
		System.out.println("After Sorting: ");
		printarrayay(array);
	}
}