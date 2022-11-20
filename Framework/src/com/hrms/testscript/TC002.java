package com.hrms.testscript;

import org.testng.annotations.Test;

import com.hrms.lib.General;
@Test
public class TC002 {

	 {
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.Switchtoframe();
		obj.EditEmp();
		obj.ExistFrame();
		obj.Logout();
		obj.closeApplication();

	}

}
