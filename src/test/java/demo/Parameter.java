package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Parameter {
	private WebDriver webDriver;

	@BeforeTest
	@Parameters({ "brower" })
	public void setUp() {
		wait = new WebDriverWait(webDriver, 20);

	}

}
