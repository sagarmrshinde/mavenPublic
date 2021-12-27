package cc1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cc2 {
	

	@Parameters("BrowserName")
	@Test
	public void CCTest(String BrowserName) {
		WebDriver driver = null;
//		if (browserName.equals("chrome")) {
//			System.setProperty("WebDriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
//			driver = new ChromeDriver();
//		} else if (browserName.equals("firefox")) {
//			System.setProperty("WebDriver.chrome.driver", "C:\\Selenium\\geckodriver-v0.29.1-win32\\gechodriver.exe");
//			driver = new FirefoxDriver();
//		}
		
	

		if (BrowserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");

			driver = new ChromeDriver();
			// driver.get("https://kite.zerodha.com/");
		}

		else if (BrowserName.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.29.1-win32\\geckodriver.exe");

			// driver=new org.openqa.selenium.firefox.FirefoxDriver();
			driver = new FirefoxDriver();
			// driver.get("https://www.flipkart.com/");

		}
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");
//
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Year@123");
//
//		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
//		// ===================================================//
//
//		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
//
//		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
//		// ==============================================================================
//
//		String Actual_Id = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
//
//		String Expected_Id = "DV1510";
//
//		if (Actual_Id.equals(Expected_Id)) {
//			System.out.println("Test case passed");
//		} else {
//			System.out.println("Test case failed");
		//}
	}

}
