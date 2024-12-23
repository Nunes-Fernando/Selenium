package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty","html:target/cucumber-reports" }, 
				features = "src/test/resources/features", 
				glue = { "steps" })
public class RunCucumber {

	public static ChromeDriver browser;

	@BeforeClass
	public static void start() {
		browser = new ChromeDriver();
	}

	@AfterClass
	public static void stop() {
		browser.quit();
	}
}
