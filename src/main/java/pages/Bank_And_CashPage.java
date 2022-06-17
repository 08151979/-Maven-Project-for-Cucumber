package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Bank_And_CashPage extends BasePage {
	
	WebDriver driver;
	
	@FindBy(how= How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]")WebElement ADD_NEW_ACCOUNT_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")WebElement ACCOUNT_TITLE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")WebElement DESCRIPTION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")WebElement INITIAL_BALANCE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]") WebElement ACCOUNT_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")WebElement CONTACT_PERSON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")WebElement BANKING_URL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")WebElement SUBMIT_ELEMENT;
	
	public void varifyAddnewAccount() {
		Assert.assertEquals(ADD_NEW_ACCOUNT_ELEMENT.getText(), "Accounts","Account does not fount");
		
	}
	
	public void addAccount(WebDriver driver) {
		this.driver = driver;
	}
	public void insertAccountTitle(String title) {
		ACCOUNT_TITLE_ELEMENT.sendKeys(title + generateRandomNo(999));
	}
	public void insertDescription(String description) {
		DESCRIPTION_ELEMENT.sendKeys(description + generateRandomNo(999));
	}
	public void insertInitialBalance(String balance) {
		INITIAL_BALANCE_ELEMENT.sendKeys(balance);
	}
	public void insertaccountNumber(String accountNumber) {
		ACCOUNT_NUMBER_ELEMENT.sendKeys(accountNumber);
	}
	public void insertcontactPerson(String contactPerson) {
	
	CONTACT_PERSON_ELEMENT.sendKeys(contactPerson + generateRandomNo(999) );
	
	}
	public void insertphone(String phone) {
		PHONE_ELEMENT.sendKeys(phone + generateRandomNo(999));
	}
	public void insertBankingURL(String bankingUrl) {
		BANKING_URL_ELEMENT.sendKeys(bankingUrl + generateRandomNo(999));
	}
	public void clickSubmit() {
		SUBMIT_ELEMENT.click();
	}


}
