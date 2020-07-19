package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features/Busca.feature" },

		tags = { "@ListaProgramaDeReparo" },

		glue = { "stepDefinitions" },

		plugin = { "pretty" },

		monochrome = true,

		strict = true)

public class RunCucumberSuporte {

}
