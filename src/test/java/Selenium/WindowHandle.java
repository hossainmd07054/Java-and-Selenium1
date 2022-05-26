package Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import junit.framework.Assert;
//import junit.framework.Assert;

public class WindowHandle {
	@Test
	public void window() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		// launch URL
		driver.get("https://www.bankofamerica.com/");
		// Maximize Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section[2]/div/div/div[1]/div[1]/div/nav/ul/li[4]/a/span[3]")).click();
		driver.findElement(By.id("findAHome")).click();
		driver.findElement(By.name("home_38")).click();
		Set<String> allwindows = driver.getWindowHandles();
		int count = allwindows.size();
		Iterator<String> allwindow = allwindows.iterator();
		System.out.println(count);// Optional - up to you
		String parentWindow1 = allwindow.next();
		driver.switchTo().window(parentWindow1);
		String childwindw = allwindow.next();
		driver.switchTo().window(childwindw);
		System.out.println("We are in child window");
		driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//h2[text()='Find New Home Communities in these states']")).isDisplayed();
		//Assert.assertTrue(false);
		System.out.println("We are in p window");
		Thread.sleep(5000);
		driver.close();

			
		//driver.switchTo().window(parentWindow);
		//	System.out.println("We are in parent window");
		//}
		//Thread.sleep(5000);
		driver.quit();
	}
}
//}
