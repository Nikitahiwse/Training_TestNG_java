package training;

import org.testng.annotations.Test;

public class Ignore {
	public class module1   
	{  
	    @Test(enabled=false)     
	    public void test1()                                          // First test case  
	    {  
	        System.out.println("Hello All");  
	    }  
	      
	    @Test
	    public void test2()                                          // Second test case  
	    {  
	        System.out.println("Hello Everyone");  
	    }}  

}
