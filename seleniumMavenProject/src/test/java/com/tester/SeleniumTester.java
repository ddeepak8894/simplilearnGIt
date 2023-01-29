package com.tester;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.DatePicker;
import com.selenium.Login;

public class SeleniumTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		
		
		 driver.get("https://jqueryui.com/datepicker/");
		  WebElement frame=driver.findElement(By.className("demo-frame"));
		  driver.switchTo().frame(frame);
		  
		  WebElement date=driver.findElement(By.xpath("//*[@id='datepicker']"));
		  date.click();
		  WebElement prev=driver.findElement(By.xpath("//*[text()='Prev']"));
		  WebElement next=driver.findElement(By.xpath("//*[text()='Next']"));
		  WebElement dateToSelect=driver.findElement(By.xpath("//*[@data-date='14']"));
		  List<WebElement> month=driver.findElements(By.xpath("//*[@data-month='0']"));
		  
		  
		  next.click();
		  dateToSelect.click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
