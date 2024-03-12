package runnerfile;

import org.junit.AfterClass;
import org.junit.runner.*;

import codefilepack.JVMReport;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue= "codefilepack", dryRun=false, monochrome=true,tags= "@smoke or @sanity",

		plugin= {"rerun:target/failedscenario.txt",

				"html:src\\test\\resources\\reports\\htmlReport.html",
				"json:src\\test\\resources\\reports\\JosnReport\\jsonReportss.json",
				"junit:src\\test\\resources\\reports\\JunitReport\\junitReport.xml"

}
		)

public class runnerfile1 {
	
	@AfterClass
	public static void jvmreport() {
		JVMReport.generateJVMReport("src\\test\\resources\\reports\\JVMReports\\jvmreport.json");
		System.out.println("report genearted");

	}

}

