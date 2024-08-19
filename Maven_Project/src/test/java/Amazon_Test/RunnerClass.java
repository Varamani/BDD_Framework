package Amazon_Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features="C:\\Users\\Admin\\eclipse-workspace\\Maven_Project\\src\\test\\resources\\Amazon.feature",
	glue="Amazon_Step_defination",
	tags="@Add_Address"
)	
public class RunnerClass extends AbstractTestNGCucumberTests{

}
