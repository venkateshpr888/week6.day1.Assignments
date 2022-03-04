package w6_d1_Assgn_Tc1_CreateContact_Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1_CreateContact {
	public ChromeDriver driver;
	public String text;
	@Given("Load the application url as {string}")
	public void load_the_application_url_as(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	}
	@Given("Enter the username as {string}")
	public void enter_the_username_as(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@Given("Enter the password as {string}")
	public void enter_the_password_as(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("Click on Login as {string}")
	public void click_on_login_as(String clickLogin) {
		driver.findElement(By.className(clickLogin)).click();
	    
	}
	@When("Click on Homepage as {string}")
	public void click_on_homepage_as(String clickhome) {
		driver.findElement(By.partialLinkText(clickhome)).click();
	    
	}
	@When("Click Contacts")
	public void click_contacts() {
		driver.findElement(By.linkText("Contacts")).click();
	    
	}
	@When("Click Create Contacts")
	public void click_create_contacts() {
		driver.findElement(By.linkText("Create Contact")).click();
	    
	    
	}
	@Given("First Name as {string}")
	public void first_name_as(String fName) {
		driver.findElement(By.id("firstNameField")).sendKeys(fName);
	    
	    
	}
	@Given("Last name as {string}")
	public void last_name_as(String lName) {
		 driver.findElement(By.id("lastNameField")).sendKeys(lName);
	    
	}
	@When("Click submit")
	public void click_submit() {
		driver.findElement(By.name("submitButton")).click();
	    
	    
	}
	@When("Find Name")
	public void find_name() {
		text = driver.findElement(By.id("viewContact_firstName_sp")).getText();
	    
	    
	}
	@Then("Print Name")
	public void print_name() {
		 System.out.println("First name = "+text+"   "+"Browser Title = "+driver.getTitle());
			System.out.println("End of Testcase 1");
			driver.close();
	    
	    
	}
	//	public  ChromeDriver driver;
//	@Given("Enter URL")
//	public void enter_url() {

//	@Given("Enter User Name as {string}")
//	public void enter_user_name_as(String username) {
//		
//	}
//	@Given("Enter Password as {string}")
//	public void enter_password_as(String password) {
//		
//	}
//	@When("Enter following functions")
//	public void enter_following_functions() {
//		
//		
//		
//		
//		
//       
//	    
//	}
//	@Then("print following")
//	public void print_following() {
//		
//	   
//	}
	}
