package hellowwrold;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] arg) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DR\\Desktop\\seli\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		Actions a = new Actions(driver);
		WebElement move=driver.findElement(By.cssSelector("span[class='nav-line-2']"));
		WebElement m2=driver.findElement(By.className("nav-line-2"));
		a.moveToElement(move).build().perform();
		
		//a.moveToElement(move).keyDown(Keys.SHIFT).sendKeys("xbox").build().perform();
		
		
		
	}
       
	

}
