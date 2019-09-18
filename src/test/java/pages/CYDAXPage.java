package pages;

import static context.Context.scenario;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:8080/finger/faces/cydaxFlow-home.xhtml")
public class CYDAXPage extends Page {

	public void sendKeysSRNumber() {
		serviceRequest.sendKeys(scenario.getServiceRequest());
	}

	public void sendKeysCountry() {
		country.sendKeys(scenario.getCountry());
	}

	public void sendKeysAgreement() {
		agreement.sendKeys(scenario.getAgreement());
	}

	public void sendKeysCompany() {
		company.sendKeys(scenario.getCompany());
	}

	public void sendKeysPartNumber() {
		partNumber.sendKeys(scenario.getPartNumber());
	}

}
