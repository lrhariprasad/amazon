package org.amazonproductscroll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazonproductscroll {

	private static final JavascriptExecutor js = null;

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Documents\\selenium tools\\chrome new version\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	        driver.manage().window().maximize();
	        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
	        Select s = new Select(dropdown);
	        s.selectByVisibleText("Electronics");
	        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	        search.sendKeys("camera");
	        WebElement search1 = driver.findElement(By.xpath("//input[@type='submit']"));
	        search1.click();
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        for (int i = 0; i < 5; i++) {
	            js.executeScript("window.scrollBy(0, 1000);");
	            sleep(1000);
	        }
           for (int i = 0; i < 5; i++) {
	            js.executeScript("window.scrollBy(0, -1000);");
	            sleep(1000);
	            
	      
           }
           List<WebElement> productNames = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	       List<WebElement> productPrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

	       for (int i1 = 0; i1 < 5 && i1 < productNames.size() && i1< productPrices.size(); i1++) {
	                String productName = productNames.get(i1).getText();
	                String productPrice = productPrices.get(i1).getText();
	                System.out.println("Product Name: " + productName);
	                System.out.println("Product Price: " + productPrice);
	                 }
	}
	    
           public static void sleep(long milliseconds) {
	        try {
	            Thread.sleep(milliseconds);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}



