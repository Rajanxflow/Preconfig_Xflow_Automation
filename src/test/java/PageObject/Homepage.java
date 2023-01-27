package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver ldriver;
	
	public Homepage(WebDriver rdriver)
	{
		ldriver= rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath ="//*[@id=\"root\"]/div/div[1]/div[1]/button")
    WebElement clickMenubutton;
	
	@FindBy(xpath ="//*[@id=\"root\"]/div/div[1]/div[2]/a[1]/div")
    WebElement txtVertical;
	
	@FindBy(xpath ="//*[@id=\"root\"]/div/div[1]/div[2]/a[2]/div")
    WebElement txtFunctions;
	
	@FindBy(xpath ="//*[@id=\"root\"]/div/div[1]/div[2]/a[3]/div")
    WebElement txtNodetype;
	
	@FindBy(xpath ="//*[@id=\"root\"]/div/div[1]/div[2]/a[4]/div")
    WebElement txtAttributes;
	
	@FindBy(xpath ="//*[@id=\"root\"]/div/div[1]/div[2]/a[5]/div")
    WebElement txtMetrics;
	
	@FindBy(xpath ="//*[@id=\"root\"]/div/div[1]/div[2]/a[6]/div")
    WebElement txtDictionary;
	
	@FindBy(xpath ="//*[@id=\"root\"]/div/div[1]/div[2]/a[7]/div")
    WebElement txtRoles;
	
	@FindBy(xpath ="//*[@id=\"root\"]/div/div[1]/div[2]/a[8]/div")
    WebElement txtOOfManagement;
	
	@FindBy(xpath ="//*[@id=\"root\"]/div/div[2]/div[3]/div/div[1]/div/input")
    WebElement txtSearchButton;
	
	@FindBy(xpath ="//*[@id=\"root\"]/div/div[2]/div[3]/div/div[1]/button")
    WebElement txtAddvertical;
	
	@FindBy(xpath ="//*[@id=\"menu-button-:rh:\"]")
    WebElement txtsignout;
	
	 public void clickMenubutton()
	    {
		 clickMenubutton.getText();
	    }
	
	 public void txtVertical()
	    {
		 txtVertical.getText();
	    }
	 public void txtFunctions()
	    {
		 txtFunctions.getText();
	    }
	 public void txtNodeType()
	    {
		 txtNodetype.getText();
	    }
	 public void txtAttributes()
	    {
		 txtAttributes.getText();
	    }
	 public void txtMetrics()
	    {
		 txtMetrics.getText();
	    }
	 public void txtDictionary()
	    {
		 txtDictionary.getText();
	    }
	 public void txtRoles()
	    {
		 txtRoles.getText();
	    }
	 public void txtOOfManagement()
	    {
		 txtOOfManagement.getText();
	    }
	 public void txtSearchButton()
	    {
		 txtSearchButton.getText();
	    }
	 
	 public void txtAddvertical()
	    {
		 txtAddvertical.getText();
	    }
	 public void txtsignout()
	    {
		 txtsignout.getText();
	    }
	 

	
}
