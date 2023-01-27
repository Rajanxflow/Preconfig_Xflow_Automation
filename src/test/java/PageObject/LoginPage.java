package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

WebDriver ldriver;
	
public LoginPage(WebDriver rdriver)
{
	ldriver= rdriver;
	
	PageFactory.initElements(rdriver, this);
}
 @FindBy(xpath ="//*[@id=\"root\"]/section/form/label[1]/input")
    WebElement txtUsername;

    @FindBy(xpath= "//*[@id=\"root\"]/section/form/label[2]/input")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath= "//*[@id=\"root\"]/section/form/button")
    @CacheLookup
    WebElement login;


    public void setUsername(String uname)
    {
        txtUsername.sendKeys(uname);
    }
    public void setPassword(String pwd)
    {
        txtPassword.sendKeys(pwd);
    }
    public void clickSubmit()
    {

        login.click();
    }
}
