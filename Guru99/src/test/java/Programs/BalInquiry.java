package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BalInquiry 
{
	@FindBy(xpath="//a[.='Balance Enquiry']")
	private WebElement balInq;
	
	@FindBy(name="accountno")
	private WebElement accno;
	
	@FindBy(name="AccSubmit")
	private WebElement submit;
	
	@FindBy(xpath="//td[.='Balance']/..//td[2]")
	private WebElement statusBal;
	
	public BalInquiry(WebDriver d) 
	{
		PageFactory.initElements(d, this);
	}
	
	public WebElement balInq()
	{
		return balInq;
	}
	
	public WebElement accno()
	{
		return accno;
	}
	
	public WebElement submit()
	{
		return submit;
	}
	
	public WebElement statusBal()
	{
		return statusBal;
	}
}
