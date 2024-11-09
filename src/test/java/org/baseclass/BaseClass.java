package org.baseclass;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

		public static WebDriver driver;
		
		public static void chromeDriver() {
			 driver = new ChromeDriver();
		}
		
		public static void maxWindow() {
			driver.manage().window().maximize();
		}
		public static void getUrl(String url) {
			driver.get(url);
		}
		
		public static void sendValue(WebElement we, String value) {
			we.sendKeys(value);
		}
		public static void clickButton(WebElement wel) {
			wel.click();
		}
		public static void dateAndTime() {
			Date d = new Date();
			System.out.println(d);

		}
		public static void closeBrowser() {
			driver.close();

		}
	}

