package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Implicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
System.setProperty("webdriver.chrome.driver", "E:\\chromedrivenew\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver wd=new ChromeDriver();
wd.get("https://www.toolsqa.com/");
wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
wd.manage().window().maximize();


WebElement about=wd.findElement(By.linkText("About"));

//WebDriver wait=new WebDriverWait()
explicitwait(wd,about,10);
about.click();



}
	public static void explicitwait(WebDriver wd,WebElement element,int timeout)
	{
		new WebDriverWait(wd,timeout).until(ExpectedConditions.visibilityOf(element));
		
	}
}