package javaprogram;

public class SumOddEven {
	public static void main(String[] args) {
		int num=496;
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
				sum=sum+i;
		}
		if(sum==num)
			System.out.println("Number is perfect");
		else 
			System.out.println("Number is not perfect");
	}

}
