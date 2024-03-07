package com.JQuery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	WebDriver driver;
	String ApplicationUrlAddress="https://jqueryui.com/droppable/";
	
	
	public void applicationlaunch()
	{
     System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
	driver=new ChromeDriver();
	System.out.println("********Chrome Browser launched Successfully*********");
	driver.get(ApplicationUrlAddress);
	System.out.println("********Navigated to jquery Application WebPage**********");
	
	}
	public void applicationclose()
	{
	driver.quit();	
	System.out.println("********Chrome Browser closed Successfully*********");
	
	}
	
	
	public static void main(String[] args) {
		
		BaseTest test=new BaseTest();
		test.applicationlaunch();
		test.applicationclose();
		

	}

}
