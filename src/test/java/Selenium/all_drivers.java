package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class all_drivers {
	@Test
	public void alldriver() throws Exception {
		// Invoking Browser
		// Chrome - ChromeDriver exten->Methods close get
		// Firefox- FirefoxDriver ->methods close get
		// WebDriver close get
		// WebDriver methods + class methods
		// Chrome
		//System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Firefox
		//System.setProperty("webdriver.gecko.driver","" );
		//WebDriver driver = new FirefoxDriver();
		
		// Microsoft Edge
		//System.setProperty("webdriver.edge.driver", "C:\\Driver\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
				driver.close();
		// driver.quit();

	}

}
