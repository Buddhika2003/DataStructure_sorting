public class SelectionSort {
    public static void selectionSort(int [] array){
        int n = array.length;

        for(int i=0 ;i<n-1 ; i++){
            int smallestIndex = i;
            for(int j=i+1 ;j<n ; j++){
                if(array[j] < array[smallestIndex]){
                    smallestIndex = j;
                }
                int temp = array[smallestIndex];
                array[smallestIndex] = array[i];
                array[i] = temp;
            }
        }
    }
    public static void printArray(int[]arr)
	{
		for(int i=0;i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

    public static void main(String []args){
        int[] array = {7,5,3,8,6,4,10,2,9,1};
        System.out.println("Array before sorting:");
        printArray(array);

        selectionSort(array);
        
        System.out.println("Array after sorting:");
        printArray(array);
    }
}
