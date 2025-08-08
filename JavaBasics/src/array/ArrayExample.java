package array;

import java.util.Arrays;

public class ArrayExample {
	
	
	public static int sumArray(int[] num) {
		int sum = 0;
		for (int i = 0; i<num.length; i++) {
			
			sum = sum + num[i];
			
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(a).charAt(1));
		
		int[] b = {2,3,4,5};
		
		System.out.println(Arrays.compare(a, b));
		
	System.out.println(sumArray(a));
	
	Arrays.sort(a);
	
	System.out.println(a[0]);
		
				

	}

}
