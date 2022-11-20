
package webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class FbLogin {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\\\ChromeDriver\\\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
        driver.findElement(By.name("email")).sendKeys("8805548214");
        driver.findElement(By.name("pass")).sendKeys("patil9999");
        Thread.sleep(3000);
        driver.findElement(By.name("login")).click();
    
        Thread.sleep(3000);
        
	}

}
