package runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/failedscenario.txt", glue= "codefilepack", dryRun=false, monochrome=true,tags= "@smoke or @sanity",

		plugin= {"html:src\\test\\resources\\reports\\htmlReportrerun.html",
				"json:src\\test\\resources\\reports\\JosnReport\\jsonReportssrerun.json",
				"junit:src\\test\\resources\\reports\\JunitReport\\junitReportrerun.xml"}
		
		)
public class re_runnerfile {

}
