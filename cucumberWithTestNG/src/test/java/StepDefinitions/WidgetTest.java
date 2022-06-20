package StepDefinitions;

import java.io.IOException;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ebay;

public class WidgetTest {
	@After(order = 1)
	public void cleanUp() {
		ebay.refreshBrowser();
	}

	@Given("User should be on test bench")
	public void user_should_be_on_test_bench() throws IOException {
		ebay.confirmCorrectUrl();
	}
	
	

	@When("^user enters (.*) in full name field$")
	public void user_enters_in_full_name_field(String string) {
		ebay.SearchingForPhone(string);
		
	
	}
	
	
	
	

	@When("^user enters (.*) in email field$")
	public void user_enters_in_email_field(String email) {
		ebay.ClickingOnSaved(null);
		ebay.backBtn(null);
		ebay.ClickingOnElectronics(null);
		ebay.backBtn(null);
		
		ebay.ClickingOnFashion(null);
		ebay.backBtn(null);
		
		ebay.ClickingOnElectronics(null);
		ebay.backBtn(null);
		
		ebay.ClickingOnHome(null);
		ebay.backBtn(null);
		
		ebay.ClickingOnSports(null);
		ebay.backBtn(null);
		
		ebay.ClickingOnCollectibles(null);
		ebay.backBtn(null);
		
		ebay.ClickingOnIndustrial(null);
		ebay.backBtn(null);
		
		ebay.ClickingOnMotors(null);
		ebay.backBtn(null);
		
		ebay.ClickingOnDeals(null);
		ebay.backBtn(null);
		
		
		
		ebay.ClickingOnSell(null);
		ebay.backBtn(null);
		
		
	}



	@Then("mouseovers on images")
	public void mouseovers_on_images() {
		ebay.moveToElem();
	}

}
