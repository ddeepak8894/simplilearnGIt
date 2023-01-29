package com.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

      public String login(WebDriver driver) {
    	  
    	  String loginStatus="Pass";
  		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
  		driver.findElement(By.name("login")).sendKeys("demoxoxo@rediffmail.com");
  		driver.findElement(By.id("password")).sendKeys("Password1!");
  		driver.findElement(By.className("signinbtn")).click();
  		
  		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
  	
  		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			 
			File sc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			File LoginFail = new File("/Users/deepak.dhormare/Desktop/Deepak Docs/simplilearn/simplilearnGIt/seleniumMavenProject/src/test/java/com/selenium/LoginFail.png");
			
			try {
				FileUtils.copyFile(sc, LoginFail);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			// TODO Auto-generated catch block
			loginStatus = "FAIL";
		}
  		
  			
  	
  		
  		return loginStatus;
  		
  	}
}
	

