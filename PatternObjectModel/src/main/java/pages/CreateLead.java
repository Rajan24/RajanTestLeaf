package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}
	
     @FindBy(how=How.ID,using="createLeadForm_companyName")
     private WebElement eleCname;
     
     public CreateLead enterCname(String data) {
    	 type(eleCname,data);
    	 return this;
     }
    	 
    	 @FindBy(how=How.ID,using="createLeadForm_firstName")
    	 private WebElement elefName;
    	 
    	 public CreateLead enterfname(String data) {
    		 type(elefName,data);
    		 return this;
    	 }
    	 
    	 @FindBy(how=How.ID,using="createLeadForm_lastName")
    	 private WebElement elellName;
    	 
    	 public CreateLead enterlName(String data) {
    		 type(elellName,data);
    		 return this;
    	 }  
    		 
    		 @FindBy(how=How.CLASS_NAME,using="smallSubmit")
    		 private WebElement eleSub;
    		 
    		 public ViewLead clickCreateLeadSubmit() {
    			 click(eleSub);
    			 return new ViewLead();
    		 }
    	 
    
     
		
	}
		
	
	
	
	
	
	
	
	
	
	


