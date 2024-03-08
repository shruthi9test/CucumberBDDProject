package stepDefintion;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class BigBasketImpl {
	@Given("^open Browser and navigate to \"([^\"]*)\"$")
	public void open_Browser_and_navigate_to(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Navigated to website");
	}

	@When("^Buy Vegitable cat \"([^\"]*)\" name \"([^\"]*)\" brand \"([^\"]*)\" grams \"([^\"]*)\"  delivery \"([^\"]*)\" payment_method \"([^\"]*)\"$")
	public void buy_Vegitable_cat_name_brand_grams_delivery_payment_method(String arg1, String arg2, String arg3,
			String arg4, String arg5, String arg6) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Buy Vegetables");
	}

	@When("^Buy Vegitable$")
	public void buy_Vegitable(DataTable data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
		List<List<String>> res = data.raw();
		System.out.println(res.get(1).get(0));
		System.out.println(res.get(1).get(1));
		System.out.println(res.get(1).get(2));
		System.out.println(res.get(1).get(3));
		System.out.println(res.get(1).get(4));
		System.out.println(res.get(1).get(5));
	}
		@When("^Buy items (.+) (.+) (.+) (.+)$")
		public void buy_items(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    System.out.println("Category: "  +arg1);
		    System.out.println("Name: "  +arg2);
		    System.out.println("Qty: "  +arg3);
		    System.out.println("Payment Method: "  +arg4);
		}
		
		
		
	}
