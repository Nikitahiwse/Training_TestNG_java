package assessment;

import java.util.Set;

import org.openqa.selenium.By;

public class Webpage extends content_management {
	static String  title;
	
	public static String Gotowebpage(String webpagename) throws InterruptedException
	{

		//To click on content management 
		driver.findElement(By.linkText("Content Management")).click();
		Thread.sleep(1000);
		//To store parent window id 
		String parent =driver.getWindowHandle();
		//To click on child web page as per given parameter
		driver.findElement(By.linkText(webpagename)).click();
		Thread.sleep(2000);
		// To collect all window id as I am assuming it will open in different tab
		Set<String>Allwindow =driver.getWindowHandles();
		int count =Allwindow.size();
		System.out.println("Total window present"+count);
		//To switch control on child window
		for(String child: Allwindow)
		{
			if(!parent.equalsIgnoreCase(child));
			{
				driver.switchTo().window(child);
				 title=driver.getTitle();
				
				
			}
		}
		
		//switch to parent window
		driver.switchTo().window(parent);
		// return title of child window to verify whether the Webpage is correct or not
		return title;
		
	}

}
