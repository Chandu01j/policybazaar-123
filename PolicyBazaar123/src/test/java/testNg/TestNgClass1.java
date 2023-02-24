package testNg;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.BrowserSetUp;
import pomClasses.InvestmentPlanPage;
import pomClasses.PolicybazaarHomePage;

import pomClasses.TermInsurancePage;

public class TestNgClass1 extends BrowserSetUp {
	WebDriver driver ;
	PolicybazaarHomePage policybazaarHomePage ;
	TermInsurancePage termInsurancePage;
	InvestmentPlanPage investmentPlanPage ;
	@Parameters ("browser")
	@BeforeTest
	public void LauchBrowser(String browserName) {
		
		if(browserName.equals("Chrome"))
		{
			driver = openChromeBrowser();	
		}
		
		if(browserName.equals("Edge"))
		{
			 driver = openEdgeBrowser();
		}
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();	
	}
	
	@BeforeClass
	public void ctreatePOMObjects() {
		policybazaarHomePage =new PolicybazaarHomePage(driver);
		termInsurancePage =new TermInsurancePage(driver);
		investmentPlanPage = new InvestmentPlanPage(driver);
	}
	@BeforeMethod
	public void goToHomePage()
	{
		driver.get("https://www.policybazaar.com/");
	}
		
	
	@Test (priority = 2)
	public void VerifySaralJeevaninsuranceForm() throws InterruptedException {
	//	PolicybazaarHomePage policybazaarHomePage =new PolicybazaarHomePage(driverTest);
		policybazaarHomePage.clickonSaralJeevanButton();
		
	//	TermInsurancePage termInsurancePage =new TermInsurancePage(driver);
		Thread.sleep(2000);
		termInsurancePage.sendfullname("chandu patil");
		termInsurancePage.senddob();
		termInsurancePage.sendMobile("8177813031");
	//	termInsurancePage.clickonSubmit();	
	}
	
	@Test (priority = 1)
	public void VerifyInvestmentPlanForm() throws InterruptedException {
	//	PolicybazaarHomePage policybazaarHomePage =new PolicybazaarHomePage(driverTest);
		policybazaarHomePage.clickonChildSavingsButton();
		
	//	InvestmentPlanPage investmentPlanPage = new InvestmentPlanPage(driver);
		Thread.sleep(3000);
		investmentPlanPage.sendYourName();
		investmentPlanPage.sendMobileNo("8177813031");
		investmentPlanPage.sendemailId("chandrakantbhasrawde7@gmail.com");
		investmentPlanPage.clickViewPlansButton();
	}
	
	@AfterMethod
	public void LogoutPage()
	{
		ArrayList<String> addr1 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(addr1.get(0));//switch to child browser
	}
	
	@AfterClass
	public void clearPOMObjects() {
		policybazaarHomePage = null;
		termInsurancePage = null;
		investmentPlanPage = null ;
	}
	
	@AfterTest 
	public void closedbrowser() {
		driver.quit();
		driver = null ;
		
		System.gc();
	}
}
