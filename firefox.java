package hellowwrold;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {
	public static void main(String[] arg){
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DR\\Desktop\\seli\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		/*driver.get("http://www.qaclickacademy.com/index.php");
		driver.findElement(By.xpath(".//*[@id='homepage']/header/div[2]/div/nav/ul/li[3]/a")).click();
		*/
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("mohammed");
		driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.name("pass")).sendKeys("123");
		driver.findElement(By.xpath(".//*[@id='u_0_q']")).click();
		
	}

}
