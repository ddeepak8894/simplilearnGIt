package com.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	public String Login(WebDriver driver) {
		 
		String loginStatus="Pass";
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("login")).sendKeys("krushna@gmail.com");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.className("signinbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
		} catch (TimeoutException e) {
			System.out.println(e.getMessage());
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File sc = screenshot.getScreenshotAs(OutputType.FILE);
			
			File LoginFail = new File("c:\\prac_selenium\\screenshots\\FailStatus.png");
			
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
