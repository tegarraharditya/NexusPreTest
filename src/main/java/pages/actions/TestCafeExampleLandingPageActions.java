package pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;
import pages.locators.TestCafeExampleLandingPageLocators;
import utils.SeleniumDriver;

public class TestCafeExampleLandingPageActions {

	TestCafeExampleLandingPageLocators testCafeExampleLandingPageLocators = null;

	public TestCafeExampleLandingPageActions() {
		this.testCafeExampleLandingPageLocators = new TestCafeExampleLandingPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), testCafeExampleLandingPageLocators);
	}

	public void enterNameInYourNameTextField(String name) {
		if(name.isEmpty()){
			clickOnPopulateButton();
		}
		else {
			testCafeExampleLandingPageLocators.yourNameTextField.sendKeys(name);
			String value = testCafeExampleLandingPageLocators.yourNameTextField.getAttribute("value");
			Assert.assertTrue(value.equalsIgnoreCase(name));
		}
	}

	public void clickOnPopulateButton() {
		testCafeExampleLandingPageLocators.populateButton.click();
		SeleniumDriver.getDriver().switchTo().alert().accept();
		String value = testCafeExampleLandingPageLocators.yourNameTextField.getAttribute("value");
		Assert.assertTrue(value.equalsIgnoreCase("Peter Parker"));
	}

	public void selectAllTheImportantFeatures(String[] featuresArray) {
		for (String item : featuresArray) {
			switch (item) {
			case "Remote Support":
				testCafeExampleLandingPageLocators.supportForTestingRemoteDevicesCheckBox.click();
				Assert.assertTrue(testCafeExampleLandingPageLocators.supportForTestingRemoteDevicesCheckBox.isSelected());
				break;
			case "Re-using JS":
				testCafeExampleLandingPageLocators.reUsingExistingJSCodeCheckBox.click();
				Assert.assertTrue(testCafeExampleLandingPageLocators.reUsingExistingJSCodeCheckBox.isSelected());
				break;
			case "Background running":
				testCafeExampleLandingPageLocators.runningTestsInBackgroundCheckBox.click();
				Assert.assertTrue(testCafeExampleLandingPageLocators.runningTestsInBackgroundCheckBox.isSelected());
				break;
			case "Easy CI":
				testCafeExampleLandingPageLocators.easyContinousIntegrationCheckBox.click();
				Assert.assertTrue(testCafeExampleLandingPageLocators.easyContinousIntegrationCheckBox.isSelected());
				break;
			case "Advance Traffic":
				testCafeExampleLandingPageLocators.advancedTrafficMarkupCheckBox.click();
				Assert.assertTrue(testCafeExampleLandingPageLocators.advancedTrafficMarkupCheckBox.isSelected());
				break;
			case "All":
				testCafeExampleLandingPageLocators.supportForTestingRemoteDevicesCheckBox.click();
				Assert.assertTrue(testCafeExampleLandingPageLocators.supportForTestingRemoteDevicesCheckBox.isSelected());
				testCafeExampleLandingPageLocators.reUsingExistingJSCodeCheckBox.click();
				Assert.assertTrue(testCafeExampleLandingPageLocators.reUsingExistingJSCodeCheckBox.isSelected());
				testCafeExampleLandingPageLocators.runningTestsInBackgroundCheckBox.click();
				Assert.assertTrue(testCafeExampleLandingPageLocators.runningTestsInBackgroundCheckBox.isSelected());
				testCafeExampleLandingPageLocators.easyContinousIntegrationCheckBox.click();
				Assert.assertTrue(testCafeExampleLandingPageLocators.easyContinousIntegrationCheckBox.isSelected());
				testCafeExampleLandingPageLocators.advancedTrafficMarkupCheckBox.click();
				Assert.assertTrue(testCafeExampleLandingPageLocators.advancedTrafficMarkupCheckBox.isSelected());
				break;
			default:
			    uncheckTheElement(testCafeExampleLandingPageLocators.supportForTestingRemoteDevicesCheckBox);
				Assert.assertFalse(testCafeExampleLandingPageLocators.supportForTestingRemoteDevicesCheckBox.isSelected());
				uncheckTheElement(testCafeExampleLandingPageLocators.reUsingExistingJSCodeCheckBox);
				Assert.assertFalse(testCafeExampleLandingPageLocators.reUsingExistingJSCodeCheckBox.isSelected());
				uncheckTheElement(testCafeExampleLandingPageLocators.runningTestsInBackgroundCheckBox);
				Assert.assertFalse(testCafeExampleLandingPageLocators.runningTestsInBackgroundCheckBox.isSelected());
				uncheckTheElement(testCafeExampleLandingPageLocators.easyContinousIntegrationCheckBox);
				Assert.assertFalse(testCafeExampleLandingPageLocators.easyContinousIntegrationCheckBox.isSelected());
				uncheckTheElement(testCafeExampleLandingPageLocators.advancedTrafficMarkupCheckBox);
				Assert.assertFalse(testCafeExampleLandingPageLocators.advancedTrafficMarkupCheckBox.isSelected());
			}
		}
	}

	public void selectTheTriedTestCafeCheckBox(String userInput) {

		switch (userInput) {

			case ("y"): case("YES"): case("Y"): case("yes"): case ("Yes"):
			testCafeExampleLandingPageLocators.triedTestCafeCheckBox.click();
			verifyTheRatingSliderIsEnabled();
			verifyTheCommentsFreeTextIsEnabled();
			break;
			case ("n"): case("NO"): case("N"): case("no"): case ("No"):
			uncheckTheElement(testCafeExampleLandingPageLocators.triedTestCafeCheckBox);
			Assert.assertFalse(testCafeExampleLandingPageLocators.triedTestCafeCheckBox.isSelected());
			break;
		}
	}

	public void verifyTheRatingSliderIsEnabled() {
		Assert.assertTrue(testCafeExampleLandingPageLocators.slider.isEnabled());
	}

	public void setTheTestCafeRating(String userInput) {
		WebElement slider = testCafeExampleLandingPageLocators.slider;
		JavascriptExecutor js = (JavascriptExecutor) SeleniumDriver.getDriver();

		switch (userInput) {
			case "2":
				js.executeScript("arguments[0].setAttribute('style', 'left: 11.11%;')",slider);
				break;
			case "3":
				js.executeScript("arguments[0].setAttribute('style', 'left: 22.22%;')",slider);
				break;
			case "4":
				js.executeScript("arguments[0].setAttribute('style', 'left: 33.33%;')",slider);
				break;
			case "5":
				js.executeScript("arguments[0].setAttribute('style', 'left: 44.44%;')",slider);
				break;
			case "6":
				js.executeScript("arguments[0].setAttribute('style', 'left: 55.55%;')",slider);
				break;
			case "7":
				js.executeScript("arguments[0].setAttribute('style', 'left: 66.66%;')",slider);
				break;
			case "8":
				js.executeScript("arguments[0].setAttribute('style', 'left: 77.77%;')",slider);
				break;
			case "9":
				js.executeScript("arguments[0].setAttribute('style', 'left: 88.88%;')",slider);
			case "10":
				js.executeScript("arguments[0].setAttribute('style', 'left: 100%;')",slider);
				break;
			default:
				js.executeScript("arguments[0].setAttribute('style', 'left: 0%;')",slider);
		}

	}

	public void verifyTheCommentsFreeTextIsEnabled() {

		Assert.assertTrue(testCafeExampleLandingPageLocators.commentsFreeTextField.isEnabled());
	}

	public void chooseThePrimaryOS(String userInput) {

		switch (userInput) {
		case "Windows":
			testCafeExampleLandingPageLocators.windowsRadioButton.click();
			Assert.assertTrue(testCafeExampleLandingPageLocators.windowsRadioButton.isSelected());
			break;
		case "Mac":
			testCafeExampleLandingPageLocators.macOsRadioButton.click();
			Assert.assertTrue(testCafeExampleLandingPageLocators.macOsRadioButton.isSelected());
			break;
		default:
			testCafeExampleLandingPageLocators.linuxRadioButton.click();
			Assert.assertTrue(testCafeExampleLandingPageLocators.linuxRadioButton.isSelected());
		}

	}

	public void chooseTheTestCafeInterface(String userInput) {

		Select interfaceDropdown = new Select(testCafeExampleLandingPageLocators.preferredInterfaceDropDown);
		switch (userInput) {
		case "JavaScript API":
			interfaceDropdown.selectByVisibleText("JavaScript API");
			Assert.assertTrue(interfaceDropdown.getFirstSelectedOption().getText().equalsIgnoreCase("JavaScript API"));
			break;
		case "both":
			interfaceDropdown.selectByVisibleText("Both");
			Assert.assertTrue(interfaceDropdown.getFirstSelectedOption().getText().equalsIgnoreCase("Both"));
			break;
		default:
			interfaceDropdown.selectByVisibleText("Command Line");
			Assert.assertTrue(interfaceDropdown.getFirstSelectedOption().getText().equalsIgnoreCase("Command Line"));
		}
	}

	public void clickTheSubmitButton() {

		Actions actions = new Actions(SeleniumDriver.getDriver());
		actions.moveToElement(testCafeExampleLandingPageLocators.submitButton);
		actions.build().perform();
		testCafeExampleLandingPageLocators.submitButton.click();
		Assert.assertTrue(SeleniumDriver.getDriver().getCurrentUrl().equalsIgnoreCase("https://devexpress.github.io/testcafe/example/thank-you.html"));
	}

	public void enterCommentsInFreeText(String UserInput) {
		if (testCafeExampleLandingPageLocators.commentsFreeTextField.isEnabled()) {
			testCafeExampleLandingPageLocators.commentsFreeTextField.sendKeys(UserInput);
		}
	}

	public void uncheckTheElement(WebElement element){
	    if(element.isSelected()) {
            element.click();
        }
	    else{
	        element.click();
	        element.click();
        }
    }
}
