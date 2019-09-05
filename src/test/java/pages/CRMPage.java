package pages;

import static context.Context.scenario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:8080/finger/faces/crmFlow-home.xhtml")
public class CRMPage extends PageObject {

	@FindBy(css="[id$=\"nextButton\"]")
	private WebElement nextBtn;

	@FindBy(css="[id$=\"crm-test\"]")
	private WebElement crmTest;
	
	@FindBy(css="[id$=\"crm-test2\"]")
	private WebElement crmTest2;
	
	public void copyTest() {
		scenario.setTest(crmTest.getAttribute("value"));
		System.out.println("test: "+scenario.getTest());
	}

	public void copyTest2() {
		scenario.setTest2(crmTest2.getAttribute("value"));
		System.out.println("test2: "+scenario.getTest2());
	}

	public void clickNext() {
		nextBtn.click();
	}

}
