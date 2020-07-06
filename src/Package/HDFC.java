package Package;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import atu.testng.reports.ATUReports;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import atu.testng.reports.logging.LogAs;
import atu.testng.reports.utils.Utils;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class,
  MethodListener.class })
public class HDFC 

{
	{
        System.setProperty("atu.reporter.config", "atu.properties");

      }


WebDriver driver;

@Test(enabled=false)
public void NegeativeLogin() 
{
	driver=new ChromeDriver();
	ATUReports.setWebDriver(driver);
	
	driver.manage().window().maximize();
	
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.switchTo().frame(driver.findElement(By.name("login_page")));
	driver.findElement(By.name("fldLoginUserId")).sendKeys("4391/4438");
	driver.findElement(By.xpath("(//img[@alt='continue'])[1]")).click();
	driver.findElement(By.name("fldPassword")).sendKeys("7358557246Ilu@");
	
	driver.findElement(By.xpath("//img[@alt='Login']")).click();
	driver.switchTo().defaultContent();
}

	@Test
	public void PositiveLogin() {
		driver=new ChromeDriver();
		ATUReports.setWebDriver(driver);
		ATUReports.setAuthorInfo("Akshaya Kumar", Utils.getCurrentTime(),
	            "HDFC_Beta");
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame(driver.findElement(By.name("login_page")));
		driver.findElement(By.name("fldLoginUserId")).sendKeys("43914438");
		driver.findElement(By.xpath("(//img[@alt='continue'])[1]")).click();
		driver.findElement(By.name("fldPassword")).sendKeys("++++");
		driver.findElement(By.name("chkrsastu")).click();
		driver.findElement(By.xpath("//img[@alt='Login']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("common_menu1")));
		String ActVal=driver.findElement(By.name("img_logo")).getAttribute("alt");
		String ExpVal="HDF Bank NetBanking";
		try {
			Assert.assertEquals(ActVal, ExpVal);
			driver.findElement(By.xpath("//img[@alt='Log Out']")).click();
			driver.switchTo().defaultContent();
			ATUReports.add("Logout Success", LogAs.PASSED, new CaptureScreen(
                    ScreenshotOf.BROWSER_PAGE));
		}catch(AssertionError  e) {
			
			ATUReports.add("Logout Not Success", LogAs.FAILED, new CaptureScreen(
                    ScreenshotOf.BROWSER_PAGE));
		}
		
		
	}
	
}
