package com.jenkin.test.jenkintest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
//import com.jenkin.test.jenkintest.*;

public class InteractionsPage {
	
	WebDriver driver = null;	
	WebPageDriver pageDriver = new WebPageDriver();
	
	public void openInteractionPage(){
		driver = pageDriver.getDriver();
		driver.manage().window().maximize();
		driver.get("http://yuiblog.com/sandbox/yui/3.2.0pr1/examples/dd/groups-drag_clean.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	}
	
	public void dragAndDropItem(String source, String destination){
		Actions actions = new Actions(driver);
		actions.dragAndDrop(driver.findElement(By.id(source)), driver.findElement(By.id(destination))).perform();;
		driver.close();
	}
	
	public void itemNotDisplayed(String item){
		//Assert.assertTrue(driver.findElement(By.id(item)).isDisplayed());
	}

}
