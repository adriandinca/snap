package pages;

import static context.Context.scenario;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://localhost:8080/finger/faces/cydaxFlow-home.xhtml")
public class CYDAXPage extends PageObject {

	@FindBy(css="[id$=\"nextButton\"]")
	private WebElement nextBtn;

	@FindBy(css="[id$=\"test\"]")
	private WebElement test;

	@FindBy(css="[id$=\"test2\"]")
	private WebElement test2;

	public void clickNext() {
		nextBtn.click();
	}

	public void verifyTest() {
		assertThat(test.getText(), is(scenario.getTest()));
	}

	public void verifyTest2() {
		assertThat(test2.getText(), is(scenario.getTest2()));
	}

	public void sendKeysTest() {
		test.sendKeys(scenario.getTest());
	}

	public void sendKeysTest2() {
		test2.sendKeys(scenario.getTest2());
	}

}
