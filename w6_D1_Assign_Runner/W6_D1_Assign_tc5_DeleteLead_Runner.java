package w6_D1_Assign_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features="src/test/java/week6/day1/Assignments/Feature/DeleteLead.feature",
glue="W6_D1_Assign_tc5_DeleteLead_Steps",
monochrome=true,
publish=true
		)
public class W6_D1_Assign_tc5_DeleteLead_Runner extends AbstractTestNGCucumberTests {

}
