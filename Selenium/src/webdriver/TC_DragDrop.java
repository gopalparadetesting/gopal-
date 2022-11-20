package webdriver;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import static org.testng.Assert.assertEquals;
public class TC_DragDrop {

	public static void main(String[] args) throws Exception{
		//test steps
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe.");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		//verify Title:stop exe in case of cond failed:Assert stmt
		assertEquals(driver.getTitle(),"Droppable |jQuery UI");
		System.out.println("Title matched");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Actions ac=new Actions(driver);
	   ac.dragAndDrop(driver.findElement(By.id("draggable")),
      driver.findElement(By.id("droppable"))).perform();
	   Thread.sleep(0);
	   System.out.println("Drag&Drop");
	   driver.close();
		 
	}

}
