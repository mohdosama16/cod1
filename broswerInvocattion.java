package hellowwrold;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class broswerInvocattion {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DR\\Desktop\\seli\\geckodriver.exe");
WebDriver driver= new FirefoxDriver();
driver.get("https://www.google.com/");
System.out.println(driver.getTitle());

System.out.println(driver.getCurrentUrl());
driver.close();


	}

}
