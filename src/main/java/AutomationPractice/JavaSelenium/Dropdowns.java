package AutomationPractice.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://Users//pramo//eclipse-workspace//SeleniumJava//Driver//chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// Dropdown with select tag: this is static dropdown:
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		/*
		 * System.out.println(dropdown.getFirstSelectedOption().getText());	
		 * dropdown.selectByVisibleText("AED");
		 * System.out.println(dropdown.getFirstSelectedOption().getText());
		 * dropdown.selectByValue("INR");
		 * System.out.println(dropdown.getFirstSelectedOption().getText());
		 */
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		// if need to click once 1- single click is fine but to iterate it for i>1, need
		// to wrap in a while loop
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// Selecting Dynamic dropdown for cities
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='KNU']")).click();
		System.out.println(driver.findElement(By.xpath("//a[@value='KNU']")).getText());
		// driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).getText());
		// Parent child traversing of dropdown in case someone says indexes not allowed

		// Checkbox clicking:
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		// to check if checkbox is selected or not:
		// System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		// Using Assert to check if condition is true or false:

		Assert.assertTrue(
				driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		// Checkboxes:
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		System.out.println("Code execution completed Thank you!");
		driver.close();

	}

}
