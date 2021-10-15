package javaprogram;

public class Pallindrome {
	public static void main(String[] args) {

		String str = "Nitin";

		 StringBuilder sb=new StringBuilder(str);
		 sb.reverse();
		 String rvrstr =sb.toString();
		 if(rvrstr.equals(str))
		 System.out.println("String is Pallindrome");
		 else
		 System.out.println("String is not pallindrome");

		// -----ALTERNATE METHOD----

		// char[]tempstr=str.toCharArray();
		// String rvrstr="";
		// for(int i=str.length()-1;i>=0;i--)
		// {
		// rvrstr=rvrstr+tempstr[i];
		// }
		// if(str.equalsIgnoreCase(rvrstr))
		// System.out.println("String is Pallindrome");
		// else
		// System.out.println("String is not pallindrome");

	}
}
