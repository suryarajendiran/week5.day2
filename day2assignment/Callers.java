package week5.day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Callers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dev85321.service-now.com");
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("Sury@1106");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(30);
		shadow.findElementByXPath("//div[@class='sn-polaris-tab can-animate polaris-enabled']").click();
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Callers");
		shadow.findElementByXPath("//mark[text()='Callers']").click();
	    WebElement element = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(element);
		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
		driver.findElement(By.xpath("//input[@class='form-control ']")).sendKeys("surya");
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("abcxyz@gmail.com");
		driver.findElement(By.xpath("(//input[@data-type='string'])[2]")).sendKeys("Rajendiran");
		driver.findElement(By.xpath("//span[text()='Business phone']/following::input[2]")).sendKeys("(987) 654-3210");
		driver.findElement(By.xpath("//input[@data-dependent='null']")).sendKeys("Callers");
		driver.findElement(By.xpath("(//input[@class='form-control phone-number'])[2]")).sendKeys("(897) 654-0123");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.close();
	}

}
