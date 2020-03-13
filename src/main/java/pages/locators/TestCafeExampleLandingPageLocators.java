package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestCafeExampleLandingPageLocators {
	
	@FindBy(how = How.CSS, using="#developer-name")
	public WebElement yourNameTextField;
	
	@FindBy(how = How.CSS, using="#populate")
	public WebElement populateButton;
	
	@FindBy(how = How.CSS, using="#remote-testing")
	public WebElement supportForTestingRemoteDevicesCheckBox;
	
	@FindBy(how = How.CSS, using="#reusing-js-code")
	public WebElement reUsingExistingJSCodeCheckBox;
	
	@FindBy(how = How.CSS, using="#background-parallel-testing")
	public WebElement runningTestsInBackgroundCheckBox;
	
	@FindBy(how = How.CSS, using="#continuous-integration-embedding")
	public WebElement easyContinousIntegrationCheckBox;
	
	@FindBy(how = How.CSS, using="#traffic-markup-analysis")
	public WebElement advancedTrafficMarkupCheckBox;
	
	@FindBy(how = How.CSS, using="#tried-test-cafe")
	public WebElement triedTestCafeCheckBox;
	
	@FindBy(how = How.CSS, using="#slider > span")
	public WebElement slider;
	
	@FindBy(how = How.CSS, using="#windows")
	public WebElement windowsRadioButton;
	
	@FindBy(how = How.CSS, using="#macos")
	public WebElement macOsRadioButton;
	
	@FindBy(how = How.CSS, using="#linux")
	public WebElement linuxRadioButton;
		
	@FindBy(how = How.CSS, using="#preferred-interface")
	public WebElement preferredInterfaceDropDown;
	
	@FindBy(how = How.CSS, using="#option")
	public WebElement option;
	
	@FindBy(how = How.CSS, using="#comments")
	public WebElement commentsFreeTextField;
	
	@FindBy(how = How.CSS, using="#submit-button")
	public WebElement submitButton;
	
}
