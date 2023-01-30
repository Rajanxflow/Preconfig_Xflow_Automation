package StepDefination;

import io.cucumber.java.en.Then;

public class CloseStep extends BaseClass {
	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
		log.info("close browser");
	}
}
