package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

public class TestCase3
{
	

	
@FindBy(how=How.CSS , using = "span[data-balloon='Buy (B)']") private WebElement buybutton ;
@FindBy(how=How.CSS , using = "input#radio-117") private WebElement intraday ;
@FindBy(how=How.CSS , using = "label[for='radio-214']") private WebElement longterm ;
//@FindBy(how=How.CSS , using = "label[for='radio-213']") private WebElement intraday ;
//@FindBy(how=How.CSS , using = "label[for='radio-213']") private WebElement intraday ;


public TestCase3(WebDriver drive)
{
	PageFactory.initElements(drive, this);
	
}

public void validateStock() throws FindFailed
{
	
	
	
	buybutton.click();
  //  intraday.click();
//Boolean b=	longterm.isEnabled();
//Assert.assertFalse(b);

Screen sc=new Screen();

Pattern name=new Pattern("src//test//resources//intraday.PNG") ;

sc.click(name);





	
}

	
	
	
}
