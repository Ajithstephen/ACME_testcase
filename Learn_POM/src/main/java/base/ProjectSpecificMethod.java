package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {
	 
		public static ChromeDriver driver;
	//	 @Parameters({"url","uName","password"})
		@BeforeMethod
		 public void beforetext() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.findElementById("username").sendKeys("DemoSalesManager");
//		driver.findElementById("password").sendKeys("crmsfa");
//		driver.findElementByClassName("decorativeSubmit").click();
//		driver.findElementByLinkText("CRM/SFA").click();
		}


	@AfterMethod
	public void aftertext() {
		String title = driver.getTitle();
		System.out.println("verify the title:"+title);
		driver.close();
	}

}

