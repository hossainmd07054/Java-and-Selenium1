package Selenium;
//import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
	public class Locators {
	@Test
	public void locators() throws Exception {
	//implicit wait - 2 seconds time out
	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	//<input type="text" placeholder="Username" id="inputUsername" value="">
	driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	//<input type="password" placeholder="Password" name="inputPassword" value="">
	driver.findElement(By.name("inputPassword")).sendKeys("hello123");
	//<button class="submit signInBtn" type="submit">Sign In</button>
	driver.findElement(By.className("signInBtn")).click();
	//<p class="error">* Incorrect username or password </p>
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	//<a href="#">Forgot your password?</a>
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);//
	//<input type="text" placeholder="Name">
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
	//<input type="text" placeholder="Email">
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
	//<input type="text" placeholder="Email">
	driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	//<input type="text" placeholder="Email">
	driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
	//<input type="text" placeholder="Phone Number">
	driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
	//<button class="reset-pwd-btn">Reset Login</button>
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.id("chkboxOne")).click();
	driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	}
	}

