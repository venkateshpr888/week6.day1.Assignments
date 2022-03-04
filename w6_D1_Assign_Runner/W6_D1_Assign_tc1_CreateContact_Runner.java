package w6_D1_Assign_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/week6/day1/Assignments/Feature/createContact.feature",
		glue="w6_d1_Assgn_Tc1_CreateContact_Steps",
		monochrome=true,
		publish=true
		)
public class W6_D1_Assign_tc1_CreateContact_Runner extends AbstractTestNGCucumberTests {

}
