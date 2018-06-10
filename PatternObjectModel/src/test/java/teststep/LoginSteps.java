package teststep;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginSteps {
	public static RemoteWebDriver driver;
	
	@Given("Invoke LeafTaps")
	public void invokeApp() {
		System.setProperty("webdriver.chrome.driver", "./drivers.chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		
	}
	
	@And("Enter the UserName") 
		public void entertheusername() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
	}
		
		@And("Enter the Password")
		public void enterthepassword() {
			driver.findElementById("password").sendKeys("crmsfa");
			
		
}
		
		@And("Click on login")
		public void clicklogin() {
			driver.findElementByClassName("decorativeSubmit").click();
		}
		
		@Then("verify the login")
		public void  verifythelogin( ) {
			System.out.println("Login is successfull");
		}
	

	}


