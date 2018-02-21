package hellowwrold;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DR\\Desktop\\seli\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/doodles/");
		
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
