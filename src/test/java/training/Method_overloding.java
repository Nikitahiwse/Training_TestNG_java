package training;

public class Method_overloding {

	int sum;
	public void add(int a,int b)
	{
		 sum=a+b;
		System.out.println("addition of given numbers are "+ sum);
	}
	public void add(int a,int b,int c)
	{
		sum=a+b+c;
		System.out.println("addition of given numbers are "+ sum);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//this is for overloading
		
		/*
		 * Method_overloding m=new Method_overloding(); m.add(3,6); m.add(4,6,9)
		 */;
		 
		 
		 
		 // this is for overriding
		 method_overriding m=new method_overriding();
		 m.add(8, 9);
	}

}
