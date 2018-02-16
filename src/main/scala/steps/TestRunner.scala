package steps

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith


/**
  * Created by sgar42 on 06-Jan-18.
  */
@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("classpath:feature"),
  glue = Array("classpath:steps"),
  tags = Array("@wip"),
  monochrome = true,
  plugin = Array("pretty",
    "html:target/cucumber",
    "json:target/cucumber/test-report.json",
    "junit:target/cucumber/test-report.xml")
)
class TestRunner {

}
