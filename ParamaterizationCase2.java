package Case1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParamaterizationCase2 {
	WebDriver driver;
	//@Given("DemoWebShop website is launched")
	//public void demowebshop_website_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		//System.setProperty("webDriver.chrome.driver","Resources\\chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://demowebshop.tricentis.com/");
		
	//}
	@Given("Application is launched by user XY")
	public void application_is_launched_by_user_XY() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webDriver.chrome.driver","Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
	}
	//@Then("User click on register")
	//public void user_click_on_register() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	//}
	@Then("user click on register")
	public void user_click_on_register() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	}

	@Then("provides the valid data")
	public void provides_the_valid_data() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("say");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Dandare");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("hfbskh67596@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("sayali");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("sayali");
		
	}

	@Then("clicks on the register button")
	public void clicks_on_the_register_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
		driver.close();
	}

	

	@When("user enters valid username {string}")
	public void user_enters_valid_username(String username) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
//		System.setProperty("webDriver.chrome.driver","Resources\\chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(username);
		
		
	}
	@When("user enters valid password {string}")
	public void user_enters_valid_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.close();
		
	}
	//@Then("verify the login status")
	public void verify_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		//driver.close();
	}


}
