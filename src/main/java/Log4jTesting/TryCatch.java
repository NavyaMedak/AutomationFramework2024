package Log4jTesting;

public class TryCatch {

	public static void main(String[] args) {
		Division();
	}
	
	public static void Division()
	{
		try {
		System.out.println("Hello World");
		int i=10;
		int a=i/0;
	}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		finally
		{
			System.out.println("Finally Block is executed");
		}
	}

}
