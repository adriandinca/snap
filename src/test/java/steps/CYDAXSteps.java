package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.CYDAXPage;

public class CYDAXSteps {

	private CYDAXPage page;

	@Given("^Snap is on the CYDAX home page\\.$")
	public void i_am_on_the_CYDAX_home_page() {
		page.open();
	}

	@Then("^Snap pastes the service request number\\.$")
	public void snap_pastes_the_service_request_number() {
		page.sendKeysSRNumber();
	}
	
	@Then("^Snap pastes the country\\.$")
	public void snap_pastes_the_country() {
		page.sendKeysCountry();
	}

	@Then("^Snap pastes the agreement type\\.$")
	public void snap_pastes_the_agreement_type() {
		page.sendKeysAgreement();
	}

	@Then("^Snap pastes the company\\.$")
	public void snap_pastes_the_company() {
		page.sendKeysCompany();
	}

	@Then("^Snap pastes the part number\\.$")
	public void snap_pastes_the_part_number() {
		page.sendKeysPartNumber();
	}

}
