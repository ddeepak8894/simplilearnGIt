package com.simplilearn.pages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {
	private By searchBar = By.id("twotabsearchtextbox");
	private By searchIcon =By.id("nav-search-submit-button");
	private By title= By.cssSelector("span.a-size-medium.a-color-base.a-text-normal");
	private By price=By.cssSelector("span.a-price-whole");
	private By itemSection=By.cssSelector("div.a-section.a-spacing-small.a-spacing-top-small");
	
	private WebDriver driver;
	
	
	public AmazonHomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void goToAmazoneHome(String url) {
		driver.get(url);
		}
	
	public void searchProduct(String productToSearch) {
		driver.findElement(searchBar).sendKeys(productToSearch);
		driver.findElement(searchIcon).click();
		
	}
	
	public Map<String,String> getTitlesAndPrices(){
		List<WebElement> titleSections=driver.findElements(itemSection);
		HashMap<String, String> titleAndPrice = new HashMap<>();
		
		
		titleSections.forEach((e)->{
				if(e.getText().contains("₹")) {
					titleAndPrice.putIfAbsent(e.findElement(title).getText(), e.findElement(price).getText());
				}
			});		
		return titleAndPrice;
		}
	
	public void closeAmazonePage() {
		driver.quit();
		}

}
