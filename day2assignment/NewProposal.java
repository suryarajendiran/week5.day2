package week5.day2assignment;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;
public class NewProposal {

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
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("My Proposals",Keys.ENTER);
		shadow.findElementByXPath("//span[@class='item-icon']").click();
		WebElement element = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(element);
		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Replace the mobile phone");
		//driver.findElement(By.xpath("(//span[@class='tab_caption_text']")).click();
		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("product color was mismatch");
		driver.findElement(By.xpath("(//textarea[@class='form-control'])[2]")).sendKeys("explain aobut the products");
				driver.findElement(By.xpath("(//button[@type='submit'])[4]")).click();
		driver.close();
	}

}
