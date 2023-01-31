package StepDefination;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

import PageObject.Homepage;
import PageObject.LoginPage;
import PageObject.VerticalPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.PropertyConfigurator;


public class Stepdef extends BaseClass {
	
	@Before
	public void setup()
	{
		 log = Logger.getLogger("preconfig");
		PropertyConfigurator.configure("log4j2.properties");
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
	}
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		
		   loginpage= new LoginPage(driver);
		   homepage= new Homepage(driver);
		   verticalpage=new VerticalPage(driver);
		  
	}

	@When("user open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);
		log.info("URL is Opened");
	}

	@When("setUsername as {string} setPassword {string} And click on submit button")
	public void set_username_as_set_password_and_click_on_submit_button(String email, String pwd) throws InterruptedException {
		loginpage.setUsername(email);
		log.info("username entered");
		loginpage.setPassword(pwd);
		log.info("Password entered");
		loginpage.clickSubmit();
		log.info("clicked on submit button");
		Thread.sleep(20000);
	}

	@Then("page title will be {string}")
	public void page_title_will_be(String string) {
		driver.getTitle();
		log.info("we got a page title");
	}

	/*@Then("close the browser")
	public void close_the_browser() {
		driver.quit();
		log.info("quit browser");
	}*/
	
	///////////////////////////HOME Page Feature Validation//////////////////
	@When("check menu button Then Functions AndNode type And Attributes")
	public void check_menu_button_then_functions_and_node_type_and_attributes() throws InterruptedException {
	    homepage.clickMenubutton();
	    log.info("clicked on menu button");
	    Thread.sleep(20000);
	    String fun= homepage.txtFunctions();
	    if(fun.equals("Functions"))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
	    log.info("checked function button");
	    String nodetype= homepage.txtNodeType();
	    if(nodetype.equals("Node Type"))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
	    log.info("checked node type button");
	    String Attr = homepage.txtAttributes();
	    if(Attr.equals("Attributes"))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
	    log.info("checked attribute button");
    }

	@When("Metrics And Dictionary And Roles And OOG Management And Search button AndAdd Vertical")
	public void metrics_and_dictionary_and_roles_and_oog_management_and_search_button_and_add_vertical() {
		String matrix= homepage.txtMetrics();
		 if(matrix.equals("Metrics"))
		    {
		    	Assert.assertTrue(true);
		    }
		    else
		    {
		    	Assert.assertTrue(false);
		    }
		 log.info("Checked metrics button");
		String dic=homepage.txtDictionary();
		if(dic.equals("Dictionary"))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
		log.info("Checked dictionary button");
		String Roles= homepage.txtRoles();
		if(Roles.equals("Roles"))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
		log.info("checked Roles button");
		String oog=homepage.txtOOfManagement();
		if(oog.equals("OOG Management"))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
		log.info("checked oog management button");
		Assert.assertEquals("", homepage.txtSearchButton());
		log.info("check search placeholder");
		String Addvertical= homepage.txtAddvertical();
		if(Addvertical.equals("+ Add Vertical"))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
		log.info("Checked add vertical button");
	}

	@When("sign out button")
	public void sign_out_button() {
		Assert.assertEquals("", homepage.txtsignout());
		log.info("Checked sign out button");
	}
	
	///////////////////Add Vertical/////////////////////
	
	
	@When("Click on the Add vertical button")
	public void click_on_the_add_vertical_button() throws InterruptedException {
		 homepage.txtAddvertical1();
		 log.info("Clicked on add vertical button");
		 Thread.sleep(30000);
	}

	@Then("write Vertical name")
	public void write_vertical_name() {
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  
		verticalpage.setVerticalname("username"+ randomInt +"@gmail.com"); 
		log.info("Clicked on vertical name");
	}

	@Then("short name And description")
	public void short_name_and_description() {
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  
		verticalpage.setVerticalShorttext("username"+ randomInt);
		log.info("Entered short name");
		verticalpage.txtverticaldescription("username"+ randomInt);
		log.info("Entered description");
	}

	@When("click on time range Then select the time range as per desire from list")
	public void click_on_time_range_then_select_the_time_range_as_per_desire_from_list() throws InterruptedException {
		Thread.sleep(30000);
		verticalpage.SelectTimeRange();
		log.info("clicked on time range button");
	    verticalpage.SelectInputTimeRange();
	    log.info("Selected time range");
	    Thread.sleep(10000);
	    verticalpage.SelectTimeRange();
	}

	@When("click on Data range Then select the desire value from the list")
	public void click_on_data_range_then_select_the_desire_value_from_the_list() throws InterruptedException {
		verticalpage.txtdataRange();
		log.info("clicked on data range button");
		Thread.sleep(20000);
		verticalpage.dropdowntextdataRange();
		log.info("selected data range");
	}

	@When("click on Trend Range Then select the desire value from the list")
	public void click_on_trend_range_then_select_the_desire_value_from_the_list() throws InterruptedException {
		verticalpage.txttrendrange();
		log.info("clicked on trend range button");
		Thread.sleep(20000);
		verticalpage.dropdowntexttrendRange();
		log.info("selected trend range");
	}

	@When("click on Context Range Then select the desire value from the list")
	public void click_on_context_range_then_select_the_desire_value_from_the_list() throws InterruptedException {
		verticalpage.txtcontextrange();
		log.info("clicked on context range button");
		Thread.sleep(20000);
		verticalpage.dropdowncontextRange1();  
		log.info("selected context range");
	}

	@When("click on Contributors Range Then select the desire value from the list")
	public void click_on_contributors_range_then_select_the_desire_value_from_the_list() throws InterruptedException {
		verticalpage.txtContributors();
		log.info("clicked on contributor range button");
		Thread.sleep(20000);
		verticalpage.dropdowncotributorsRange();
		log.info("selected conttributor range");
	}

	@When("click on Recommended Action Range Then select the desire value from the list")
	public void click_on_recommended_action_range_then_select_the_desire_value_from_the_list() throws InterruptedException {
		verticalpage.txtRecomendedAction();
		log.info("clicked on recomended range button");
		Thread.sleep(20000);
		verticalpage.dropdownRecomendedActionRange();
		log.info("selected recomended range");
	}

	@When("click on Prediction Range Then select the desire value from the list")
	public void click_on_prediction_range_then_select_the_desire_value_from_the_list() throws InterruptedException {
		verticalpage.txtprediction();
		log.info("clicked on prediction range button");
		Thread.sleep(20000);
		verticalpage.dropdowntxtpredictionRange();
		log.info("selected prediction range");
	}
	@Then("click on save button")
	public void click_on_save_button() {
	    verticalpage.SaveButton();
	    log.info("clicked on save button");
	}
	
	@After
	public void teardown()
	{
		driver.quit();
		log.info("driver closed");
	}
}
