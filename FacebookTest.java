package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTest {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kishore");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Krish");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("kishorekrish");
		WebElement day = driver.findElement(By.id("day"));
		Select dayDropdown=new Select(day);
		dayDropdown.selectByValue("27");
		WebElement month = driver.findElement(By.id("month"));
		Select monthDropdown=new Select(month);
		monthDropdown.selectByValue("4");
		WebElement year = driver.findElement(By.id("year"));
		Select yearDropdown=new Select(year);
		yearDropdown.selectByVisibleText("2001");
	    driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	    driver.close();
		
	}

}
