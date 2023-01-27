package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Homepage;
import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef {
	
	public WebDriver driver;
	public LoginPage loginpage;
	public Homepage homepage;
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		 WebDriverManager.chromedriver().setup();
		   driver= new ChromeDriver();
		   loginpage= new LoginPage(driver);
		   homepage= new Homepage(driver);
	}

	@When("user open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);
	}

	@When("setUsername as {string} setPassword {string} And click on submit button")
	public void set_username_as_set_password_and_click_on_submit_button(String email, String pwd) throws InterruptedException {
		loginpage.setUsername(email);
		loginpage.setPassword(pwd);
		loginpage.clickSubmit();
		Thread.sleep(20000);
	}

	@Then("page title will be {string}")
	public void page_title_will_be(String string) {
		driver.getTitle();
	}

	/*@Then("close the browser")
	public void close_the_browser() {
		driver.quit();
	}*/
	
	///////////////////////////HOME Page Feature Validation//////////////////
	@When("check menu button Then Functions AndNode type And Attributes")
	public void check_menu_button_then_functions_and_node_type_and_attributes() throws InterruptedException {
	    homepage.clickMenubutton();
	    Thread.sleep(20000);
	    homepage.txtFunctions();
	    homepage.txtNodeType();
	    homepage.txtAttributes();;
    }

	@When("Metrics And Dictionary And Roles And OOG Management And Search button AndAdd Vertical")
	public void metrics_and_dictionary_and_roles_and_oog_management_and_search_button_and_add_vertical() {
		homepage.txtMetrics();
		homepage.txtDictionary();
		homepage.txtRoles();
		homepage.txtOOfManagement();
		homepage.txtSearchButton();
		homepage.txtAddvertical();
	}

	@When("sign out button")
	public void sign_out_button() {
		homepage.txtsignout();
	}
}
