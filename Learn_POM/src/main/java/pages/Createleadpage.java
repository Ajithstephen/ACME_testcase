package pages;

import base.ProjectSpecificMethod;

public class Createleadpage extends ProjectSpecificMethod{
	
	public Createleadpage enterCompanyName() {
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		return new Createleadpage();
		
	}
	public Createleadpage enterFirstName() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
		return new Createleadpage();

	}
	public Createleadpage enterLastName() {
		driver.findElementById("createLeadForm_lastName").sendKeys("J");
		return new Createleadpage();
	}
	public Viewleadpage clickCreateLeadButton() {
		driver.findElementByName("submitButton").click();
		return new Viewleadpage();

	}
	

}
