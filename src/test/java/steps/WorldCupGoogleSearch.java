package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.WorldCupGoogleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.WorlCupGoogleHome;
public class WorldCupGoogleSearch extends WorldCupGoogleBase {
	
	//WebDriver driver;
	
	WorlCupGoogleHome wcgh;
	
	@Given("I am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
		launchBrowser();
		
	    
	}

	@When("I enter Search {string}")
	public void i_enter_search(String string) {
		
		
		wcgh = new WorlCupGoogleHome(driver);
		wcgh.enterSearch(string);
		
	    
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		
		wcgh.clickSearch();
	    
	}

	@Then("I receive related search result")
	public void i_receive_related_search_result() {
		
		WebElement resultStats;
		resultStats = driver.findElement(By.id("result-stats"));
		
		String result = resultStats.getText();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		System.out.println(result);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		closeBrowser() ;
	    
	}


}
