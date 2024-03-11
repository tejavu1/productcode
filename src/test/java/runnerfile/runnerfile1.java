package runnerfile;

import org.junit.runner.*;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue= "codefilepack", dryRun=false, monochrome=true,tags= "@smoke or @sanity",

		plugin= {"pretty",

				"html:src\\test\\resources\\reports\\htmlReport.html",
				"json:src\\test\\resources\\reports\\JosnReport\\jsonReportss.json",
				"junit:src\\test\\resources\\reports\\JunitReport\\junitReport.xml"

}
		)

public class runnerfile1 {

}

