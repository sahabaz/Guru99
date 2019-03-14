package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCusto 
{
	@FindBy(xpath="//a[.='Delete Customer']")
	private WebElement delCusto;
	
	@FindBy(name="cusid")
	private WebElement custoID;
	
	@FindBy(name="AccSubmit")
	private WebElement submit;
	
	public DeleteCusto(WebDriver d) 
	{
		PageFactory.initElements(d, this);
	}
	
	public WebElement delCusto()
	{
		return delCusto;
	}
	
	public WebElement custoID()
	{
		return custoID;
	}
	
	public WebElement submit()
	{
		return submit;
	}
}
