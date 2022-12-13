package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kishore");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kishore");
	    driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
	    driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("K");
	    driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Engineer");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software QA Engineer");
	    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("600000");
	    driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("15");
	    driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("19002704");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Software Test Engineer");
	    driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Having Manual and Automation Testing Knowledge");
	    driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("£");
	    driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
	    driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("04343");
	    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
	    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("1900");
	    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Testing Engineer");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kishore123@gmail.com");
	    driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.testleaf.com");
	    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Prabhu");
	    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Krishnan");
	    driver.findElement(By.name("generalAddress1")).sendKeys("1/90 near LIC office");
	    driver.findElement(By.name("generalAddress2")).sendKeys("Avvai Nagar");
	    driver.findElement(By.className("createLeadForm_generalCity")).sendKeys("Krishnagiri");
	    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("635001");
	    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("001");
	    driver.findElement(By.className("smallSubmit")).click();

	
	}

}
