package pages;

import base.ProjectSpecificMethod;

public class Myhomepage extends ProjectSpecificMethod{
	
	public Leadpage clickLead() {
		driver.findElementByLinkText("Leads").click();
		return new Leadpage();
	}

}
