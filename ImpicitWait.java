package hellowwrold;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImpicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DR\\Desktop\\seli\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hotels.com/");
		driver.findElement(By.id("qf-0q-destination")).sendKeys("nyc");
		driver.findElement(By.id("qf-0q-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.className("cta cta-geo")).sendKeys(Keys.ENTER);
	

	}

}
