package w6_D1_Assign_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/week6/day1/Assignments/Feature/createLead.feature",
		glue="w6_d1_Assign_Tc2_CreateLead",
		monochrome=true,
		publish=true
		)
public class W6_D1_Assign_Tc2_CreateLead_Runner extends AbstractTestNGCucumberTests {

}
