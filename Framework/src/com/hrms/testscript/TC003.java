package com.hrms.testscript;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC003 {
	@Test
	public void EditEmp()
	
	{
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.getTitle();
		obj.Switchtoframe();
		obj.aadEmp();
		obj.closeApplication();
		
	}

}
