package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class TC_KB_WD {
public static void main(String[] args)throws Exception {
	System.setProperty("webdriver.chrome driver","D:\\ChromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://www.google.com");
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys("selenium");
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	driver.close();
		 
	}

}
