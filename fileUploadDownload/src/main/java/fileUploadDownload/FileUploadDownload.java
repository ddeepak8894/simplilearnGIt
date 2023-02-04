package fileUploadDownload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://djb.gov.in/DJBWaterTanker/");
		driver.findElement(By.name("supportingDoc")).isSelected();
		
		
		try {
			Robot robot=new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		robot.keyPress(KeyEvent.vk)

	}

}
