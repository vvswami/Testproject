package Test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[]args)
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Software\\Vishnu Sir_Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Browser open");
		driver.quit();
		
		
		
	}
	
	
	
	
}
