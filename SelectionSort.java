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
}
