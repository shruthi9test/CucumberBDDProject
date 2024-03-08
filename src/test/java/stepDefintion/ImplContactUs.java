package stepDefintion;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ImplContactUs {
	@Given("^open browser and navigate to \"([^\"]*)\"$")
	public void open_browser_and_navigate_to(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Navigated to website");
	}

	@When("^Click on Contact us$")
	public void click_on_Contact_us() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click on the contact us");
	}

	@Then("^verify contact us page displayed or not$")
	public void verify_contact_us_page_displayed_or_not() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Contact Us page opened");
	}
}
