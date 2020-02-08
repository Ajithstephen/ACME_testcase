package pages;

import base.ProjectSpecificMethod;

public class Loginpage extends ProjectSpecificMethod {
	
	public Loginpage enterUserName() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
		return this;
		
	}
	public Loginpage enterPassword() {
		driver.findElementById("password").sendKeys("crmsfa");
		return this;
	}
	public Homepage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new Homepage();
		
	}
	
		
	}




