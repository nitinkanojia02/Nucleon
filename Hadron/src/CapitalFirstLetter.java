
public class CapitalFirstLetter {
	public static void main(String[] args) {
		String str = "my name is nitin";
		String[] temp = new String[str.length()];
		temp = str.split(" ");
		for (int i = 0; i < temp.length; i++) {
			char ch = temp[i].charAt(0);
			char test = Character.toUpperCase(ch);
			String flag = temp[i].substring(1);
			System.out.print(test + flag + " ");
		}
	}
}
