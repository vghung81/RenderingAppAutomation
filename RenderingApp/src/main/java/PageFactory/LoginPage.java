package PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Functions.UltilityFunctions;

public class LoginPage extends PageBase{
// property of page
		
	@FindBy(id="user_name")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="SubmitButtonLogin")
	private WebElement loginButton;
	
		
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	public void Login(String username, String password)
	 { 
	  
	   this.username.clear();
	   UltilityFunctions.enter_Text(this.username,username);
	   this.password.clear(); 
	   UltilityFunctions.enter_Text(this.password,password);
	   
	   UltilityFunctions.click_On_Button(this.loginButton);
	   
	}
	
}
