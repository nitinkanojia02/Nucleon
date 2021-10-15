package Practice;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
int arr[]=new int[] {45,12,98,63,54,2,6,8,7,1,2};//[54,2,6,8,7,1,2,45,12,98,63]
int size=arr.length;
int []temp= new int[size];
System.out.println("Enter the index from where you want to rotate");
Scanner sc= new Scanner(System.in);
int index=sc.nextInt();
int j=index+1;
int flag=size-j;
for(int i=0;i<flag;i++)
{ 
	temp[i]=arr[j];
	j++;
}
for(int value:temp)
System.out.print(" "+value);
//int x=0;
//for(int a =flag;a<size;a++)
//{	
//	temp[a]=arr[x];
//	x++;
//}
//for(int value:temp)
//	System.out.print(" "+value);
	}
}
