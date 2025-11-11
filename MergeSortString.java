import java.util.*;

public class MergeSortString{
public static void main (String[] args){
	
	String input="examdesk";
	char[] chars=input.toCharArray();
	
	mergeSort(chars,0,chars.length - 1);
	System.out.println("Sorted using Merge Sort: " +new String(chars));
	
}
static void mergeSort(char[] arr,int left,int right){
	if(left<right){
		int mid =(left+ right)/2;
		mergeSort(arr,left,mid);
		mergeSort(arr,mid +1 ,right);
		merge(arr,left,mid,right);
	}
}

static void merge (char[] arr, int left ,int mid ,int right){
	int n1=mid-left+1;
	int n2 = right-mid;
	
	char[] L=new char[n1];
	char[] R=new char[n2];
	
	for (int i=0;i<n1; i++){
		L[i]=arr[left +i];
	}
	
	for (int j=0;j<n2; j++){
		R[j]=arr[mid +1 +j];
		}
	
	int i=0 , j=0, k=left;
	while(i<n1 && j<n2)
	{
		if (L[i] <=R[j]){
			arr[k++]=L[i++];
		}
		else
		{
			arr[k++]=R[j++];
		}
	}
	while (i<n1) arr[k++]=L[i++];
	while(j<n2) arr[k++]=R[j++];
}
}