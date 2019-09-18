package steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.Page;

public class Steps {

	private Page page;

	@Given("^Snap clicks next\\.$")
	public void on_the_CRM_page_I_click_next() {
		clickNext();
	}

	@Then("^Snap Clicks search\\.$")
	public void snap_Clicks_search() {
		clickNext();
	}

	@Then("^Snap Clicks edit\\.$")
	public void snap_Clicks_edit() {
		clickNext();
	}

	@Then("^Snap Clicks finnish\\.$")
	public void snap_Clicks_finnish() {
		clickNext();
	}

	@Then("^Snap Clicks 'Go to search'\\.$")
	public void snap_Clicks_Go_to_search() {
		clickNext();
	}

	private void clickNext() {
		page.clickNext();
	}

	@Given("^Snap waits for (\\d+) seconds\\.$")
	public void i_wait_for_seconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
