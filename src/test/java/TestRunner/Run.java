package TestRunner;

import org.testng.annotations.Listeners;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerAdapter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;



//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/",
		glue ="StepDefination",
		dryRun= false,
		monochrome= true
		//tags= "@sanity",
		
		
	//plugin = {"pretty","html:target/cucumber-reports/reports1.html"}
	//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
@Listeners({ExtentITestListenerAdapter.class})
public class Run extends AbstractTestNGCucumberTests {
	/*class will be empty*/
}
