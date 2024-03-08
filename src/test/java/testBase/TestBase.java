package testBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AddToCartPage;
import pages.LoginPage;
import pages.ProductsPage;

public class TestBase {

	public static WebDriver driver;
	public static LoginPage loginPageObj;
	public static ProductsPage productPageObj;
	public static AddToCartPage addToCartPageobj;
	public static Properties prop;
	public static FileInputStream fis;




	public static void setUp() throws IOException {

		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");

		prop.load(fis); 
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(prop.getProperty("Url"));

		loginPageObj = new LoginPage(driver);
		productPageObj = new ProductsPage(driver); // productpage constructor passing driver
		addToCartPageobj = new AddToCartPage(driver);

	}


	public void closeBrowser() {
		//driver.close();
	}

}
