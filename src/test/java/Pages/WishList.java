package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WishList 
{

	
	@FindBy(how=How.CSS , using = "input[icon='search']") private WebElement textbox;
	

	public WishList(WebDriver drive)
	{
		PageFactory.initElements(drive, this);
	}
	
	public void WishlistPage()
	{
		textbox.sendKeys("TCS");
		textbox.sendKeys(Keys.ENTER);
	}
	
	
	
}
