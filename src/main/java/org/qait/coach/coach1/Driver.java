package org.qait.coach.coach1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	
	WebDriver driver=null;
	
	public  WebDriver LaunchApplication(){

		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://storefront:coach123@dwstaging2.coach.com/");
		return driver;
}
}
