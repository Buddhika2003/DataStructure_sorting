
public class BubbleSort{
    public static void bubbleSort(int [] array){
        int n = array.length;
        boolean swapped;

        for(int i=0 ; i<n-1 ; i++){
            swapped = false;
            for(int j=0 ; j<n-i-1 ; j++){
                if(array[j] > array[j+1]){
                    
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }

    public static void printArray(int[] array){
        for(int i=0 ; i<array.length ; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String []args){
        int[] array = {7,5,3,8,6,4,10,2,9,1};
        System.out.println("Array before sorting:");
        printArray(array);

        bubbleSort(array);
        
        System.out.println("Array after sorting:");
        printArray(array);
    }
}