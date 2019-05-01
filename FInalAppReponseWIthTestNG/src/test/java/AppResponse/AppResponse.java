package AppResponse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AppResponse {
	String appResponse="";
  @Test(priority=0)
  public void firstTest() throws InterruptedException  {
	  

//		WebDriver driver = new ChromeDriver();
		String reponseTime = "";
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ankit shivane\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://applapm.moh.gov.sa/");
		    Thread.sleep(20000);
		    driver.findElement(By.xpath("//*[@id='userNameInput']")).sendKeys("mawid_tcs_user");
		    driver.findElement(By.xpath("//*[@id='passwordInput']")).sendKeys("MkoIjn&890");
		    Thread.sleep(10000);

			driver.findElement(By.id("submitInput")).click();
			Thread.sleep(10000);
//			logger.info("Login Successful");
//			AppResponsePage.getDashboard(driver).click();
			driver.findElement(By.xpath(
					"//*[@id=\"topMenuBarContainerDivId\"]/ad-top-menu-bar/div/div[2]/div/div[3]/ad-main-navigation-tabs/div/div/div[7]/div")).click();
			Thread.sleep(5000);
//			logger.info("Dashboards page");
//			AppResponsePage.getApiPerformance(driver).click();
			driver.findElement(By.xpath(
					"//*[@id=\"appContainer\"]/div/div[2]/div[2]/div[2]/ad-view-stack/div/div/div/div[1]/div/div[3]/div[2]/ul/li[1]/div")).click();
			Thread.sleep(10000);
//			AppResponsePage.getTimeDropDown(driver).click();
			driver.findElement(By.xpath(
					"//*[@id=\"mainTitleBarContainerId\"]/ad-main-title-bar/div/div/div/div[6]/ad-time-range-selector/div/div/div/button")).click();
			Thread.sleep(2000);
//			AppResponsePage.getTime(driver).click();
			driver.findElement(By.xpath("//*[@id=\"ext-gen1018\"]/div[6]/div[2]/div/div[1]")).click();
			Thread.sleep(2000);
//			AppResponsePage.clickRefresh(driver).click();
			driver.findElement(
					By.xpath("//*[@id=\"mainTitleBarContainerId\"]/ad-main-title-bar/div/div/div/div[4]/button")).click();
			Thread.sleep(5000);
//			reponseTime = AppResponsePage.getResponseTime(driver).getText();
			appResponse =driver.findElement(By.xpath(
					"//*[@id=\"appContainer\"]/div/div[2]/div[2]/div[2]/ad-view-stack/div/ad-dashboard-canvas/div/div/div/div[16]/div[1]/ad-widget-metric-label/div/ad-main-container/div/div[1]/div/div/div/p[1]")).getText();
//			logger.info("Response Time : "+reponseTime);
			System.out.println("Response Time : "+appResponse);
//			AppResponsePage.getLogoutDropdown(driver).click();
			driver.findElement(By.id("id_topMenuBarGearIcon")).click();
			Thread.sleep(1000);
//			AppResponsePage.logOut(driver).click();
			driver.findElement(By.xpath("//*[@id=\"ext-gen1018\"]/div[6]/ad-top-menu-options/div/div[6]/div")).click();
			Thread.sleep(5000);
			driver.close();
  }
  
  @Test(priority=1)
  public void myResponse() throws InterruptedException{


		// WebDriver driver = new ChromeDriver();
		String reponseTime = "";

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ankit shivane\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
//		DesiredCapabilities d = DesiredCapabilities.chrome();
		ChromeOptions op = new ChromeOptions();
		/*op.addArguments("user-data-dir=C:\\Users\\" + System.getenv("ankit shivane")
				+ "\\AppData\\Local\\Google\\Chrome\\User Data\\Default");*/
		op.addArguments("--profile-directory=Defaults");
//		op.addArguments("--user-data-dir=C:\\Users\\" + System.getenv("ankit shivane")
//				+ "\\AppData\\Local\\Google\\Chrome\\User Data\\Defaults");
		op.addArguments("--user-data-dir=C:\\Users\\ankit shivane\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
		op.setCapability(op.CAPABILITY, op);
//		op.merge(d);
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(10000);
		/*driver.findElement(By.xpath("//*[@id='pane-side']/div/div/div/div[10]/div/div/div[2]/div[1]/div[1]/span/span"))
				.click();*/
		driver.findElement(By.xpath("//*[@id='pane-side']/div/div/div/div[1]/div/div/div[2]")).click();
		// String
		// grpName=driver.findElement(By.xpath("//*[@id='pane-side']/div/div/div/div[13]/div/div/div[2]/div[1]/div[1]/span")).getText();
		// System.out.println(grpName+" : Group name");
		Thread.sleep(2000);
		// if(grpName.equalsIgnoreCase("Family")){

		driver.findElement(By.xpath("//*[@id='main']/footer/div[1]/div[2]/div/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='main']/footer/div[1]/div[2]/div/div[2]")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='main']/footer/div[1]/div[2]/div/div[2]")).sendKeys("App Response : "+appResponse);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='main']/footer/div[1]/div[3]/button/span")).click();
		Thread.sleep(4000);
		// }else{
		 driver.close();
		System.out.println("Group not found");
		// }

	
  }
}
