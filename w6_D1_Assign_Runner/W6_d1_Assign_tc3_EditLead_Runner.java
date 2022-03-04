package w6_D1_Assign_Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
features="src/test/java/week6/day1/Assignments/Feature/EditLead.feature",
glue="w6_d1_Assign_tc3_EditLead_Steps",
monochrome=true,
publish=true

)
public class W6_d1_Assign_tc3_EditLead_Runner extends AbstractTestNGCucumberTests {

}
