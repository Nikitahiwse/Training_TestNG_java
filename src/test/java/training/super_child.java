package training;

public class super_child extends Super_parent {

	public  super_child()
	{
		//here supre is use to invoke constructor of parent class
		super();
		int a=10;
		System.out.println("I am from child ->"+  a);
		// super is use to invoke method of parent class
	    super.test1();
	    // super is use to invoke variables of parent class
	    System.out.println(super.b);
	    
	}
       
	
}
