 package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class MouseOver {
	//@Test
	public void Apex() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='APEX']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='View All APEX']")).click();
		boolean display = driver.findElement(By.xpath("//h1[text()='Dell Technologies APEX']")).isDisplayed();
		String res = driver.findElement(By.xpath("//h1[text()='Dell Technologies APEX']")).getText();
		System.out.println(res);
		Assert.assertTrue(display);
		Thread.sleep(500);
		driver.close();
	}
	 @Test
	public void mouseOver() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		// launch URL
		driver.get("https://www.dell.com/en-us");
		// Maximize Window
		driver.manage().window().maximize();
		// mouse overing
		Actions ac = new Actions(driver);
		// ac.moveToElement(driver.findElement(By.xpath(" //button[text()=' Deals ']
		// "))).build().perform();
		ac.moveToElement(driver.findElement(By.linkText("Deals"))).build().perform();
		Thread.sleep(500);
		driver.close();
	}

	//@Test
	public void mouseOver1() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		// launch URL
		driver.get("https://www.dell.com/en-us");
		// Maximize Window
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("Deals"))).build().perform();
		driver.findElement(By.linkText("Laptop Deals")).click();
		driver.close();

	}
}
