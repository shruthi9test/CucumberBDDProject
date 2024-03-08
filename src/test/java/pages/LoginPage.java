package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//input[@id='user-name']")
private WebElement username;

@FindBy(xpath = "//input[@id='password']")
private WebElement password; 

@FindBy(xpath = "//input[@type='submit']")
private WebElement loginButton;

@FindBy(xpath = "//span[@class='title']")
private WebElement productText;


public WebElement getUsername() {
	return username;
}
public void setUsername(String val) {
	username.sendKeys(val);
}


public WebElement getPassword() {
	return password;
}
public void setPassword(String val) {
	this.password.sendKeys(val);
}

public  WebElement getLoginButton() {  // p should be small letter only in public
	return loginButton;
}
public WebElement getProductText() {
	return productText;
}
public void login(String username, String password) {
	this.setUsername(username);
	this.setPassword(password);
	this.getLoginButton().click();
}
}

