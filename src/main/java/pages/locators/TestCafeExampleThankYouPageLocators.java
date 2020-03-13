package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestCafeExampleThankYouPageLocators {
	@FindBy(how = How.CSS, using="#article-header")
	public WebElement thankYouNameHeaderField;

}
