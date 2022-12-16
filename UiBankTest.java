package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UiBankTest {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://uibank.uipath.com/registe-account");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("firstName")).sendKeys("Kishore");
	WebElement title = driver.findElement(By.id("title"));
	Select titleDropdown=new Select(title);
	titleDropdown.selectByValue("mr");
	driver.findElement(By.id("middleName")).sendKeys("K");
	driver.findElement(By.id("lastName")).sendKeys("Krishnan");
	WebElement gender = driver.findElement(By.id("sex"));
	Select genderDropdown=new Select(gender);
	genderDropdown.selectByValue("male");
    WebElement employmentstatus = driver.findElement(By.id("employmentStatus"));
	Select employmentStatusDropdown=new Select(employmentstatus);
	employmentStatusDropdown.selectByVisibleText("Unemployed");
	driver.findElement(By.id("age")).sendKeys("21");
	WebElement maritialstatus = driver.findElement(By.id("maritalStatus"));
	Select maritialStatusDropdown=new Select(maritialstatus);
	maritialStatusDropdown.selectByValue("Single");
	driver.findElement(By.id("username")).sendKeys("Kishore Krishnan");
	driver.findElement(By.id("email")).sendKeys("kishorekrishtk27@gmail.com");
	driver.findElement(By.id("password")).sendKeys("2704kishore@1900");
	driver.close();
}
}
