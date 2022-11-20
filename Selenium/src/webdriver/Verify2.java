package webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Verify2 {
	//********Test Data
	//DT Var     VV
	static String URL ="http://183.82.103.245/nareshit/login.php";
	static String username="nareshit";
	static String password="nareshit";
	static String title1="Orange HRM-New Level of HR Management";
	static String title2="OrangeHRM";
	

	public static void main(String[] args)throws Exception {
		//Test Steps 
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe.");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to(URL);
	//Verify Application Title
	Thread.sleep(3000);
	if(driver.getTitle().equals(title1)) {
		System.out.println("title matched");
		
	}
	else {
		System.out.println("title not matched");
		System.out.println(driver.getTitle());
	
	}
	driver.findElement(By.name("txtUserName")).sendKeys(username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	System.out.println("Login successful");
	if(driver.getTitle().equals(title2)) {
		System.out.println("title matched");
		
	}
	else {
		System.out.println("title not matched");
		System.out.println(driver.getTitle());
	}
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	System.out.println("Logout is successful");
	driver.close();
	
		
	}
	}


