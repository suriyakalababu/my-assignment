package week3Day1;

import java.util.Arrays;

public class SecondLargestNumber {

	
	
	public static void main(String[] args) {
		
		int num []= {3,2,11,4,6,7};
		
		Arrays.sort(num);
		
		int length =num.length;
		
		
		System.out.println("Second largest number"+num[length-2]);
		
		
		
	}

}
