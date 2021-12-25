package advanceElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//(//input[@type='checkbox'])[1]
		
		WebElement chk1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		
		WebElement chk2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		
		if(chk1.isSelected())
			System.out.println("The checkbox 1 is already selected");
		else
			chk1.click();
		
		
		if(chk2.isSelected())
			System.out.println("The checkbox 2 is already selected");
		else
			chk2.click();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
