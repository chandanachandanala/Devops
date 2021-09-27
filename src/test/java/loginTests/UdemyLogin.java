package loginTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class UdemyLogin {
 WebDriver driver;
	@Test
  public void dologin() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https:/www.udemy.com/");
		driver.findElement(By.xpath("//span[normalize-space()='Log in']")).click();
Assert.assertEquals(driver.getTitle(),"Attention Required! | Cloudflare");
		
  }
  @BeforeTest
  public void beforeTest() {
  System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe" ); 
 driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() throws Exception {
 Thread.sleep(2000);
 driver.quit();
  }

}
