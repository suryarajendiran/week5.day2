package week5.day2assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Mobile {

	public static void main(String[] args) throws InterruptedException {
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
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Service catalog");
		shadow.findElementByXPath("//mark[text()='Service Catalog']").click();
		WebElement element = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(element);
		driver.findElement(By.xpath("//img[@alt='Mobiles']/following::span")).click();
		driver.getTitle();
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13']")).click();
		driver.findElement(By.xpath("//label[text()='No']")).click();
		WebElement data1 = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select phone= new Select(data1);
		phone.selectByIndex(1);
		driver.findElement(By.xpath("//label[text()='Pink']")).click();
		driver.findElement(By.xpath("//label[text()='128 GB']")).click();
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		driver.findElement(By.xpath("//div[@class='notification notification-success']")).getText();
				System.out.println("Thank you, your request has been submitted REQ0010002  ");
				driver.close();
}
	
	}
