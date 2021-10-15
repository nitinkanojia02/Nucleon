import java.util.Scanner;

public class Sort {
public static void main(String[] args) {
	System.out.println("Enter the number of elements of Array");
	Scanner sc =new Scanner(System.in);
	int n= sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
for(int a =0;a<n;a++)
{
	for(int b=1;b<n-1;b++)
	{
		if(arr[b]>arr[a+1])
		{
			arr[b]=arr[a+1];
		}
	}
for(int num:arr)
	System.out.print(num);
}
}
}
