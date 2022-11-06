package AutomationPractice.JavaSelenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArrayList {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C://Users//pramo//eclipse-workspace//SeleniumJava//Driver//chromedriver.exe/");
	WebDriver driver = new ChromeDriver();
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	
	
	//declare the items to be added here to iterate and add only those
	String[] addProduct = {"Brocolli", "Cucumber", "Mushroom"};
	//Adding Veggies to the cart
	//Store the product name in list variable as it is difficult to get unique code for all the veggies and when list is long:
	addItems(driver, addProduct);
	
	driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	//Enter Promo Code
	Thread.sleep(3000);
	driver.findElement(By.xpath("//Input[@class='promoCode']")).sendKeys("rahulshettyacademy");
	//Hit Apply button:
	driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
	
	//Explicit wait implementation
	WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(30));
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='promoBtn']")));
	//information message
	System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}
	public static void addItems(WebDriver driver, String[] addProduct)
	{
		int j=0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++)
		{
			//to store the products after iteration in the string called name
			String[] name=products.get(i).getText().split("-"); //Splitting the name
			String Veggies=name[0].trim(); //Trimming the white space
			//Converting array to arraylist
			
			List addProductList =Arrays.asList(addProduct);
			
			if(addProductList.contains(Veggies))
			{
				j++;
				//Add the products to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			if(j==addProduct.length)
			{
				break;
			}
			}
		}
	}
}
