package javaprogram;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 58, 2, 6, 47, 69, 3, 58, 8, 12, 6, 45, 47, 7 };
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{

				if(arr[i]==arr[j])
					System.out.println(arr[i]);

			}
			}
	}

}
