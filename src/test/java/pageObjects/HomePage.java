package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//i[@class='fa fa-user']") 
WebElement lnkMyaccount;

@FindBy(xpath="//a[normalize-space()='Register']") 
WebElement lnkRegister;

@FindBy(xpath="//a[normalize-space()='Login']")   // Login link added in step5
WebElement linkLogin;



public void clickMyAccount()
{
	//lnkMyaccount.click();
//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
//mywait.until(ExpectedConditions.elementToBeClickable(lnkMyaccount)).click();

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].click();", lnkMyaccount);

}

public void clickRegister()
{
	//lnkRegister.click();
	//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
//mywait.until(ExpectedConditions.elementToBeClickable(lnkRegister)).click();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", lnkRegister);
}

public void clickLogin()
{
	linkLogin.click();
}

//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
//mywait.until(ExpectedConditions.elementToBeClickable(lnkMyaccount)).click();

//Actions act=new Actions(driver);

}




