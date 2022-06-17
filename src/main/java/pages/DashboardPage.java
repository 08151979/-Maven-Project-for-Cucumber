package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[2]/a")WebElement DASHBOARD_WEBELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")WebElement BANK_ELEMENT;
	@FindBy(how = How.XPATH, using= "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")WebElement NEWACCONUT_ELEEMENT;
	
	
	
	public void validationDashboard() {
		Assert.assertEquals(DASHBOARD_WEBELEMENT.getText(), "Dashboard");
		
	}
	
	public void dashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	public void clickBankElement() {
		BANK_ELEMENT.click();
	}
	public void clickNewAccount() {
		NEWACCONUT_ELEEMENT.click();
	}

}
