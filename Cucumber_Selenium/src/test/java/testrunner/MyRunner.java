package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/java/features",
        glue=("stepdefination")
)
public class MyRunner extends AbstractTestNGCucumberTests{


}
