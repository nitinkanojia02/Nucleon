public class ReverseParticularWords {
	public static void main(String args[])
	{
		String str = "The Sky is Blue";
		String[] rev = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<4;i++) 
		{
			if (i%2==0) 
			{
				sb.append(rev[i]);
				sb.reverse();
				rev[i] = sb.toString();
			}
			sb=new StringBuilder();
		}
		for (String ch:rev)
			System.out.print(ch+" ");
	}

}
