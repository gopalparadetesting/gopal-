package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUpload {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtEmpLastName']")).sendKeys("last name");
		driver.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("first name");
		//to upload a file
		WebElement fileinput= driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
		fileinput.sendKeys("D:\\gp.jpg");
		//fileinput.senkeys(
		Thread.sleep(4000);
		System.out.println("File uploaded successfully");
		driver.findElement(By.xpath("//input[@id='btnEdit']")).click();
		Thread.sleep(4000);
		System.out.println("New Employee Added");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
		
		 
	}

}
