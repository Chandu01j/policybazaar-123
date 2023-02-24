package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.PolicybazaarHomePage;
import pomClasses.TermInsurancePage;

public class TestZeroCostInsuranceForm {
	
	
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driverTest = new ChromeDriver();
		
		driverTest.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driverTest.manage().window().maximize();
		driverTest.get("https://www.policybazaar.com/");
		
		PolicybazaarHomePage policybazaarHomePage =new PolicybazaarHomePage(driverTest);
		policybazaarHomePage.clickonZeroCostButton();
		
		TermInsurancePage termInsurancePage =new TermInsurancePage(driverTest);
		Thread.sleep(2000);
		termInsurancePage.sendfullname("kiran patil");
		termInsurancePage.senddob();
		termInsurancePage.sendMobile("8177813031");
		termInsurancePage.clickonSubmit();
		
		driverTest.close();
		
}
}
