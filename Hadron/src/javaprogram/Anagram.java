package javaprogram;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String str1="HITLERWOMAN";
	String str2="MOTHERINLAW";
	char[]strch1=str1.toCharArray();
	char[]strch2=str2.toCharArray();
	Arrays.sort(strch1);
	Arrays.sort(strch2);
	int flag=Arrays.compare(strch1, strch2);
	if(flag==0)
		System.out.println("Strings are Anagram");
	else
		System.out.println("Strings are not Anagram");
			
}
}