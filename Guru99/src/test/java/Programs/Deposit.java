package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deposit 
{
	@FindBy(xpath="//a[.='Deposit']")
	private WebElement deposit;
	
	@FindBy(name="accountno")
	private WebElement accountno;
	
	@FindBy(name="ammount")
	private WebElement ammount;
	
	@FindBy(name="desc")
	private WebElement desc;
	
	@FindBy(name="AccSubmit")
	private WebElement submit;
	
	@FindBy(xpath="//td[.='Current Balance']/..//td[2]")
	private WebElement currBal;
	
	public Deposit(WebDriver d) 
	{
		PageFactory.initElements(d, this);
	}
	
	public WebElement deposit()
	{
		return deposit;
	}
	
	public WebElement accountno()
	{
		return accountno;
	}
	
	public WebElement ammount()
	{
		return ammount;
	}
	
	public WebElement desc()
	{
		return desc;
	}
	
	public WebElement submit()
	{
		return submit;
	}
	
	public WebElement currBal()
	{
		return currBal;
	}
}
