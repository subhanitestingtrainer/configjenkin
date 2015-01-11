

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@Cucumber.Options(format={"pretty", "html:target/cucumber"}, features="src/test/resources")
//@Cucumber.Options(tags={"@dandd"}, format = {"pretty", "html:target/cucumber-html-report", "json-pretty:target/cucumber-report.json"})
@Cucumber.Options(format = {"pretty", "html:build/cucumber-html-report"}, tags = {"@dandd"})
public class TestJenkin {
}
