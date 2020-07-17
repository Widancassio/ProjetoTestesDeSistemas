package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features" },

		glue = { "newsroomStepDefinitions", "buscaStepDefinitions", "suporteStepDefinitions", "lojaStepDefinitions" },

		plugin = { "pretty" },

		monochrome = true,

		strict = true)

public class RunCucumber {

}
