package StepDefination;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObject.Homepage;
import PageObject.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	public LoginPage loginpage;
	public Homepage homepage;
	
	// generate unique email id
	public String generateEmailId()
	 {
		 return RandomStringUtils.randomAlphabetic(5);
	 }
}
