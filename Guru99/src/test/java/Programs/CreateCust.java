package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCust 
{
	@FindBy(xpath="//a[.='New Customer']")
	private WebElement newUser;
	
	@FindBy(name="name")
	private WebElement userName;
	
	@FindBy(xpath="//input[@value='m']")
	private WebElement male;
	
	@FindBy(xpath="//input[@value='f']")
	private WebElement female;
	
	@FindBy(id="dob")
	private WebElement dob;
	
	@FindBy(name="addr")
	private WebElement address;
	
	@FindBy(name="city")
	private WebElement city;
	
	@FindBy(name="state")
	private WebElement state;
	
	@FindBy(name="pinno")
	private WebElement pin;
	
	@FindBy(name="telephoneno")
	private WebElement mobno;
	
	@FindBy(name="emailid")
	private WebElement emailId;
	
	@FindBy(name="password")
	private WebElement custpass;
	
	@FindBy(name="sub")
	private WebElement submit;
	
	@FindBy(xpath="//td[.='Customer ID']/..//td[2]")
	private WebElement custID;
	
	public CreateCust(WebDriver d) 
	{
		PageFactory.initElements(d, this);
	}
	
	public WebElement newuser()
	{
		return newUser;
	}
	
	public WebElement usename()
	{
		return userName;
	}
	
	public WebElement male()
	{
		return male;
	}
	
	public WebElement female()
	{
		return female	;
	}
	
	public WebElement dob()
	{
		return dob;
	}
	
	public WebElement address()
	{
		return address;
	}
	
	public WebElement city()
	{
		return city;
	}
	
	public WebElement state()
	{
		return state;
	}
	
	public WebElement pin()
	{
		return pin;
	}
	
	public WebElement mob()
	{
		return mobno;
	}
	
	public WebElement emailid()
	{
		return emailId;
	}
	
	public WebElement custpass()
	{
		return custpass;
	}
	
	public WebElement submit()
	{
		return submit;
	}
	
	public WebElement custID()
	{
		return custID;
	}
}
