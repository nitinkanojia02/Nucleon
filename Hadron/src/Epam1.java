
class Epam1 
{
	public static void main(String args[])
	{
		int num = 0;
		String str = "3[a]2[b]";
		String[] arr = new String[str.length()];
		String[] text = new String[2];
		arr = str.split("\\]");
		for (int i = 0; i < arr.length; i++)
		{
			text = arr[i].split("\\[");
			num = Integer.parseInt(text[0]);
			System.out.print(text[1].repeat(num) + " ");
			}
	}
}