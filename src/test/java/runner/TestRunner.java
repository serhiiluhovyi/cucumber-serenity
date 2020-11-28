package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources/features"},
    glue = {"steps", "common", "hooks"},
    plugin = {"pretty", "html:CucumberReport"},
    dryRun = false,
    strict = true,
    monochrome = true
//		tags = {"@P1 and @P2"}
    //name = {"Logo"}
)
public class TestRunner {

}
