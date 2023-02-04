package com.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {

      public String selectDate(WebDriver driver) {
    	  
    	  String loginStatus="Pass";
  		  driver.get("https://jqueryui.com/datepicker/");
  		  WebElement frame=driver.findElement(By.className("demo-frame"));
		  driver.switchTo().frame(frame);
		  
  		  WebElement date=driver.findElement(By.id("datepicker"));
  		  WebElement prev=driver.findElement(By.xpath("//*[text()='Prev']"));
  		  WebElement next=driver.findElement(By.xpath("//*[text()='Next']"));
  		  WebElement dateToSelect=driver.findElement(By.xpath("//*[@data-date='14']"));
  		  List<WebElement> month=driver.findElements(By.xpath("//*[@data-month='0']"));
  		  date.click();
  		  next.click();
  		  dateToSelect.click();
  	
  			
  	
  		
  		return loginStatus;
  		
  	}
}
	

