package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import jdk.internal.org.jline.utils.Log;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;


public class TC001_AccountRegistrationTest extends BaseClass {
	
	@Test(groups= {"Regression","Master"})
	public void verify_account_registration()
	{
	
	logger.info("***Starting TC001_AccountRegistrationTest****");
	try 
	{
		
	HomePage hp=new HomePage(driver);
	hp.clickMyAccount();
	logger.info("Clicked on MyAccount link");
	
	hp.clickRegister();
	logger.info("Clicked on register link");
	Thread.sleep(3000);
	
	AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
	logger.info("Providing customer details");
	
	
	regpage.setFirstName(randomeString().toUpperCase());
	Thread.sleep(3000);
	regpage.setLastName(randomeString().toUpperCase());
	Thread.sleep(2000);
	regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
	regpage.setTelephone(randomeNumber());
	String password=randomeAlphaNumeric();
	regpage.setPassword(password);
	regpage.setConfirmPassword(password);
		
	
	
	regpage.clickSubscribe();
	regpage.clickPrivacyPolicy();
	
	//regpage.setPrivacyPolicy();
	regpage.clickContinue();
	
	Thread.sleep(3000);
	
	logger.info("Validating expected message");
	String confmsg = regpage.getConfirmationMsg();
	
	if(confmsg.equals("Your Account Has Been Created!"))
	{
		Assert.assertTrue(true);
	}
	else
	{
	 logger.error("Test failed");
   	 logger.debug("Debug logs");
   	 Assert.assertTrue(false);
	}
	
	//Assert.assertEquals(confmsg, "Your Account Has Been Created!", "Confirmation message mismatch");
	}
	
     catch(Exception e) {
    	 
    	 Assert.fail();
	

	}
	
	logger.info("***Finished TC001_AccountRegistrationTest ***");
}

}	

