package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HealthInsurancePage {
	

	// Variable : WebElement :Login Or Sign Up Page
	
	@FindBy (xpath = "(//span[@class='chkbox'])[1]")
	private WebElement selfButton ; 
	
	
	@FindBy (xpath = "//div[@data-step='1']")
	private WebElement step1Button ; 

	@FindBy (xpath = "(//select[@name='member_age'])[1]")
	private WebElement ageButton ; 

	@FindBy (xpath = "//div[@data-step='2']")
	private WebElement step2Button ; 
	
	@FindBy (xpath = "//span[text()='Pune']")
	private WebElement city ; 

	@FindBy (xpath = "//input[@class='fullWidht txtName']")
	private WebElement fullname ;
	
	@FindBy (xpath = "//input[@class='fullWidht input_box mobNumber']")
	private WebElement mobileNo ;
	
	@FindBy (xpath = "//div[@data-step='4']")
	private WebElement submitButton ;
	
	// Constructor : Initialization of WebElement : Login Or Sign Up Page
	
	 public HealthInsurancePage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 
	 //Methods : Action on WebElement : Login Or Sign Up Page
	 
	  public void clickonSelfButton() {
		  selfButton.click();
	 }
	  
	  public void clickonStep1Button() {
		  step1Button.click();
		 }
	  
	  public void sendageButton() {
		  ageButton.click();
		  //action on Select tagname
		 }
	  
	  public void clickonStep2Button() {
		  step2Button.click();
		 }
	  
	  public void clickonCity() {
		  city.click();
		 }
	  public void sendfullname(String fullN) {
		 
		  fullname.sendKeys(fullN);
		 }
	  
	  public void sendmobileNo(String mobileN) {
		  mobileNo.sendKeys(mobileN);
		 }
	  public void clickonSubmitButton() {
		  submitButton.click();
		 }
	 
}
