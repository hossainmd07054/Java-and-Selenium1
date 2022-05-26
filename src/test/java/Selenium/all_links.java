package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class all_links {
	@Test
	public void links() throws Exception {
		
	System.setProperty( "webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	Thread.sleep(10000);
	//launch URL
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.southwest.com/");
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	//Maximize Window
	driver.manage().window().maximize();
	List <WebElement> allink = driver.findElements(By.tagName("a"));
	System.out.println("Number Of Links Present In Application" +  allink.size() );
	for(int i = 0;i<allink.size(); i ++) {
	System.out.println(allink.get(i).getAttribute("href"));
	}
	driver.close();
	// WebElement
	
}

}


