package StepDefination;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObject.Homepage;
import PageObject.LoginPage;
import PageObject.VerticalPage;

public class BaseClass {
	public static WebDriver driver;
	public LoginPage loginpage;
	public Homepage homepage;
	public VerticalPage verticalpage;

	// generate unique email id
	public String generateEmailId()
	 {
		 return RandomStringUtils.randomAlphabetic(5);
	 }
}
