package com.hrms.testscript;
import org.testng.annotations.Test;

import com.hrms.lib.General;
@Test
public class TC001 {

	
	{
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.Logout();
		obj.closeApplication();
	}
}
