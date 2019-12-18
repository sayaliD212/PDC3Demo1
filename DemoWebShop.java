package Case1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DemoWebShop {
	WebDriver driver;
	
	@Given("Demo Web Shop website is launched")
	public void demo_Web_Shop_website_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webDriver.chrome.driver","Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
	}

	@Given("User clicks on register")
	public void user_clicks_on_register() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		
		
		}

	@When("user enters data")
	public void user_enters_data() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Dandare");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Srinigodari434594@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("abc123");
	}

	@Then("clicks on submit button for register")
	public void clicks_on_submit_button_for_register() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
//		Thread.sleep(5000);
		
		WebDriverWait wait1 = new WebDriverWait(driver,120);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Log in']")));
		
	String sname =	driver.findElement(By.xpath("//a[text()='Log in']")).getText();
	System.out.println("the link name is "+sname);
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	}

	@Given("registered user clicks on Login linkzzz")
	public void registered_user_clicks_on_Login_linkzzz() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
	}

	@Given("user enters valid credentials")
	public void user_enters_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rasikadandare@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("sayali123");
		
		
		
	}

	@Then("clicks on Login link")
	public void clicks_on_Login_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}

	@Given("user clicks on search box")
	public void user_clicks_on_search_box() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).click();
	}

	@Given("enters the product to be search")
	public void enters_the_product_to_be_search() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Jewelry");
	}

	@Then("clicks on Search button")
	public void clicks_on_Search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
	}

	@Given("searched products are displayed")
	public void searched_products_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
//		driver.findElement(By.xpath("//div[@class='product-grid']")).ge
		driver.getTitle();
		
		String Expected_url = "http://demowebshop.tricentis.com/jewelry";
		String Act_URL = 	driver.getCurrentUrl();
		Assert.assertEquals(expected, actual);
	}

	
	

	@Then("clicks on add to cart")
	public void clicks_on_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();
	}



}
