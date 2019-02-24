package Runner;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

public static void main(String[] args) {

	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shivamm\\Downloads\\Selenium and Chrome driver\\Chrome Driver\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://www.makemytrip.com/");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.findElement(By.cssSelector("input#hp-widget__sfrom")).click();
    driver.findElement(By.xpath("//span[contains(text(),'New Delhi, India ')]")).click();
    driver.findElement(By.id("hp-widget__sTo")).sendKeys("Dehradun");
    driver.findElement(By.xpath("//li[@aria-label='Search Result : Dehradun, India']")).click();
    driver.findElement(By.xpath("(//div[@class='dateFilter hasDatepicker']//a[contains(text(), '11')])[1]")).click();
    driver.findElement(By.xpath("//div[@class='inputM inputHlp disable inputDateFilter']")).click();
    driver.findElement(By.xpath("(//div[@class='dateFilterReturn hasDatepicker']//a[contains(text(), '13')])[1]")).click();
    driver.findElement(By.xpath("//div[@class='inputM visited pax_count pot']")).click();
    driver.findElement(By.xpath("(//div[@class='paxCounter__counter']//li[contains(text(), '2')])[1]")).click();
    driver.findElement(By.xpath("(//a[contains(text(), 'Done')])[2]")).click();    
    driver.findElement(By.id("searchBtn")).click();
	}

}

