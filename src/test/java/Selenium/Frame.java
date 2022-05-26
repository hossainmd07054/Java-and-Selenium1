package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frame {
	@Test
	public void frame() throws Exception {
		System.setProperty( "webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		//launch URL
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		//Maximize Window
		driver.manage().window().maximize();
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Deprecated")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}



