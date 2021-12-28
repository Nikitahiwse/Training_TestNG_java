package training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters_suitelevel {
	@Test(priority=1)
    @Parameters ({"val1", "val2"})
    public void mul(int v1, int v2) {
     int finalmultiplication = v1 * v2;
        System.out.println("The final multiplication of the given values is " + finalmultiplication);
    }
	
 }

