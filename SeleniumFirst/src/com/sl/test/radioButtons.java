package com.sl.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		

		driver.findElement(By.partialLinkText("Create a new")).click();
		List<WebElement> radioElements=driver.findElements(By.xpath("//*[@type=\"radio\"]"));
		radioElements.forEach(element -> System.out.print(element.getText()));
		
		driver.quit();
	
	}

}
