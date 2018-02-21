package hellowwrold;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Fasal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","C:\\Users\\DR\\Desktop\\seli\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://book2.spicejet.com/");
		//driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center]")).sendKeys("asalsaleem")
		//driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("ggg");
		Select s= new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
		s.selectByValue("2");
		s.selectByIndex(7);
		s.selectByVisibleText("5" );
		
	
		driver.findElement(By.xpath(".//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
		driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[2]/li[4]/a")).click();
	driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[1]/li[1]/a")).click();
	driver.findElement(By.xpath(".//*[@id='defense']")).isSelected();
	driver.findElement(By.xpath(".//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense']")).click();
	System.out.println(driver.findElement(By.xpath(".//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense']")).isSelected());
	
	
	
	
	}

}
