package Casestudy1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@CucumberOptions(plugin={"pretty","json:test/java/Casestudy1/target/cucumber.json"})
@RunWith(Cucumber.class)
public class Runner {

}
