import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
public class Test1 {
public static void main(String[] args)
	{	
	String temp="";
		String s = "welcometojava";
		String smallest = "";
		String largest = "";
		String[] str = new String[s.length()-2];
		for (int a=0;a<11;a++) 
		{
			str[a]=s.substring(a,a+3);
		}
		int n=str.length;
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
				temp=str[i];
				str[i]=str[j];
				str[j]=temp;
				}
				}
				for(String ch:str)
					System.out.println(ch);
				
		smallest=str[0];
		largest=str[str.length-1];
	}
}
