import java.util.Arrays;

public class MagicArray {

public static void main(String[] args) {
	int []arr=new int[] {0,4,0,0,1,3,4,1,0,2};	
	int[]arrsorted=new int[arr.length];
	int sumG=0;
	int sumB=0;
	for(int i =0;i<arr.length;i++)
	{
		arrsorted[i]=arr[i];
	}
	Arrays.sort(arrsorted);
	for(int j=0;j<arr.length;j++)
	{
		if(arrsorted[j]==arr[j])
		sumG=sumG+arr[j];
		else 
			sumB=sumB+arr[j];
	}
	
	System.out.println(sumG-sumB);
}
}
