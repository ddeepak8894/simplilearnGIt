package com.sl.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("ear pods");
		driver.findElement(By.id("nav-search-submit-button")).click();
	

		
		driver.quit();
	
	}

}
