package AutomationPractice.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendars {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//pramo//eclipse-workspace//SeleniumJava//Driver//chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Selecting Dynamic dropdown for cities
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='KNU']")).click();
		System.out.println(driver.findElement(By.xpath("//a[@value='KNU']")).getText());
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();	
		System.out.println(driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).getText());
		//Thread.sleep(3000);
		
		//To open the calendar pop directly, else after selecting Source and Destination, calendar automatically pops up:
		//driver.findElement(By.xpath("//span[@id='view_fulldate_id_1']")).click();
		
		//To Select current date:
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		//String sDate= driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).getText();
		
		Thread.sleep(2000);
		
		//checking if an element is enabled or not:
		System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).isEnabled());
		driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).isEnabled());
		//System.out.println("Selected date is: "+sDate);

	}

}
