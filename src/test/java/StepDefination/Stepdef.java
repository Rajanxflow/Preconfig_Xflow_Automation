package StepDefination;

import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Homepage;
import PageObject.LoginPage;
import PageObject.VerticalPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef extends BaseClass {
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		 WebDriverManager.chromedriver().setup();
		   driver= new ChromeDriver();
		   loginpage= new LoginPage(driver);
		   homepage= new Homepage(driver);
		   verticalpage=new VerticalPage(driver);
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

	@Then("close the browser")
	public void close_the_browser() {
		driver.quit();
	}
	
	///////////////////////////HOME Page Feature Validation//////////////////
	@When("check menu button Then Functions AndNode type And Attributes")
	public void check_menu_button_then_functions_and_node_type_and_attributes() throws InterruptedException {
	    homepage.clickMenubutton();
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
	    String nodetype= homepage.txtNodeType();
	    if(nodetype.equals("Node Type"))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
	    String Attr = homepage.txtAttributes();
	    if(Attr.equals("Attributes"))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
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
		String dic=homepage.txtDictionary();
		if(dic.equals("Dictionary"))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
		String Roles= homepage.txtRoles();
		if(Roles.equals("Roles"))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
		String oog=homepage.txtOOfManagement();
		if(oog.equals("OOG Management"))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
		Assert.assertEquals("", homepage.txtSearchButton());
		String Addvertical= homepage.txtAddvertical();
		if(Addvertical.equals("+ Add Vertical"))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
	}

	@When("sign out button")
	public void sign_out_button() {
		Assert.assertEquals("", homepage.txtsignout());
	}
	
	///////////////////Add Vertical/////////////////////
	
	
	@When("Click on the Add vertical button")
	public void click_on_the_add_vertical_button() throws InterruptedException {
		 homepage.txtAddvertical1();
		 Thread.sleep(30000);
	}

	@Then("write Vertical name")
	public void write_vertical_name() {
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  
		verticalpage.setVerticalname("username"+ randomInt +"@gmail.com"); 
	}

	@Then("short name And description")
	public void short_name_and_description() {
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  
		verticalpage.setVerticalShorttext("username"+ randomInt);
		verticalpage.txtverticaldescription("username"+ randomInt);
	}

	@When("click on time range Then select the time range as per desire from list")
	public void click_on_time_range_then_select_the_time_range_as_per_desire_from_list() throws InterruptedException {
	    verticalpage.txttimerange();
	    Thread.sleep(20000);
		verticalpage.dropdowntimerange();
	}

	@When("click on Data range Then select the desire value from the list")
	public void click_on_data_range_then_select_the_desire_value_from_the_list() throws InterruptedException {
		verticalpage.txtdataRange();
		Thread.sleep(20000);
		verticalpage.dropdowntextdataRange();
	}

	@When("click on Trend Range Then select the desire value from the list")
	public void click_on_trend_range_then_select_the_desire_value_from_the_list() throws InterruptedException {
		verticalpage.txttrendrange();
		Thread.sleep(20000);
		verticalpage.dropdowntimerange();
	}

	@When("click on Context Range Then select the desire value from the list")
	public void click_on_context_range_then_select_the_desire_value_from_the_list() throws InterruptedException {
		verticalpage.txtcontextrange();;
		Thread.sleep(20000);
		verticalpage.dropdowncontextRange1();  
	}

	@When("click on Contributors Range Then select the desire value from the list")
	public void click_on_contributors_range_then_select_the_desire_value_from_the_list() throws InterruptedException {
		verticalpage.txtContributors();
		Thread.sleep(20000);
		verticalpage.dropdowncotributorsRange();
	}

	@When("click on Recommended Action Range Then select the desire value from the list")
	public void click_on_recommended_action_range_then_select_the_desire_value_from_the_list() throws InterruptedException {
		verticalpage.txtRecomendedAction();
		Thread.sleep(20000);
		verticalpage.dropdownRecomendedActionRange();
	}

	@When("click on Prediction Range Then select the desire value from the list")
	public void click_on_prediction_range_then_select_the_desire_value_from_the_list() throws InterruptedException {
		verticalpage.txtprediction();
		Thread.sleep(20000);
		verticalpage.dropdowntxtpredictionRange();
	}

}
