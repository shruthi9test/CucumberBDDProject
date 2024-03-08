package stepDefintion;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ImplimentationFile {

	@Given("^user navigates to the website \"([^\"]*)\"$")
	public void user_navigates_to_the_website(String arg1) throws Throwable {
		 System.out.println("Navigated to website");
	}

	@When("^Click on the sign in button$")
	public void click_on_the_sign_in_button() throws Throwable {
		 System.out.println("click on the signin");
	}
	@When("^Login to application using enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void login_to_application_using_enter_username_and_password(String arg1, String arg2) throws Throwable {
		 System.out.println("login in to app using " + arg1 + arg2);
	}

	@Then("^Verify webpage is opened or not$")
	public void verify_webpage_is_opened_or_not() throws Throwable {
		 System.out.println("web page opened");
	}

	
	@Then("^My account page should open$")
	public void my_account_page_should_open() throws Throwable {
		System.out.println("my account page opened ");

	}


}
