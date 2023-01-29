package com.sl.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class selectable2801202302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com//resources/demos/droppable/default.html");
//		<div id="droppable" class="ui-widget-header ui-droppable">
//		https://jqueryui.com//resources/demos/droppable/default.html
//		</div>
		 WebElement source=   driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		 WebElement target=   driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		 
//actions
         Actions actions= new Actions(driver);
         actions.clickAndHold(source).moveToElement(target).release().perform();
         
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.quit();
	
	}

}
