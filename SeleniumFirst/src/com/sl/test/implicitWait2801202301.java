package com.sl.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class implicitWait2801202301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/selectable/default.html");
//		<div id="droppable" class="ui-widget-header ui-droppable">
//		https://jqueryui.com//resources/demos/droppable/default.html
//		</div>
		WebElement selectParent= driver.findElement(By.xpath("//*[@id=\"selectable\"]"));
		List<WebElement> items= selectParent.findElements(By.xpath("//*[contains(text(),\"Item\")]"));
		
		
		 
//actions
         Actions actions= new Actions(driver);
         actions.keyDown(Keys.CONTROL)
         .moveToElement(items.get(0)).click()
         .moveToElement(items.get(1)).click().moveToElement(items.get(2)).click().moveToElement(items.get(3)).click().keyUp(Keys.CONTROL).perform();
         
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.quit();
	
	}

}
