package testcases;

import org.testng.annotations.Test;

import acme_pages.Homepage;
import base.ProjectSpecificMethod;


public class TC0001_Login extends ProjectSpecificMethod{
	@Test
	public void runLogin() {
		new Homepage().enterUserName().enterPassword().clickLogin();
		
			}

}
