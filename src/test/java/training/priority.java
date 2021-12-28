package training;

import org.testng.annotations.Test;

public class priority {
	
	@Test(priority=1)
    public void b_method(){
    System.out.println("B Method");
    }
 
    @Test
    public void a_method(){
    System.out.println("A method");
    }

}
