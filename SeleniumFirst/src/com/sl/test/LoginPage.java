package com.sl.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
//		driver.findElement(By.name("login")).sendKeys("yes");
//		driver.findElement(By.id("password")).sendKeys("krushna@123");
//		driver.findElement(By.name("proceed")).click();
		
//		driver.close();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Krushna");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Krushna123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
