package training;
//if you want make class not inheritable put final before class
public class final_class {
	public static void main(String[] args) 
	{
		System.out.println("hello from parant class");
		child();
		
	}
	// if you want to make method not overridable put final before void
     public static void child()
     {
    	 System.out.println("hello from parent");
     }
}
