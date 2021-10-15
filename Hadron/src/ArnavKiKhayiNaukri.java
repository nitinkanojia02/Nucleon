import java.util.Scanner;
class Testing
{
	 static  int MatchString(char str1[],int len1,char str2[],int len2,int k1,int k2)
	{ String first="";
	String second="";
		int length=0;
	
		for (int i=k1;i<len1;i++)
		{
			first=first+str1[i];
		}
		for (int j=k2;j<len2;j++)
		{
			second=second+str2[j];
		}
		
		if(first.equalsIgnoreCase(second))
			length=first.length();
		if((first.length()==0)||(second.length()==0)||((first.equals(null))&&(second.equals(null))))
			length=0;
		if(!(first.equalsIgnoreCase(second))||(first.length()==0)||(second.length()==0)||(first.equals(null))||(second.equals(null)))
			length=-1;
		
		return length;
	}
}
public class ArnavKiKhayiNaukri
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//char str1[]= {'s','u','c','c','e','e','d'};
	char str1[]= {'r','e','m','e','b','e','r'};
		int len1=7;
		//char str2[]={'c','r','o','s','s','b','r','e','e','d'};
		char str2[]={'c','u','s','t','o','m','e','r'};
		int len2=8;
		int k1=5;
		int k2=5;
		int result=Testing.MatchString(str1,len1,str2,len2,k1,k2);
		System.out.println(result);
		
		{
			
		}
	}
}