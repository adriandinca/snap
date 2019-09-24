package pages;

import static context.Context.scenario;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:8080/finger/faces/crmFlow-home.xhtml")
public class CRMPage extends Page {
	
	public void copySRNumber() {
		scenario.setServiceRequest(serviceRequest.getAttribute("value"));
	}

	public void copyCountry() {
		scenario.setCountry(country.getAttribute("value"));
	}

	public void copyAgreement() {
		scenario.setAgreement(agreement.getAttribute("value"));
	}

	public String getAgreement() {
		return scenario.getAgreement();
	}

	public void copyCompany() {
		scenario.setCompany(company.getAttribute("value"));
	}

	public void copyPartNumber() {
		scenario.setPartNumber(partNumber.getAttribute("value"));
	}

}
