package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

	WebDriver driver;

	public ProductsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='item_4_title_link']")
	private WebElement sauceLabsBackpack;

	@FindBy(xpath = "//img[@class='inventory_details_img']")
	private WebElement image;

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement addToCart;

	public WebElement getSauceLabsBackpack() {
		return sauceLabsBackpack;
	}

	public WebElement getImage() {
		return image;
	}

	public WebElement getAddtoCart() {
		return addToCart;
	}

}
