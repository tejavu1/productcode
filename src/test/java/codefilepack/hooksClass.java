package codefilepack;

import io.cucumber.java.*;
import zbaseclass.baseclass;

public class hooksClass extends baseclass {
	
	@Before(order=1)
	public void beforescenario1() {
		System.out.println("before1");

	}
	
	@Before("@adhoc")
	public void beforescenario2() {
		System.out.println("before2");

	}
	
	@After(value="@smoke or @regression",order=1)
	public void afterScenario1() {
		System.out.println("after1");

	}
	
	@After(value="@smoke",order=2)
	public void afterScenario2() {
		System.out.println("after2");

	}

}
