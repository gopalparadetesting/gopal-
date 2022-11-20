package webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class TC_Verify {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe.");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	//verify Application Title
	//Actual result  compare ExpectedResult
	if(driver.getTitle().equals("Orange HRM-New Level of HR Management")) {
		System.out.println("Title matched");
		
	}
	else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
		
	}
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login completed");
	Thread.sleep(3000);
	//
	if(driver.getTitle().equals("Orange HRM")) {
		System.out.println("Title matched");
		
	}
	else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
		
	}
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	System.out.println(By.linkText("Logout completed"));
	driver.close();
	
	
	
	}

}
