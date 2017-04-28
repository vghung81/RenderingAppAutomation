package com.smi.RenderingApp.RenderingApp;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import PageFactory.LoginPage;
import Functions.*;
public class Login extends TestBase{  
  

	
	
  @Test
  public void LoginWithValidCredential()  {
	  
	
	  UltilityFunctions.enter_URL("http://10.1.10.22:8080/RenderingApp");
	  LoginPage loginpage =new LoginPage(driver);
	  loginpage.Login("hung@speechmorphing.com","abc123");
	  System.out.print("Completed");
	 
      

 
	  
  }




}
