
public class Plaindrome {
	public static void main(String[] args) {
		int num=122;
		int temp=num;
		int rev=0,rem;
		while(temp>0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;


		}
		if(num==rev) {
			System.out.println(num+" "+"Number is pllaindrome");

		}
		else {
			System.out.println(num+" "+"Number is not  pllaindrome");		
		}
	}
}

	
