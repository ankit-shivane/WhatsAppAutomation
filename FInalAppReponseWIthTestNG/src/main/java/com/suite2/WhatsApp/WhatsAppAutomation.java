package com.suite2.WhatsApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.suit.vo.AppResponseGetterSetter;

public class WhatsAppAutomation {

	public static void main(String[] args) throws InterruptedException{
AppResponseGetterSetter appRes=new AppResponseGetterSetter();
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
		driver.findElement(By.xpath("//*[@id='pane-side']/div/div/div/div[10]/div/div/div[2]/div[1]/div[1]/span/span"))
				.click();
		// String
		// grpName=driver.findElement(By.xpath("//*[@id='pane-side']/div/div/div/div[13]/div/div/div[2]/div[1]/div[1]/span")).getText();
		// System.out.println(grpName+" : Group name");
		Thread.sleep(2000);
		// if(grpName.equalsIgnoreCase("Family")){

		driver.findElement(By.xpath("//*[@id='main']/footer/div[1]/div[2]/div/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='main']/footer/div[1]/div[2]/div/div[2]")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='main']/footer/div[1]/div[2]/div/div[2]")).sendKeys(appRes.getAppResponse());
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='main']/footer/div[1]/div[3]/button/span")).click();
		Thread.sleep(4000);
		// }else{
		 driver.close();
		System.out.println("Group not found");
	}

}
