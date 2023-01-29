package com.sl.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class explicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		<div id="droppable" class="ui-widget-header ui-droppable">
//		https://jqueryui.com//resources/demos/droppable/default.html
//		</div>
		
		driver.findElement(By.name("login")).sendKeys("krushna@gmail.com");
		
		
		 
//actions
         
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.quit();
	
	}

}
