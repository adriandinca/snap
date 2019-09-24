package steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.CRMPage;

public class CRMSteps {

	private CRMPage page;

	@Given("^Snap is on the CRM home page.$")
	public void i_am_on_the_crm_home_page() {
		page.open();
	}

	@When("^the agreement type is PM Kit\\.$")
	public void the_agreement_type_is_PM_Kit() {
		assertEquals(page.getAgreement(), "PM Kit");
	}

	@Given("^Snap copies the service request number\\.$")
	public void on_the_CRM_page_Snap_copies_the_rervice_request_number() {
		page.copySRNumber();
	}

	@Given("^Snap copies the country$")
	public void on_the_CRM_page_Snap_copies_the_country() {
		page.copyCountry();
	}

	@Given("^Snap copies the agreement$")
	public void on_the_CRM_page_Snap_copies_the_agreement() {
		page.copyAgreement();
	}

	@Given("^Snap copies the company$")
	public void on_the_CRM_page_Snap_copies_the_company() {
		page.copyCompany();
	}

	@Given("^Snap copies the part numer$")
	public void on_the_CRM_page_Snap_copies_the_part_numer() {
		page.copyPartNumber();
	}
}