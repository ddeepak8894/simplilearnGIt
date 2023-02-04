package com.simplilearn.tester;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.simplilearn.pages.AmazonHomePage;
import com.simplilearn.utils.MSQLUtils;

public class TestAmazonPage {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		AmazonHomePage home = new AmazonHomePage(driver);
		home.goToAmazoneHome( "https://www.amazon.in/ref=nav_logo");
		home.searchProduct("Ear bud");
		Map<String, String> titleAndPriceList=home.getTitlesAndPrices();
		System.out.println("this is  data from ui--------------------below this line==============================");
		
		titleAndPriceList.forEach((t,p)->{
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("Name: " + t + ", | Price: " + p);
		});
		home.closeAmazonePage();
		MSQLUtils mysql = new MSQLUtils();
//		mysql.insertDataInMySql(titleAndPriceList);
		Map<String, String> data = mysql.getValuesForPriceAndTitle();
		System.out.println("this is expected data--------------------below this line==============================");
		data.forEach((name, price) -> {
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("Name: " + name + ", | Price: " + price);
		});


	}

}
