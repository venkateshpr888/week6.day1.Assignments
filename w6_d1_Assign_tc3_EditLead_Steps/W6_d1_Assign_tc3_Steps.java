package w6_d1_Assign_tc3_EditLead_Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class W6_d1_Assign_tc3_Steps {
	
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
	@Given("Change Company Name as {string}")
	public void change_company_name_as(String compName) {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		String titleName="View Lead | opentaps CRM";
		System.out.println("Title of this page = "+driver.getTitle());
		if(titleName.equals(driver.getTitle()))
		{
			System.out.println(titleName+ " = is correct Title");
		}
		else {System.out.println("not correct title");
			
		}
			
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(compName);
	    
	}
	@When("Click Submit")
	public void click_submit() {
		driver.findElement(By.xpath("//input[@name='submitButton'][1]")).click();
	    
	}
	@Then("Changed Company Name")
	public void changed_company_name() {
		WebElement get = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		String text1 = "LEAF TEST";
		System.out.println("changed company name = "+text1);
		if (get.getText().contains(text1)) {
			System.out.println("changes in company name is confirmed = "+text1);
			
		} else {System.out.println("changes not happened");
	    
	    
	}
		System.out.println("End of TestCase 3 Edit Lead");
		driver.close();
	}
	
}




