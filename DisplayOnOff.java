package hellowwrold;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisplayOnOff {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DR\\Desktop\\seli\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.findElement(By.xpath(".//*[@id='js-switch__option']/div[3]/label")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed());
		
		
		
		
		
		
	}

}
