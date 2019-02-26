package QAIT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hris {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivamm\\Downloads\\Selenium and Chrome driver\\Chrome Driver\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
        driver.get("https://hris.qainfotech.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("shivamrastogi");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("shivam@123");
        driver.findElement(By.xpath("//input[@value='Sign In']")).click();
        driver.findElement(By.id("dvTaskboardLink")).click();
        driver.findElement(By.xpath("//h4[contains(text(), 'DFP')]")).click();
        driver.findElement(By.xpath("//h4[@title='Assigned']//button[@aria-label='Create New']")).click();
        
        
	}

}
