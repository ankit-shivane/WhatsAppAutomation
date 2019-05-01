package com.suite1.AppResponse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.suit.vo.AppResponseGetterSetter;

public class AppResponseAppDynamics {

	public static void main(String[] args) throws InterruptedException {
AppResponseGetterSetter appRes=new AppResponseGetterSetter();
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

/*			
			driver.get("https://applapm.moh.gov.sa/");
		    driver.manage().window().maximize();
		    
//			driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
			Thread.sleep(10000);
			AppResponsePage.getUsername(driver).sendKeys("mawid_tcs_user");
			AppResponsePage.getPassword(driver).sendKeys("MkoIjn&890");*/
//			logger.info("Credentials Entered");
//			AppResponsePage.clickLogin(driver).click();
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
			reponseTime =driver.findElement(By.xpath(
					"//*[@id=\"appContainer\"]/div/div[2]/div[2]/div[2]/ad-view-stack/div/ad-dashboard-canvas/div/div/div/div[16]/div[1]/ad-widget-metric-label/div/ad-main-container/div/div[1]/div/div/div/p[1]")).getText();
//			logger.info("Response Time : "+reponseTime);
			
			appRes.setAppResponse(reponseTime);
			System.out.println("Response Time : "+appRes.getAppResponse());
//			AppResponsePage.getLogoutDropdown(driver).click();
			driver.findElement(By.id("id_topMenuBarGearIcon")).click();
			Thread.sleep(1000);
//			AppResponsePage.logOut(driver).click();
			driver.findElement(By.xpath("//*[@id=\"ext-gen1018\"]/div[6]/ad-top-menu-options/div/div[6]/div")).click();
			Thread.sleep(5000);
	}

}
