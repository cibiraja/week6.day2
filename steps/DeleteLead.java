package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends Baseclass {
	@When("Click on delete button")
	public void clickdelete() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
	}
	@Then("Myhomepage should be displayed")
	public void verifyMyhomepage() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@When("Click on FinfLeads")
	public void clickFindLeads(CharSequence leadId) {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		driver.close();
		
		
		
	}

}
