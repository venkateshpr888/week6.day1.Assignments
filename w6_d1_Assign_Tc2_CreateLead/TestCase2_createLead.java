package w6_d1_Assign_Tc2_CreateLead;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2_createLead {
	public  ChromeDriver driver;
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
		@Given("Enter Company Name as {string}")
		public void enter_company_name_as(String company) {
			driver.findElement(By.xpath("//a[text()='Leads']")).click();
			driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
			driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys(company);
		}
		@Given("Enter First Name as {string}")
		public void enter_first_name_as(String firstname) {
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
	       
		}
		@Given("Enter Last Name as {string}")
		public void enter_last_name_as(String lastname) {
			 driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		}
	@When("Enter following functions")
	public void enter_following_functions() {
		driver.findElement(By.xpath("//input[@id='createLeadForm_birthDate']")).sendKeys("9/9/93");
		
				driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("venkatesh@gmail.com");
				driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9650392127");
				driver.findElement(By.xpath("//input[@id='createLeadForm_generalToName']")).sendKeys("Venkatesh R");
				driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress1']")).sendKeys("Mattuthavani");	
				driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress2']")).sendKeys("Avaniyapuram");
				driver.findElement(By.xpath("//input[@id='createLeadForm_generalCity']")).sendKeys("Madurai");
				WebElement state1 = driver.findElement(By.xpath("//select[@id='createLeadForm_generalCountryGeoId']"));
				Select select1 = new Select(state1);
				select1.selectByVisibleText("India");
			
				WebElement state = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
				Select select = new Select(state);
				select.selectByVisibleText("TAMILNADU");
				driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCode']")).sendKeys("625009");
				driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
			}

	@Then("print following")
	public void print_following() {
	System.out.println("End of Testcase 2");
		driver.close();
	}
	
		
}
