package StepDefination;



import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import PageObject.Homepage;
import PageObject.LoginPage;
import PageObject.VerticalPage;



public class BaseClass {
	public static WebDriver driver;
	public LoginPage loginpage;
	public Homepage homepage;
	public VerticalPage verticalpage;
	public static Logger log;
	
	// generate unique email id
	public String generateEmailId()
	 {
		 return RandomStringUtils.randomAlphabetic(5);
	 }
}
