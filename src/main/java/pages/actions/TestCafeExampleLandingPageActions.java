package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import pages.locators.TestCafeExampleLandingPageLocators;
import utils.SeleniumDriver;

public class TestCafeExampleLandingPageActions {

	TestCafeExampleLandingPageLocators testCafeExampleLandingPageLocators = null;

	public TestCafeExampleLandingPageActions() {
		this.testCafeExampleLandingPageLocators = new TestCafeExampleLandingPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), testCafeExampleLandingPageLocators);
	}

	public void enterNameInYourNameTextField(String name) {

		testCafeExampleLandingPageLocators.yourNameTextField.sendKeys(name);

	}

	public void clickOnPopulateButton() {

		testCafeExampleLandingPageLocators.populateButton.click();

	}

	public void selectAllTheImportantFeatures(String[] featuresArray) {
		for (String item : featuresArray) {
			switch (item) {
			case "Remote Support":
				testCafeExampleLandingPageLocators.supportForTestingRemoteDevicesCheckBox.click();
				break;
			case "Re-using JS":
				testCafeExampleLandingPageLocators.reUsingExistingJSCodeCheckBox.click();
				break;
			case "Background running":
				testCafeExampleLandingPageLocators.runningTestsInBackgroundCheckBox.click();
				break;
			case "Easy CI":
				testCafeExampleLandingPageLocators.easyContinousIntegrationCheckBox.click();
				break;
			case "Advance Traffic":
				testCafeExampleLandingPageLocators.advancedTrafficMarkupCheckBox.click();
				break;
			case "All":
				testCafeExampleLandingPageLocators.supportForTestingRemoteDevicesCheckBox.click();
				testCafeExampleLandingPageLocators.reUsingExistingJSCodeCheckBox.click();
				testCafeExampleLandingPageLocators.runningTestsInBackgroundCheckBox.click();
				testCafeExampleLandingPageLocators.easyContinousIntegrationCheckBox.click();
				testCafeExampleLandingPageLocators.advancedTrafficMarkupCheckBox.click();
				break;
			default:
				testCafeExampleLandingPageLocators.supportForTestingRemoteDevicesCheckBox.click();
				testCafeExampleLandingPageLocators.reUsingExistingJSCodeCheckBox.click();
				testCafeExampleLandingPageLocators.runningTestsInBackgroundCheckBox.click();
				testCafeExampleLandingPageLocators.easyContinousIntegrationCheckBox.click();
				testCafeExampleLandingPageLocators.advancedTrafficMarkupCheckBox.click();
				testCafeExampleLandingPageLocators.supportForTestingRemoteDevicesCheckBox.click();
				testCafeExampleLandingPageLocators.reUsingExistingJSCodeCheckBox.click();
				testCafeExampleLandingPageLocators.runningTestsInBackgroundCheckBox.click();
				testCafeExampleLandingPageLocators.easyContinousIntegrationCheckBox.click();
				testCafeExampleLandingPageLocators.advancedTrafficMarkupCheckBox.click();
			}
		}

	}

	public void selectTheTriedTestCafeCheckBox(String userInput) {

		switch (userInput) {
		case "y":
			testCafeExampleLandingPageLocators.triedTestCafeCheckBox.click();
			break;
		default:
			testCafeExampleLandingPageLocators.triedTestCafeCheckBox.click();
			testCafeExampleLandingPageLocators.triedTestCafeCheckBox.click();
		}

	}

	public void verifyTheRatingSliderIsEnabled() {

		testCafeExampleLandingPageLocators.slider.isEnabled();

	}

	public void verifyTheCommentsFreeTextIsEnabled() {

		testCafeExampleLandingPageLocators.commentsFreeTextField.isEnabled();

	}

	public void chooseThePrimaryOS(String userInput) {

		switch (userInput) {
		case "Windows":
			testCafeExampleLandingPageLocators.windowsRadioButton.click();
			break;
		case "Mac":
			testCafeExampleLandingPageLocators.macOsRadioButton.click();
			break;
		default:
			testCafeExampleLandingPageLocators.linuxRadioButton.click();
		}

	}

	public void chooseTheTestCafeInterface(String userInput) {

		Select interfaceDropdown = new Select(testCafeExampleLandingPageLocators.preferredInterfaceDropDown);
		switch (userInput) {
		case "JavaScript API":
			interfaceDropdown.selectByVisibleText("JavaScript API");
			break;
		case "both":
			interfaceDropdown.selectByVisibleText("Both");
			break;
		default:
			interfaceDropdown.selectByVisibleText("Command Line");
		}
	}

	public void clickTheSubmitButton() {

		Actions actions = new Actions(SeleniumDriver.getDriver());
		actions.moveToElement(testCafeExampleLandingPageLocators.submitButton);
		actions.build().perform();
		testCafeExampleLandingPageLocators.submitButton.click();
	}

	public void enterCommentsInFreeText(String UserInput) {
		if (testCafeExampleLandingPageLocators.commentsFreeTextField.isEnabled()) {
			testCafeExampleLandingPageLocators.commentsFreeTextField.sendKeys(UserInput);
		}

	}

}
