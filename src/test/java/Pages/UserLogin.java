package Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UserLogin
{
 Properties pro=new Properties();

	
	@FindBy(how=How.CSS , using = "input#userid") private WebElement user;
	@FindBy(how=How.CSS , using = "input#password") private WebElement pass;
	@FindBy(how=How.CSS , using = "button[type='submit']") private WebElement logButton;
	@FindBy(how=How.CSS , using = "input#pin") private WebElement pin;
	@FindBy(how=How.CSS , using = "button[type='submit']") private WebElement countinueButton;
	
	
	public UserLogin(WebDriver drive) 
	{
		PageFactory.initElements(drive, this);
	}
	
	
	public void info_UserLogin() throws IOException
	{
		 FileInputStream fis=new FileInputStream("src//test//resources//info.properties");
		
		pro.load(fis);
		
		String u1=pro.getProperty("username") ;
		Assert.assertEquals("VH2547", u1);
		user.sendKeys(u1);
		
		String p1=pro.getProperty("Password") ;
		Assert.assertEquals(p1, "Hrutu@23");
		pass.sendKeys(p1);
		
		
		logButton.click();
		
	}
	
	public void enterPin()
	{
	String c1=	pro.getProperty("pincode") ;
		Assert.assertEquals(c1, "232143");
		pin.sendKeys("232143");
		countinueButton.click();
	}
	
	
	
	
	
}
