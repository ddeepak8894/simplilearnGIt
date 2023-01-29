package com.sl.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class iframe801202302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable");
//		<div id="droppable" class="ui-widget-header ui-droppable">
//		https://jqueryui.com//resources/demos/droppable/default.html
//		</div>
		
		WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		Actions actions= new Actions(driver);
        WebElement resizable=driver.findElement(By.xpath("//*[contains(@class,\"ui-icon-gripsmall-diagonal-se\")]"));
        actions.clickAndHold(resizable).moveByOffset(80, 20).perform();
        
		
		
		 
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
