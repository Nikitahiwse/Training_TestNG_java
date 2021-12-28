package training;

public class finally_concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	test1();
		test2();

	}
	public static void test1()
	{
		try
		{
			System.out.println("hello from try block");
			int i=5;
			int j=i/0;
			System.out.println(j);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		finally {
			System.out.println("this is from finally");
		}
	}
	
	public static void test2()
	{
		try {
			System.out.println("from try block test2 method");
		}
		finally {
			System.out.println("from finally block test2 method");
		}
	}

}
