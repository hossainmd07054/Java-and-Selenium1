package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class Dropdown {
	public void dropdown() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		// launch URL
		driver.get("https://www.ebay.com/");
		// Maximize Window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement dropdownnn = driver.findElement(By.name("_sacat"));
		Select sl = new Select(dropdownnn);
		// select by index
		// select by vissible text
		// select by value
		// sl.selectByVisibleText("Baby");
		// sl.selectByValue("267");
		sl.selectByIndex(11);
		
		Thread.sleep(2000);
		driver.close();

	}
}
