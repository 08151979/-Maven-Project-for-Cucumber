package pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;

public class BasePage {
	WebDriver driver;
	
	public int generateRandomNo(int boundaryNo) {

		Random rnd = new Random();
		int generatedNo = rnd.nextInt(boundaryNo);
		return generatedNo;

	}

}
