package javaprogram;

public class StrongNumber {

	public static void main(String[] args) {
		int num = 148;
		int sum = 0;
		int flag = 0;
		while (num > 0) {
			flag = num % 10;
			int i = 1;
			int temp = 1;
			while (i <= flag) {
				temp = temp * i;
				i++;
			}
			sum = sum + temp;
			num = num / 10;
		}
		System.out.println(sum);

}
}
