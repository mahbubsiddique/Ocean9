package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
	
	WebDriver driver;
	
	public GoogleHomePage(WebDriver dr){
		driver = dr;
		PageFactory.initElements(driver,this);
	}
	
//	WebElement searchBox = driver.findElement(By.name("q"));
//	searchBox.sendKeys(term);
	
	@FindBy(name="q")
	WebElement searchBox;
	
	public void enterSearchTerm(String term) {
		searchBox.sendKeys(term);
	}
	
//	WebElement searchButton = driver.findElement(By.name("btnK"));
//	searchButton.submit();	
	
	@FindBy(name = "btnK")
	WebElement searchButton;
	
	public void clickSearchButton() {
		searchButton.submit();	
	}
	
	
	
	

}
