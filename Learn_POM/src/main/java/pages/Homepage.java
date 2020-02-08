package pages;

import base.ProjectSpecificMethod;

public class Homepage extends ProjectSpecificMethod {
	
	public Myhomepage clickButton() {
	
	driver.findElementByLinkText("CRM/SFA").click();
	return new Myhomepage();
	}

	}

	


