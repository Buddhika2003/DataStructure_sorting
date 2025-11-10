public class InsertionSort {
    public static void insertionSort(int [] array){
        int n = array.length;

        for(int i=1 ; i<n ; i++){
            int key = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(); 
    }

    public static void main(String[]args){
        int[] array = {7,5,3,8,6,4,10,2,9,1};
        System.out.println("Array before sorting:");
        printArray(array);

        insertionSort(array);
        
        System.out.println("Array after sorting:");
        printArray(array);
    }
}
