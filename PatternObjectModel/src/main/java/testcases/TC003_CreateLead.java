package testcases;
	

	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import pages.LoginPage;
	import wdMethods.ProjectMethods;
	
	public class TC003_CreateLead extends ProjectMethods{
			
		@BeforeTest
		public void setData() {
			testCaseName="TC003_CreateLead";
			testDescription="login and logout in LeafTaps Application";
			testNodes="Leads";
			category="Smoke";
			authors="Rajan";
			browserName="chrome";
			dataSheetName="TC003";
		}
		@Test(dataProvider="fetchData")
		public void creatLeadTest(String uName,String pwd,String Cname,String fName,String lName) {
			
			new LoginPage()
			.enterUserName(uName)
			.enterPassword(pwd)
			.clickLogIn()
			.clickCRMSFA()
			.clickLeads()
			.clickCreateLead()
			.enterCname(Cname)
			.enterfname(fName)
			.enterlName(lName)
			.clickCreateLeadSubmit();
			
			
					
		}

	}



