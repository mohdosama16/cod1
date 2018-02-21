package hellowwrold;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DR\\Desktop\\seli\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
				d.get("https://www.google.com/");
d.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("Sam");
d.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();


	}

}
