package Practice;
import java.util.Arrays;
public class OccurenceOfEachCharacter {
	public static void main(String[] args) {
String str = "test yantra is a scam company";
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		for (int i = 0; i < ch.length - 1; i++) {
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) 
				{
					count++;
					i++;
				}
			}
			System.out.print(" "+ch[i]+" "+count );
			
		}
	}
}
