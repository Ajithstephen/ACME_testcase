package acme_pages;

import base.ProjectSpecificMethod;

public class Homepage extends ProjectSpecificMethod {
	
	public Homepage enterUserName() {
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		return this;
	}
		
		public Homepage enterPassword() {
			driver.findElementById("password").sendKeys("leaf@12");
			return this;
			}
		public Homepage clickLogin() {
			driver.findElementById("buttonLogin").click();
			return this;
	
	}

}
