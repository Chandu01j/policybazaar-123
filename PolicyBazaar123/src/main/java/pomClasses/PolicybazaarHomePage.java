package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicybazaarHomePage {
	
	

	// Variable : WebElement :Login Or Sign Up Page
	
	@FindBy (xpath = "//a[@class='sign-in']")
	private WebElement signInButton ; 
	
	
	@FindBy (xpath = "//p[text()='Term Life']")
	private WebElement termLifeButton ; 

	@FindBy (xpath = "//p[text()='Zero Cost']")
	private WebElement zeroCostButton ; 

	@FindBy (xpath = "//p[text()='Saral Jeevan']")
	private WebElement saralJeevanButton ; 
	
	@FindBy (xpath = "(//i[@class='arrow'])[1]")
	private WebElement insurance ; 

	@FindBy (xpath = "//span[text()='Family Health Insurance']")
	private WebElement familyHealthInsuranceButton ; 
	
	@FindBy (xpath = "//p[text()='Child Savings']")
	private WebElement childSavingsButton ; 

	
	// Constructor : Initialization of WebElement : Login Or Sign Up Page
	
	 public PolicybazaarHomePage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 
	 //Methods : Action on WebElement : Login Or Sign Up Page
	 
	  public void clickonSignInButton() {
		  signInButton.click();
	 }
	  
	  public void clickonTermLifeButton() {
		  termLifeButton.click();
		 }
	  
	  public void clickonZeroCostButton() {
		  zeroCostButton.click();
		 }
	  
	  public void clickonSaralJeevanButton() {
		  saralJeevanButton.click();
		 }
	  
	  public void clickonInsurance() {
		  insurance.click();
		  //actions class  
		 }
	  public void clickonFamilyHealthInsuranceButton() {
		  familyHealthInsuranceButton.click();
		 }
	  
	  public void clickonChildSavingsButton() {
		  childSavingsButton.click();
		 }
	  
	 
}


