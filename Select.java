package hellowwrold;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DR\\Desktop\\seli\\chromedriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://book2.spicejet.com/search.aspx");
		
		Select s = new Select(driver.findElement(By.xpath(".//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT']")));
		
		
		
		
		
		

	}

}
