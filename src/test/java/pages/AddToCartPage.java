package pages;

import org.openqa.selenium.WebDriver; //ctrl+shift+O
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	WebDriver driver;
	public AddToCartPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement shoppingcartIcon;
	
	@FindBy(xpath="//button[@name='checkout']")
	private WebElement checkoutButton;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement Firstname;
	
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement Lastname;
	
	@FindBy(xpath="//input[@name='postalCode']")
	private WebElement postalcode;
	
	@FindBy(xpath="//input[@name='continue']")
	private WebElement buttonContinue;
	
	@FindBy(xpath="//button[@name='finish']")
	private WebElement buttonFinish;
	
	
	@FindBy(xpath="//button[@name='back-to-products']")
	private WebElement backHome;
	
	
	public WebElement getFirstname() {
		return Firstname;
	}


	public void setFirstname(String val) {
		this.Firstname.sendKeys(val);
		
	}


	public WebElement getLastname() {
		return Lastname;
}



	public void setLastname(String val) {
		this.Lastname.sendKeys(val);;
	}


	public WebElement getPostalcode() {
		return postalcode;
	}


	public void setPostalcode(String val) {
		this.postalcode.sendKeys(val);
	}


	public WebElement getShoppingcartIcon() {
		return shoppingcartIcon;
	}


	public WebElement getCheckoutButton() {
		return checkoutButton;
	}


	public WebElement getButtonContinue() {
		return buttonContinue;
	}


	public WebElement getButtonFinish() {
		return buttonFinish;
	}


	public WebElement getBackHome() {
		return backHome;
	}
	
	
}
