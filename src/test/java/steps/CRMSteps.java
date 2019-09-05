package steps;

import cucumber.api.java.en.Given;
import pages.CRMPage;

public class CRMSteps {

	private CRMPage page;

	@Given("^I am on the CRM home page.$")
	public void i_am_on_the_crm_home_page() {
		page.open();
	}

	@Given("^on the CRM page I click next\\.$")
	public void on_the_CRM_page_I_click_next() {
		page.clickNext();
	}

	@Given("^on the CRM page I copy the test value\\.$")
	public void on_the_CRM_page_I_copy_the_test_value() {
		page.copyTest();
	}

	@Given("^on the CRM page I copy the second test value\\.$")
	public void on_the_CRM_page_I_copy_the_second_test_value() {
		page.copyTest2();
	}

}