package Arrays;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {
		
		int[] obj = {10,20,40,60,80,70,50,30,90};
		
		Arrays.sort(obj);
		
		for(int elem :obj) {
			System.out.println(elem);
		}
	}

}
