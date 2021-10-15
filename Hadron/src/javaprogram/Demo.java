package javaprogram;

import java.util.Arrays;

public class Demo
{
	public static void main(String[] args) {

		int []a =new int[] {1,2,3,1,2};
		int x=1;
		int n=5;
		int num=n-x+1;
		int[][]arr=new int[num][x];
		int[]minarr=new int[n];
		int max=0;
		for(int i=0;i<num;i++)
		{ int flag =i;
			for(int j =0;j<num;j++)
			{ 
				arr[i][j]=a[flag];
			flag++;
			}
			
		}
			
//		for(int z=0;z<num;z++)
//		{
//			System.out.print(" "+arr[z][0]);
//			System.out.print(" "+arr[z][1]);
//			System.out.print(" "+arr[z][2]);
//			System.out.println();
//			
//		}
		for(int k=0;k<num;k++)
		{
			Arrays.sort(arr[k]);
			minarr[k]=arr[k][0];
		}
Arrays.sort(minarr);
max=minarr[n-1];
System.out.println(max);
	}
	
	
}
