import java.util.*;

public class InsertionSortString{

	public static void main(String[] args){
		String input ="buddhika";
		char[] chars=input.toCharArray();
		
		for (int i=1; i<chars.length;i++){
		char key = chars[i];
		int j=i-1;
		
		while(j>=0 && chars[j]>key){
			chars[j+1]= chars[j];
			j--;
		}
		chars[j+1]=key;
		}
		System.out.println("Sorted using Insertion Sort: "+new String(chars));
	}
}