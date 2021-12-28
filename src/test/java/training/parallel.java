package training;

import org.testng.annotations.Test;

public class parallel {

	@Test
	public void test1()
	{
		System.out.println("hello from test1"+" |"+Thread.currentThread().getId());
	}
	@Test
	public void test2()
	{
		System.out.println("hello from test2"+ "|" +Thread.currentThread().getId());
	}
}
