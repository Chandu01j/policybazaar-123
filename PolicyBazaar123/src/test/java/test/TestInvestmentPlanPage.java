package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.InvestmentPlanPage;
import pomClasses.PolicybazaarHomePage;

public class TestInvestmentPlanPage {
	
	
	
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driverTest = new ChromeDriver();
		
		driverTest.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		driverTest.get("https://www.policybazaar.com/");
		
		PolicybazaarHomePage policybazaarHomePage =new PolicybazaarHomePage(driverTest);
		policybazaarHomePage.clickonChildSavingsButton();
		
		InvestmentPlanPage investmentPlanPage = new InvestmentPlanPage(driverTest);
		Thread.sleep(3000);
		investmentPlanPage.sendYourName();
		investmentPlanPage.sendMobileNo("8177813031");
		investmentPlanPage.sendemailId("chandrakantbharsawde7@gmail.com");
		investmentPlanPage.clickViewPlansButton();
		
		driverTest.close();
		

}
}