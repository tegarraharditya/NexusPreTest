package utils;

import java.net.URL;
import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;

	private static WebDriver driver;
	private static WebDriverWait waitDriver;
	public final static int TIMEOUT = 30;
	public static String initialUrl = "https://devexpress.github.io/testcafe/example/";

	private SeleniumDriver() throws Exception {
		driver = getWebDriver(initialUrl);
	}

	private WebDriver getWebDriver(String initialUrl) throws Exception {
		String executionMode;

		executionMode = System.getProperty("execution_mode");

		if (executionMode == null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().fullscreen();
			waitDriver = new WebDriverWait(driver, TIMEOUT);
			driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
			return driver;
		} else {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("os", "OS X");
			caps.setCapability("os_version", "Catalina");
			caps.setCapability("browser", "Chrome");
			// caps.setCapability("resolution", "1920*1080");
			caps.setCapability("browser_version", "80.0");
			caps.setCapability("project", "NTUC Web Automation");
			caps.setCapability("build", "Build: "+ LocalDate.now());
			caps.setCapability("browserstack.local", "false");
			caps.setCapability("browserstack.debug", "true");
			caps.setCapability("browserstack.console", "verbose");
			caps.setCapability("browserstack.networkLogs", "true");
			caps.setCapability("browserstack.selenium_version", "3.141.59");
			URL bs_url = new URL("https://" + "makasampathkumar1" + ":" + "xTdfhxLv6N1nzaxbs5yA"
					+ "@hub-cloud.browserstack.com/wd/hub");
			driver = new RemoteWebDriver(bs_url, caps);
			driver.get(initialUrl);
			return driver;
		}
	}

	public static void openPage(String url) {
		driver.get(url);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebDriverWait getWaitDriver() {
		return waitDriver;

	}

	public static void setUpDriver() throws Exception {
		if (seleniumDriver == null) {
			seleniumDriver = new SeleniumDriver();
		}
	}

	public static void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver = null;
	}

}
