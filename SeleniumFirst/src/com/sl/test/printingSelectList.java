package com.sl.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printingSelectList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		

		driver.findElement(By.partialLinkText("Create a new")).click();
		WebElement dobDay=driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
		
		List<WebElement> optionList=dobDay.findElements(By.tagName("option"));
		for (WebElement element : optionList) {
		    System.out.println(element.getText());
		}
		
		driver.quit();
	
	}

}
