package javaprogram;

public class Armstrong {

	public static void main(String[] args) {
		int num=370;
		int sum=0;
		int flag=0;
		while(num>1)
		{
		flag=num%10;
		 num=num/10;
		sum=(int)Math.pow(flag,3)+sum;
		}
		System.out.println(sum);
	}
}
