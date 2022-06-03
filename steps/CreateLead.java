package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends Baseclass {
	@When("Click on CRMSFA link")
	public void clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@Then("Myhomepage should be displayed")
	public void verifyMyhomepage() {
		boolean displayed=driver.findElement(By.xpath("//div[text()='My Home']")).isDisplayed();
		Assert.assertTrue(displayed);
	}

}
