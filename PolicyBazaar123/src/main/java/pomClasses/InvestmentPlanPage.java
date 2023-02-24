package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvestmentPlanPage {
	
	

	// Variable : WebElement :Login Or Sign Up Page
	
	@FindBy (xpath = "//input[@id='txtCustomerName']")
	private WebElement yourName ; 
	
	@FindBy (xpath = "//input[@id='txtMobileNo']")
	private WebElement mobileNo ;
	
	@FindBy (xpath = "//input[@id='txtEmail']")
	private WebElement emailId ;
	
	@FindBy (xpath = "//button[text()='View Plans']")
	private WebElement viewPlansButton ; 

	
	
	// Constructor : Initialization of WebElement : Login Or Sign Up Page
	
	 public InvestmentPlanPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 
	 //Methods : Action on WebElement : Login Or Sign Up Page
	 
	  public void sendYourName() {
		  yourName.click();
		  yourName.sendKeys("chandrakant Patil");
	 }
	  
	   public void sendMobileNo(String mobileN) {
		  mobileNo.click();
		  mobileNo.sendKeys(mobileN);
		 }
	  
	  public void sendemailId(String emailI) {
		  emailId.click();
		  emailId.sendKeys(emailI);
		 }
	  
	  public void clickViewPlansButton() {
		  viewPlansButton.click();
	  
	  }
}
