package W6_D1_Assign_tc5_DeleteLead_Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadSteps {
	public String captured;
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
	
	
	@When("Click phonenumber")
	public void click_phonenumber() {
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
	    
	}
	@Given("Enter PhoneNumber as {string}")
	public void enter_phone_number_as(String mobnum) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(mobnum);
		
	    
	}
	@When("Click Find")
	public void click_find() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(3000);
	    
	    
	}
	@When("Capture the lead")
	public void capture_the_lead() {
		WebElement get = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		 captured = get.getText();
		System.out.println(captured);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
	    
	}
	@When("Click DeleteLead")
	public void click_delete_lead() {
		driver.findElement(By.xpath("(//a[@href='javascript:document.deleteLeadForm.submit()'])")).click();
	    
	}
	@Then("confirm Record Deleted")
	public void confirm_record_deleted() {
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(captured);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
		String noRec = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		String orginal="No records to display";
		System.out.println(noRec);
if (noRec.equals(orginal)) {
	System.out.println("Confirmation - Records Deleted");
} else {
	System.out.println("Confirmation - Records NOT Deleted");
}
	    
System.out.println("End of TestCase 5 Delete Lead");
driver.close();	    
	}

}
