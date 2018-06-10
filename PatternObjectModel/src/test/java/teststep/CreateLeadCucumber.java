package teststep;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class CreateLeadCucumber {
	public static RemoteWebDriver driver;
	@Given("LeafTaps application")
	public void invokeApp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");

}
	
	@And("^Enter UserName$") 
	public void entertheuName(String UserName) {
	driver.findElementById("username").sendKeys(UserName);              //("DemoSalesManager");
	}
	
	@And("Enter Password")
	public void enterthepwd(String Password) {
		driver.findElementById("password").sendKeys(Password);                      //("crmsfa");
	}
	
	@And("Click Login")
	public void clicklogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@Then("verify login")
	public void verifythelogin() {
		System.out.println("Login is successfull");
	}
	
	@And("click CRM/SFA")
	public void clickCRMSFA() {
	driver.findElementByLinkText("CRM/SFA").click();
	}
	
	
	@And("click Create Lead")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And("Enter Company Name")
	public void enterthecName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);                  //("Hurix");
	}
	
	@And("Enter First name")
	public void enterthefName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);                      //("Rajan");
	}
	
	@And("Enter Last name")
	public void enterthelName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);                        //("Palani");
		
	}
	
	
	@And("click CreateLead ")
	public void ClickCL() {
		driver.findElementByClassName("smallSubmit").click();
		
	}
	
	
		
	}
		
