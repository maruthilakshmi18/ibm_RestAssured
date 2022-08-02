package steps;

import org.junit.Before;

import cucumber.api.java.After;

public class HooksExample {

	@Before
	public void setup() {
	System.out.println("************Execution starts**********");	
	}
	
	@After
	public void testdown() {
		System.out.println("*************end of the execution**********");
	}
	
}
