package javaprogram;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 1;
		int flag = 0;
		if(num==0||num==1)
			System.out.println("Number is not prime");
		else {
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				System.out.println("Number is not Prime");
				flag = 1;
				break;
			}
		}
		
		if (flag == 0)
			System.out.println("Number is Prime");
		}
		}
}
