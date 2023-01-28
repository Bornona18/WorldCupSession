package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorlCupGoogleHome {
	
	WebDriver driver;
	
	public WorlCupGoogleHome (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
    // WebElement searchBox = driver.findElement(By.name("q"));
	
	@FindBy(name="q")
	WebElement searchBox;
	
    //searchBox.sendKeys(string);
	
	public void enterSearch(String string) {
		searchBox.sendKeys(string);
	}
	
	
	//WebElementsearchBtn = driver.findElement(By.name("btnK"));
	@FindBy(name="q")
	WebElement searchBtn;
	
	public void clickSearch() {
		searchBtn.submit();
	}
	
	
	
	
	
	
	
	
	

}
