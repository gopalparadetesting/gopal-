package webdriver;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
public class MouseOver {
//*******Test Data
	//DT    Var      VV
	static String url="http://183.82.103.245/nareshit/login.php";
	static String username="nareshit";
	static String password="nareshit";
	static String title1="OrangeHRM - New Level of HR Management";
	static String title2="OrangeHRM";
	
	public static void main(String[] args) throws Exception
	{
		//Test Steps
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(url);
		if (driver.getTitle().equals(title1))
		{
			System.out.println("Title Matched");
		}
		else
		{
			System.out.println("Title not Matched");
			System.out.println(driver.getTitle());
		}
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		System.out.println("login into application");
	
if(driver.getTitle().equals(title2)) {
	System.out.println("Title matched");
}
else {
	System.out.println("Title not matched");
	System.out.println(driver.getTitle());
}
Actions ac= new Actions(driver);
ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
System.out.println("mouseover completed");
Thread.sleep(2000);
//click on Submenu
driver.findElement(By.linkText("Add Employee")).click();
System.out.println("Clicked on Submenu");
Thread.sleep(4000);
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(2000);
System.out.println("Logout completed");
driver.close();

}
	}


