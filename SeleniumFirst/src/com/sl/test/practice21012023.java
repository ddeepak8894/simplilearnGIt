package com.sl.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice21012023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
//		driver.findElement(By.name("login")).sendKeys("yes");
//		driver.findElement(By.id("password")).sendKeys("krushna@123");
//		driver.findElement(By.name("proceed")).click();
		
//		driver.close();
//		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Krushna");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Krushna123");
		driver.findElement(By.xpath("//a[@title='Create new Rediffmail account']")).click();
		WebElement cb= driver.findElement(By.xpath("//input[@id=\"remember\"]"));
		System.out.println(cb.isSelected());
		if(cb.isSelected()) {
			System.out.println("inside if case ");
			cb.click();
		}
	
	
	
	}

}
