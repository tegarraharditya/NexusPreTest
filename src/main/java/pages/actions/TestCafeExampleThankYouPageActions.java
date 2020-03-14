package pages.actions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.locators.TestCafeExampleThankYouPageLocators;
import utils.SeleniumDriver;

public class TestCafeExampleThankYouPageActions {
	
TestCafeExampleThankYouPageLocators  testCafeExampleThankYouPageLocators = null;
	
	
	public TestCafeExampleThankYouPageActions() {
		this.testCafeExampleThankYouPageLocators = new TestCafeExampleThankYouPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), testCafeExampleThankYouPageLocators);
	}
	
	public void assertTheNameInThankYouPage(String expected) {
		WebDriverWait wait = new WebDriverWait(SeleniumDriver.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(testCafeExampleThankYouPageLocators.thankYouNameHeaderField));
		if(expected.isEmpty()){
			expected = "Peter Parker";
		}
		String actualText = testCafeExampleThankYouPageLocators.thankYouNameHeaderField.getText();
		assertTrue(actualText.contains(expected));
	}

}
