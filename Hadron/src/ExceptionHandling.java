

public class ExceptionHandling
{
	public static void main(String[] args)
	{
	try {
		System.out.println(10/0);
	}
	catch( RuntimeException e)
	{
		e.printStackTrace();
	}
		
	}

}
