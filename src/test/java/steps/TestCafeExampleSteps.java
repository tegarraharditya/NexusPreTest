package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.actions.*;
import utils.SeleniumDriver;

public class TestCafeExampleSteps {
	
	
	TestCafeExampleLandingPageActions testCafeExampleLandingPageActions = new TestCafeExampleLandingPageActions();
	TestCafeExampleThankYouPageActions testCafeExampleThankYouPageActions = new TestCafeExampleThankYouPageActions();
	
	
	@Given("^I am on the Test cafe example page \"([^\"]*)\"$")
	public void i_am_on_the_Test_cafe_example_page(String BaseURL) throws Throwable {
		SeleniumDriver.openPage(BaseURL);
	}
	

	@When("^I enter the \"([^\"]*)\" in Name field$")
	public void i_enter_the_in_Name_field(String userName) throws Throwable {
		testCafeExampleLandingPageActions.enterNameInYourNameTextField(userName);
	}
	

	@And("^I select the \"([^\"]*)\" from list of features which are important to me$")
	public void i_select_the_from_list_of_features_which_are_important_to_me(String arg1) throws Throwable {
		String[] featuresArray = arg1.split(", ");
		testCafeExampleLandingPageActions.selectAllTheImportantFeatures(featuresArray);
	}

	@And("^I check the \"([^\"]*)\" check box$")
	public void i_check_the_check_box(String userInput) throws Throwable {
		testCafeExampleLandingPageActions.selectTheTriedTestCafeCheckBox(userInput);
	    
	}

	@And("^I provide \"([^\"]*)\" for TestCafe$")
	public void i_provide_for_TestCafe(String arg1) throws Throwable {
		testCafeExampleLandingPageActions.setTheTestCafeRating(arg1);
	    
	}

	@And("^I select my \"([^\"]*)\" from the list of OS options in radio buttons$")
	public void i_select_my_from_the_list_of_options_in_radio_buttons(String userInput) throws Throwable {
		testCafeExampleLandingPageActions.chooseThePrimaryOS(userInput);
		   
	}

	@And("^I select my desired \"([^\"]*)\"$")
	public void i_select_my_desired(String userInput) throws Throwable {
		testCafeExampleLandingPageActions.chooseTheTestCafeInterface(userInput);
	}

	@And("^I provide the \"([^\"]*)\" in the comments section$")
	public void i_provide_the_in_the_comments_section(String userInput) throws Throwable {
		testCafeExampleLandingPageActions.enterCommentsInFreeText(userInput);
	}

	@And("^I click on \"([^\"]*)\" button$")
	public void i_click_on_button(String arg1) throws Throwable {
		testCafeExampleLandingPageActions.clickTheSubmitButton();
	    
	}

	@Then("^I verify the \"([^\"]*)\" in Thank you page$")
	public void i_verify_the_in_Thank_you_page(String arg1) {
		testCafeExampleThankYouPageActions.assertTheNameInThankYouPage(arg1);
	}
	
}
