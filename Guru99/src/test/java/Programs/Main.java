package Programs;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Main 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahabaz\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.guru99.com/v4/");
		
		Program1 p = new Program1(d);
		CreateCust c = new CreateCust(d);
		NewAcc n = new NewAcc(d);
		Deposit de = new Deposit(d);
		Withdraw w = new Withdraw(d);
		BalInquiry b = new BalInquiry(d);
		FundTransfer f = new FundTransfer(d);
		DeleteCusto dl = new DeleteCusto(d);
		
		String s = "mngr184350";
		p.username().sendKeys("mngr184350");
		p.password().sendKeys("edanAnE ");
		p.login().click();
		Thread.sleep(2000);
		if(p.mgrId().getText().contains(s))
		{
			System.out.println("user ID is matching");
		}
		else
		{
			Assert.fail();
		}
		
		HashMap<String , String> h = new HashMap<String, String>();
		for(char a = 'a' ; a<'c' ; a++)
		{
			c.newuser().click();
			c.usename().sendKeys("jdhvfdjvfwdv"+a);
			c.female().click();
			Thread.sleep(1000);
//			c.dob().click();
			Thread.sleep(1000);
			c.dob().sendKeys("03132019");
			c.address().sendKeys("jhdjfhbvdfdf");
			c.city().sendKeys("djvvf");
			c.state().sendKeys("fhvbvf");
			c.pin().sendKeys("123456");
			c.mob().sendKeys("1234567899");
			c.emailid().sendKeys("cjhbsoplkj12988"+a+"@gmail.com");
			c.custpass().sendKeys("hbfsd");
			c.submit().click();
			Thread.sleep(2000);
			
			h.put("CustomerID"+a, c.custID().getText());
		}
		
		n.newAcc().click();
		n.custID().sendKeys(h.get("CustomerIDa"));
		Select acc = new Select(n.accType());
		acc.selectByVisibleText("Current");
		n.iniDeposit().sendKeys("900000");
		n.submit().click();
		h.put("AccountID", n.accID().getText());
		h.put("AvailBal", n.availBal().getText());
		
		for(int i=0 ; i<2 ; i++)
		{
			de.deposit().click();
			de.accountno().sendKeys(h.get("AccountID"));
			de.ammount().sendKeys("5000");
			de.desc().sendKeys("loan");
			de.submit().click();
		}
		
		h.put("BalBeforeWithdrawl", de.currBal().getText());
		
		//57935
		
		for(int i=0 ; i<2 ; i++)
		{
			w.withdraw().click();
			w.accountno().sendKeys(h.get("AccountID"));
			w.ammount().sendKeys("5000");
			w.desc().sendKeys("loan");
			w.submit().click();
		}
		
		h.put("BalAfterDraw", w.drawBal().getText());
		
		b.balInq().click();
		b.accno().sendKeys(h.get("AccountID"));
		b.submit().click();
		h.put("StatusBal", b.statusBal().getText());
		
		if(h.get("AvailBal").equals(h.get("StatusBal")))
		{
			System.out.println("Both balances are same");
		}
		else
		{
			Assert.fail();
		}	
		
		f.fundTrans().click();
		f.payersAcc().sendKeys(h.get("AccountID"));
		f.payeesAcc().sendKeys(h.get("AccountID"));
		f.ammount().sendKeys("5000");
		f.desc().sendKeys("loan");
//		f.submit().click();
		
		dl.delCusto().click();
		dl.custoID().sendKeys(h.get("CustomerIDa"));
		dl.submit().click();
		Thread.sleep(1000);
		d.switchTo().alert().accept();
	}

}
