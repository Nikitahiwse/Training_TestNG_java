package assessment;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class content_management {
 public static WebDriver driver;
	@BeforeSuite
	public void initialization() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("URL");
		Thread.sleep(5000);
		 
	}
	@Test(priority=1)
	public void movie_cateories() throws InterruptedException
	{
		String webpagetitle=Webpage.Gotowebpage("Movie Categories");
		Assert.assertEquals(webpagetitle, "Movie Categories");
		
	}
	@Test(priority=2)
	public void movie_list() throws InterruptedException
	{
		String webpagetitle=Webpage.Gotowebpage("Movie List");
		Assert.assertEquals(webpagetitle, "Movie Categories");
	}
	@Test(priority=3)
	public void movie_billing_packages() throws InterruptedException
	{
		String webpagetitle=Webpage.Gotowebpage("Movie Billing Packages");
		Assert.assertEquals(webpagetitle, "Movie Categories");
	}
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
}
