package javaprogram;

import java.util.Arrays;

public class BiggestAndLeastElement {
	public static void main(String[] args) {
		int[] arr = new int[] { 10, 58, 2, 6, 47, 69, 3, 16, 8, 12, 14, 45, 20, 7 };
		int temp = 0;
		Arrays.sort(arr);
		System.out.println("Least Number :" + arr[0]);
		System.out.println("Max Number:" + arr[arr.length - 1]);

		// ----ALTERNATE METHOD----

		// for(int i=0;i<arr.length-1;i++)
		// {
		// for(int j=i+1;j<arr.length;j++)
		// {
		// if(arr[i]>arr[j])
		// {
		// temp=arr[i];
		// arr[i]=arr[j];
		// arr[j]=temp;
		// }
		//
		// }
		// }
		// System.out.println("Least Number :"+arr[0]);
		// System.out.println("Max Number:"+arr[arr.length-1]);
	}
}
