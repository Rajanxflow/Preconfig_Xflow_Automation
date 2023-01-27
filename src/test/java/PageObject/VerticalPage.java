package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class VerticalPage {
	
	WebDriver ldriver;
	
	public VerticalPage(WebDriver rdriver)
	{
		ldriver= rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id="vertical__name")
	WebElement txtverticalname;
	
	@FindBy(id="vertical__shortText")
	WebElement txtvertical__shortText;
	
	@FindBy(id="vertical__description")
	WebElement txtverticaldescription;
	
	@FindBy(xpath="//*[@id=\"vertical__range\"]/div/div[1]/div[2]")
	WebElement txttimerange;
	
	@FindBy(xpath="//*[@id=\"vertical__range\"]/div/div[1]/div[2]")
	WebElement dropdownTimeRange;
	
	
	@FindBy(xpath="//*[@id=\"feature__value\"]")
	WebElement txtValueRange;
	
	@FindBy(xpath="//*[@id=\"feature__value\"]")
	WebElement dropdownValueRange;
	
	@FindBy(xpath="//*[@id=\"feature__dataRange\"]")
	WebElement txtdataRange;
	
	@FindBy(xpath="//*[@id=\"feature__dataRange\"]")
	WebElement dropdowntxtdataRange;
	
	@FindBy(xpath="//*[@id=\"feature__trend\"]")
	WebElement txttrendrange;
	
	@FindBy(xpath="//*[@id=\"feature__context\"]")
	WebElement txtcontextrange;
	
	@FindBy(xpath="//*[@id=\"feature__contributors\"]")
	WebElement txtContributors;
	
	@FindBy(xpath="//*[@id=\"feature__recommended_actions\"]")
	WebElement txtRecomendedAction;
	
	@FindBy(xpath="//*[@id=\"feature__prediction\"]")
	WebElement txtprediction;
	
	@FindBy(xpath="//*[@id=\"chakra-modal-:rl:\"]/footer/div/button[1]")
	WebElement Save;
	
	public void setVerticalname(String uname)
	{
		txtverticalname.sendKeys(uname);
	}
	public void setVerticalShorttext(String uname1)
	{
		txtvertical__shortText.sendKeys(uname1);
	}
	public void txtverticaldescription(String uname2)
	{
		txtverticaldescription.sendKeys(uname2);
	}
	public void txttimerange()
	{
		txttimerange.click();
	}
	public void txtValueRange()
	{
		txtValueRange.click();
	}
	public void txtdataRange()
	{
		txtdataRange.click();
	}
	public void txttrendrange()
	{
		txttrendrange.click();
	}
	public void txtcontextrange()
	{
		txtcontextrange.click();
	}
	public void txtContributors()
	{
		txtContributors.click();
	}
	public void txtRecomendedAction()
	{
		txtRecomendedAction.click();
	}
	public void txtprediction()
	{
		txtprediction.click();
	}
	public void dropdowntimerange()
	{
		txttimerange.click();
		
	}
	
	public void dropdownValuerange()
	{
		txttimerange.click();
		Select se= new Select(dropdownValueRange);
		List<WebElement> sel= se.getOptions();
		System.out.println(sel.size());
		for(int i=0;i<sel.size();i++)
		{
			String txt=sel.get(i).getText();
			System.out.println(txt);
			sel.get(i).click();
		}
	}
	public void dropdowntextdataRange()
	{
		Select se= new Select(dropdowntxtdataRange);
		List<WebElement> sel= se.getOptions();
		System.out.println(sel.size());
		for(int i=0;i<sel.size();i++)
		{
			String txt=sel.get(i).getText();
			System.out.println(txt);
			sel.get(i).click();
		}
	}
	public void dropdowntexttrendRange()
	{
		Select se= new Select(txttrendrange);
		List<WebElement> sel= se.getOptions();
		System.out.println(sel.size());
		for(int i=0;i<sel.size();i++)
		{
			String txt=sel.get(i).getText();
			System.out.println(txt);
			sel.get(i).click();
		}
	}
	public void dropdowncontextRange1()
	{
		Select se= new Select(txtcontextrange);
		List<WebElement> sel= se.getOptions();
		System.out.println(sel.size());
		for(int i=0;i<sel.size();i++)
		{
			String txt=sel.get(i).getText();
			System.out.println(txt);
			sel.get(i).click();
		}
	}
	public void dropdowncotributorsRange()
	{
		Select se= new Select(txtContributors);
		List<WebElement> sel= se.getOptions();
		System.out.println(sel.size());
		for(int i=0;i<sel.size();i++)
		{
			String txt=sel.get(i).getText();
			System.out.println(txt);
			sel.get(i).click();
		}
	}
	public void dropdownRecomendedActionRange()
	{
		Select se= new Select(txtRecomendedAction);
		List<WebElement> sel= se.getOptions();
		System.out.println(sel.size());
		for(int i=0;i<sel.size();i++)
		{
			String txt=sel.get(i).getText();
			System.out.println(txt);
			sel.get(i).click();
		}
	}
	public void dropdowntxtpredictionRange()
	{
		Select se= new Select(txtprediction);
		List<WebElement> sel= se.getOptions();
		System.out.println(sel.size());
		for(int i=0;i<sel.size();i++)
		{
			String txt=sel.get(i).getText();
			System.out.println(txt);
			sel.get(i).click();
		}
	}
	public void SaveButton()
	{
		Save.click();
	}
}
