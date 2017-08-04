package samplePkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleClass {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Workspace\\Selenium_Dependency\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
			
			System.out.println("add a simple first chnage");
			
			System.out.println("test line");
			
		
		System.out.println("test line added to fetch");
		
		System.out.println("test");
		
		

	}

}
