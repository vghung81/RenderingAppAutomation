package com.smi.RenderingApp.RenderingApp;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import Functions.UltilityFunctions;
public class TestBase {

	
	protected static WebDriver driver; 
	@BeforeClass 
	public static void setUp()
	{ 
      driver=UltilityFunctions.open_Browser("Chrome");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	
	@AfterClass 
	public static void tearDown()
	{
		
		//driver.close();
	}
	}
	
	
	
	
	
	
	
	

	
