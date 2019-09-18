package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class Page extends PageObject {

	@FindBy(css="[id$=\"serviceRequest\"]")
	protected WebElement serviceRequest;
	
	@FindBy(css="[id$=\"country\"]")
	protected WebElement country;
	
	@FindBy(css="[id$=\"agreement\"]")
	protected WebElement agreement;
	
	@FindBy(css="[id$=\"company\"]")
	protected WebElement company;

	@FindBy(css="[id$=\"partNumber\"]")
	protected WebElement partNumber;

	@FindBy(css="[id$=\"nextBtn\"]")
	private WebElement nextBtn;

	public void clickNext() {
		nextBtn.click();
	}

}
