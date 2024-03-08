package stepDefintion;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksImpl {
@Before

public void beforeScenario() {
	System.out.println("Before Running Scenario");
}

@After

public void afterScenario() {
	System.out.println("After running Scenario");
}
}
