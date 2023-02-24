package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TermInsurancePage {
	
	

	// Variable : WebElement :Login Or Sign Up Page
	
	@FindBy (xpath = "//input[@id='nameAdd']")
	private WebElement fullname ; 
	
	
	@FindBy (xpath = "//input[@id='dob']")
	private WebElement dob ;
	
	@FindBy (xpath = "//input[@id='mobileNo']")
	private WebElement mobile ;
	
	

	@FindBy (xpath = "//span[text()='View Free Quotes ']")
	private WebElement submit ; 

	
	
	// Constructor : Initialization of WebElement : Login Or Sign Up Page
	
	 public TermInsurancePage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 
	 //Methods : Action on WebElement : Login Or Sign Up Page
	 
	  public void sendfullname(String fullNa) {
		
		  fullname.sendKeys(fullNa);
	 }
	  
	  public void senddob() {
		  dob.click();
		  dob.sendKeys("01/07/1990");
		 }
	  
	  public void sendMobile(String mobileN) {
		 
		  mobile.sendKeys(mobileN);
		 }
	  
	  public void clickonSubmit() {
		  submit.click();
		 }
	  
	  
	  
	 

}
