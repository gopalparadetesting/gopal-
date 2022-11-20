package webdriver;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandlers {

	public static void main(String[] args)throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe.");
	WebDriver driver=new ChromeDriver();
	//1st wind
	driver.get("file:///D:/windo%20handler%20html/multiplewindows.html");
	Thread.sleep(3000);
	//2nd wind
	driver.findElement(By.id("btn2")).click();
	Thread.sleep(3000);
	//3rd wind
	driver.findElement(By.id("btn3")).click();
	ArrayList<String>windinfo=new
			ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(windinfo.get(0));
	Thread.sleep(3000);
	//driver.close();
	driver.quit();
		 

	}

}
