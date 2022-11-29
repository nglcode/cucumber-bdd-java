package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@MobileTest")
	public void beforeMobile() {
		System.out.println("Mobile before hook");
	}
	
	@After("@MobileTest")
	public void afterMobile() {
		System.out.println("Mobile after hook");
	}
	
	@Before("@WebTest")
	public void beforeWeb() {
		System.out.println("Web before hook");
	}
	
	@After("@WebTest")
	public void afterWeb() {
		System.out.println("Web after hook");
	}

}
