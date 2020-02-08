package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.Createleadpage;
import pages.Homepage;
import pages.Leadpage;
import pages.Loginpage;
import pages.Myhomepage;

public class TC001_Loginlogout extends ProjectSpecificMethod {
	@Test
	public void runLoginLogout() {
		
		new Loginpage().enterUserName().enterPassword().clickLogin();
		
		
	}
		
}