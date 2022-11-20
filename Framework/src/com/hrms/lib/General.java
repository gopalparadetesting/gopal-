package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class General extends Global{
	//StdRule:To provide all re-usable fun:/methods of whole application
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application opened");
		
	}
public void closeApplication() {
	driver.quit();
	System.out.println("Application closed");
	
}
public void  login() 
{
	driver.findElement(By.name(txt_loginname)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("Login completed");
	}
public void getTitle() 
{
	System.out.println("Application title us "+ driver.getTitle());
	
	}
public void Switchtoframe() 
{
	driver.switchTo().frame(0);
	
	
	}
public void ExistFrame() {
	driver.switchTo().defaultContent();
}
public void EditEmp() 
{
driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr[3]/td[3]/a")).click();
driver.findElement(By.name("EditMain")).click();

driver.findElement(By.name("txtEmpFirstName")).clear();
driver.findElement(By.name("txtEmpFirstName")).sendKeys("gopal");
driver.findElement(By.name("txtEmpLastName")).clear();
driver.findElement(By.name("txtEmpLastName")).sendKeys("p");

}
public void DeleteEmp() 
{
	driver.findElement(By.name("loc_code")).sendKeys("EmpID");
driver.findElement(By.id("loc_name")).sendKeys("1");
driver.findElement(By.xpath("//input[@value='Search']")).click();
driver.findElement(By.name("chkLocID[]")).click();
driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[2]")).click();

System.out.println("Deleted succssefully");
	}
public void Logout() 
{
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("Logout complted");
	
	}
public void aadEmp() {
	driver.findElement(By.xpath("//input[@value='Add']")).click();
	driver.findElement(By.name("txtEmpLastName")).sendKeys("p");
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("gopi");
	driver.findElement(By.id("btnEdit")).click();
}

}
