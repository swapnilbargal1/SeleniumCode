package samplePkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderSelection {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Workspace\\Selenium_Dependency\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		WebElement month = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/span[1]"));
	//	driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[1]/span")).click();
		
		
		System.out.println(month.getText());
		if(month.getText().equalsIgnoreCase("August"))
		{
			driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[4]")).click();
		}

	}

}
