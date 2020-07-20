package stepDefinitions;

import io.cucumber.java.After;
import runner.GerenciadorDeDriver;

public class Hooks {

	@After
	public void afterScenario() {
		GerenciadorDeDriver.endSession();
	}

}
