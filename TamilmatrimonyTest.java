package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilmatrimonyTest {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.tamilmatrimony.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement profile = driver.findElement(By.id("REGISTERED_BY"));
	Select profileDropdown=new Select(profile);
	profileDropdown.selectByValue("1");
	driver.findElement(By.id("NAME")).sendKeys("Kishore Krishnan");
	driver.findElement(By.id("gendermale")).click();
	WebElement day = driver.findElement(By.id("DOBDAY"));
	Select dayDropdown=new Select(day);
	dayDropdown.selectByValue("27");
	WebElement month = driver.findElement(By.id("DOBMONTH"));
	Select monthDropdown=new Select(month);
	monthDropdown.selectByValue("4");
	WebElement year = driver.findElement(By.id("DOBYEAR"));
	Select yearDropdown=new Select(year);
	yearDropdown.selectByValue("2000");
	WebElement religion = driver.findElement(By.id("RELIGION"));
	Select religionDropdown=new Select(religion);
	religionDropdown.selectByValue("1");
	WebElement country = driver.findElement(By.id("COUNTRY"));
	Select countryDropdown=new Select(country);
	countryDropdown.selectByValue("98");
	WebElement code = driver.findElement(By.id("M_COUNTRYCODE"));
	Select codeDropdown=new Select(code);
	codeDropdown.selectByValue("98");
	driver.findElement(By.id("MOBILENO")).sendKeys("9876543210");
	driver.findElement(By.id("EMAIL")).sendKeys("kishore@gmail.com");
	driver.findElement(By.id("PASSWORD")).sendKeys("kishore27041900");
}
}
