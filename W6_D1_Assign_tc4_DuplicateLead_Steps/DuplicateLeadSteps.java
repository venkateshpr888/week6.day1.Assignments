package W6_D1_Assign_tc4_DuplicateLead_Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadSteps {
	public String text;
	public static ChromeDriver driver;
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
	@When("Click on Lead")
	public void click_on_lead() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	    
	    
	}
	@When("Click on Find Lead")
	public void click_on_find_lead() {
	     
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
	}
	
	
	@When("Click Email")
	public void click_email() {
		driver.findElement(By.xpath("//span[text()='Email']")).click();
	    
	}
	@Given("Enter Email Address as {string}")
	public void enter_email_address_as(String mail) {
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(mail);
	    
	}
	@When("Click DuplicateLead")
	public void click_duplicate_lead() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		text = driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
	    
	}
	@Then("Lead Duplicated")
	public void lead_duplicated() throws InterruptedException {
		String text2 = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText();
		System.out.println(text2);
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains(text2)) 
				{
			System.out.println("verified title name is Duplicate Lead");
			
		} else {
			System.out.println("verified title name is NOT Duplicate Lead");

		}
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
			Thread.sleep(3000);
		String text3 = driver.findElement(By.xpath("//span[@id=\"viewLead_firstName_sp\"]")).getText();
		System.out.println(text3);
		if (text3.equals(text)) {
			System.out.println("the duplicated lead name is same as captured name");
			
		} else {
			System.out.println("the duplicated lead name is NOT same as captured name");
		}
		System.out.println("End of TestCase 4 Duplicate Lead");
		driver.close();
	
	}
	    
	}



