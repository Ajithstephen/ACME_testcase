package pages;

import base.ProjectSpecificMethod;

public class Viewleadpage extends ProjectSpecificMethod {
	
	public void viewLead() {
		
		String title = driver.getTitle();
		System.out.println("verification successfully:"+title);
		
			}
}

