package com.pages;

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
	
	
	By username = By.id("login1");
	By password=By.id("password");
	By loginButton=By.name("proceed");
	
	
	public void ValidLogin(WebDriver driver) {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(username).sendKeys("krushna");
		driver.findElement(password).sendKeys("krushna");
		driver.findElement(loginButton).click();
		}
	
	public void InValidLogin() {
		
	}
	
}

   

