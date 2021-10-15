package javaprogram;

import java.util.Scanner;

public class SelectionSort_BinarySort {
public static void main(String[] args) {
	
int []arr=new int []{25,64,12,36,02,88,53,43,15,77,96};
int temp;
for(int i=0;i<arr.length-1;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]>arr[j])
		{
			temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
	}
}
for(int flag:arr)
	System.out.print("\t"+flag);
System.out.println("\nEnter the number to search");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int start=0;
int end=arr.length-1;
int mid;
int test=0;
while(start<=end)
{
	mid=(start+end)/2;
	if(num==arr[mid])
	{
		test=1;
	break;
	}
	if(num>arr[mid])
		start=mid+1;
	if(num<arr[mid])
		end=mid-1;
}
if(test==1)
	System.out.println("Number is found");
else
	System.out.println("Number is not found");
}
}