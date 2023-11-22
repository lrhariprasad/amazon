package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class selenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		//String title = driver.getTitle();
		//System.out.println(title);
		//String Currenturl = driver.getCurrentUrl();
		//System.out.println(Currenturl);	
		//driver.close();
		
		driver.navigate().to("https://www.redbus.in/");
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.close();

	}

}
