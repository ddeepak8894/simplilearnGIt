package com.sl.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class newTabNewWindow801202303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
//		<div id="droppable" class="ui-widget-header ui-droppable">
//		https://jqueryui.com//resources/demos/droppable/default.html
//		</div>
		
		
		
		driver.manage().window().maximize();
		 
		WebElement email=driver.findElement(By.linkText("Rediffmail"));
		
		Actions actions= new Actions(driver);
       
		System.out.println("window handle-----------> "+driver.getWindowHandle());
	
        
//		actions.moveToElement(email).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER)
//		.perform();
		actions.moveToElement(email).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).perform();
        
		System.out.println("window handle-----------> "+driver.getWindowHandles());
		
		 
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
