package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.Bank_And_CashPage;

import pages.DashboardPage;
import pages.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	@Test
	public void validUserShouldBeAbleToLogin() {
		 driver = BrowserFactory.init();
		 
		 
		 
		 LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clicSignIn();
		
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.clickBankElement();
		dashboard.clickNewAccount(); 
		
		Bank_And_CashPage bankcash = PageFactory.initElements(driver, Bank_And_CashPage.class);
		bankcash.insertAccountTitle("Checking Account");
		bankcash.insertDescription("Bank of America");
		bankcash.insertInitialBalance("590005");
		bankcash.insertaccountNumber("11111111");
		bankcash.insertcontactPerson("Sangeeta");
		bankcash.insertphone("214-930");
		bankcash.insertBankingURL("www.google.com");
		bankcash.clickSubmit();
	}

}
