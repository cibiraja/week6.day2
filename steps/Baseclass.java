package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass  extends AbstractTestNGCucumberTests{
	public static ChromeDriver driver;//driver=null
	@BeforeMethod
	public void precondi() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
	}
	@AfterMethod
	public void postcondi() {
		driver.close();

	}
	

}
