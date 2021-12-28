package training;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.baseclass;

public class dataprovider_using_propertyfile extends baseclass{
	@Test
	public void employee() throws IOException
	{
	        System.out.println("Employee Firstname is - " + getobject("firstname"));
	        System.out.println("Employee  Lastname is - " + getobject("lastname"));
	        
	    }

}
