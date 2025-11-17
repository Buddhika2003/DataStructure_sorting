
class QuickSort{
	
	public static void quickSort(char[] arr, int low, int high){
		 if(low<high){
			 int pi = partition(arr,low, high);
			 quickSort(arr, low, pi-1);
			 quickSort(arr, pi + 1, high);
		 }
	 }
	 private static int partition(char[]arr, int low, int high){
		 char pivot = arr[high];
		 int i=low - 1;
		 
		 for(int j = low ; j < high ; j++){
			 if(arr[j] < pivot){
				 i++;
				 char temp = arr[i];
				 arr[i] = arr[j];
				 arr[j] = temp;
			 }
		 }
		 char temp = arr[i + 1];
		 arr[i + 1] = arr[high];
		 arr[high] = temp;
		 return i + 1;		 
	}
	
	public static void main(String[] args){
		String input = "hello world";
		char[] arr = input.toCharArray();
		quickSort(arr, 0, arr.length - 1);
		System.out.println(new String(arr));
			
	}
}

