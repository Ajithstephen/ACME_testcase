package pages;

import base.ProjectSpecificMethod;

public class Leadpage extends ProjectSpecificMethod {
	
	public Createleadpage Createlead() {
		driver.findElementByLinkText("Create Lead").click();
		return new Createleadpage();
		
		
	}

}
   