package webdriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_Links {
	
	public static void main(String[] args)throws Exception {
	 System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\ChromeDriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.navigate().to("http://www.google.com");
	 List<WebElement>links=
			 driver.findElements(By.tagName("a"));
	 for(WebElement allinks:links) {
		 System.out.println(allinks.getText());
		 Thread.sleep(300);
		 
	 }
	driver.quit()	;	 
	}

}
