package training;

public class This {
//global variable a and b
	int a;
	int b;
	int c=5;
	//local variable
	This(int a, int b){
		System.out.println("values"+a +b+c);
		this.a=a;
		this.b=b;
		
	}
	// default constructor
	This()
	{
		// calling parameterized constructor from here and passing 2 and 4 values in that 
		this(2,4);
	}
	
	public void test1()
	{
		
		System.out.println("values"+a +b+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		This t=new This(5,7);// this is calling constructor and 5 and 7 will print on console
		t.test1();//we want 5 and 7 will get store in global variable
		//so that we can use this in method test1()
		This t1=new This();// calling default constructor
		
	}

}
