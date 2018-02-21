package hellowwrold;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\DR\\Desktop\\seli\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
	driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
	driver.switchTo().alert().accept();
	
	
}

}
