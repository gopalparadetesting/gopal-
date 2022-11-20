package com.hrms.lib;
import org.openqa.selenium.WebDriver;
public class Global {
	//StdRule:To Provide TestData&Objects for whole application
	public WebDriver driver;
	//**********TestData
	public String url="http://183.82.103.245/nareshit/login.php";
	public String un="nareshit";
	public String pw="nareshit";
	//*****Object/Elements
	public String txt_loginname="txtUserName";
	public String txt_password="txtPassword";
	public String btn_login="Submit";
	public String link_logout="Logout";
	public String Frame = "rightMenu";
	//Emp data
	public String EmpfirstName="Rohit";
	public String EmpLastName="Modi";
	public String Empid="1261";
	//Element 
	public String btn_AddEmp="//input[@value='Add'][@type='button']";
	public String btn_Save="btnEdit";
	public String txt_EmpFirstName="txtEmpFirstName";
	public String txt_EmpLastName="txtEmpLastName";

	

}
