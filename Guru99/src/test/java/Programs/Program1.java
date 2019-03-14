package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Program1 
{
	@FindBy(name="uid")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="btnLogin")
	private WebElement login;
	
	@FindBy(xpath="//td[.='Manger Id : mngr184350']")
	private WebElement mgrId;
	
	public Program1(WebDriver d) 
	{
		PageFactory.initElements(d, this);
	}
	
	public WebElement username()
	{
		return username;
	}
	
	public WebElement password()
	{
		return password;
	}
	
	public WebElement login()
	{
		return login;
	}
	
	public WebElement mgrId()
	{
		return mgrId;
	}
	
	

}
