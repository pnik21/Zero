package Test_Execution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.sikuli.script.FindFailed;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.TestCase3;
import Pages.UserLogin;
import Pages.WishList;

public class Execution 
{
    WebDriver drive ;
    Properties pro=new Properties();
    
    static Logger log=Logger.getLogger(Execution.class.getName()) ;
	
	@BeforeSuite
	public void ForOpenBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sir\\Desktop\\Automation\\Jar\\100\\103\\chromedriver.exe");
		
		drive=new ChromeDriver();
		
		
		
		drive.get("https://kite.zerodha.com/");
		drive.manage().window().maximize();
		
		log.info("BROWSER OPEN AND URL ENTERED");	
	}
	
		
	@Test(priority = 1)
	public void ForLogin() throws IOException
	{
		
		UserLogin p1=new UserLogin(drive);
		p1.info_UserLogin();
		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		p1.enterPin();
		
	log.info("USER LOGGED IN SUCCESFULLY");
		
	}
	
	@Test(priority = 2)
	public void ForWishList()
	{
		
		WishList w=new WishList(drive) ;
		w.WishlistPage();
		log.info("STOCK ADDED TO WISHLIST SUCCESSFULLY");
	}
	
	@Test(priority = 3)
	public void stock() throws FindFailed
	{
		
		Actions act=new Actions(drive);
        WebElement buy=drive.findElement(By.xpath("//span[text()='TCS']"));
		act.moveToElement(buy).perform();
		
		drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		TestCase3 t=new TestCase3(drive);
		t.validateStock();
		
	}
	
}
