package steps;

import cucumber.api.java.en.Given;
import pages.CRMPage;

public class CRMSteps { 
	
	CRMPage crmPage;
	
   @Given("^I am on the crm home page.$") 
   public void i_am_on_the_crm_home_page() { 
      crmPage.open();
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