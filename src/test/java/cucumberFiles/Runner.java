package cucumberFiles;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\JetBrains\\AutomationPractice\\src\\test\\resources\\features\\linkedIn",glue={"Steps"})
public class Runner
{

}