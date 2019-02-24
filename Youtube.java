package Runner;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) {
				
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivamm\\Downloads\\Selenium and Chrome driver\\Chrome Driver\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
	driver.get("http://www.youtube.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//ytd-button-renderer[@class='style-scope ytd-masthead style-blue-text size-default']")).click();
	driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("shivammrastogi");
	driver.findElement(By.id("identifierNext")).click();
	driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("rakshik$");
	driver.findElement(By.id("passwordNext")).click();
	driver.findElement(By.xpath("//span[contains(text(), 'Subscriptions')]")).click();
	driver.findElement(By.xpath("//yt-formatted-string[contains(text(), 'Manage')]")).click();
	driver.findElement(By.xpath("//span[contains(text(), 'Marvel Entertainment')]")).click();
	driver.findElement(By.xpath("//yt-icon[@icon='yt-icons:search' and @class='style-scope ytd-expandable-tab-renderer']")).click();
    driver.findElement(By.xpath("//input[@is='iron-input']")).sendKeys("Avengers trailer");
    driver.findElement(By.xpath("//input[@is='iron-input']")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//a[contains(text(), 'Avengers - Official')]")).click();

	}
	
}

