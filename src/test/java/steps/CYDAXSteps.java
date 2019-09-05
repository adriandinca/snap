package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CYDAXPage;

public class CYDAXSteps {

	private CYDAXPage page;

	@Given("^I am on the CYDAX home page\\.$")
	public void i_am_on_the_CYDAX_home_page() {
		page.open();
	}

	@Given("^I click next\\.$")
	public void i_click_next() {
		page.clickNext();
	}

	@Given("^I copy the test(\\d+) value\\.$")
	public void i_copy_the_test_value(int arg1) {
	    
	}

	@Then("^the test value is displayed correctly\\.$")
	public void the_test_value_is_displayed_correctly() {
	    page.verifyTest();
	}

	@Then("^the second test value is displayed correctly\\.$")
	public void the_second_test_value_is_displayed_correctly() {
		page.verifyTest2();
	    
	}

	@When("^I paste the test value in the test field\\.$")
	public void i_paste_the_test_value_in_the_test_field() {
		page.sendKeysTest();
	}

	@When("^I paste the second test value in the second test field\\.$")
	public void i_paste_the_second_test_value_in_the_second_test_field() {
		page.sendKeysTest2();
	}

	@Given("^I wait for (\\d+) seconds\\.$")
	public void i_wait_for_seconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
