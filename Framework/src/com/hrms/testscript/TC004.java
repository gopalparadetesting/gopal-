package com.hrms.testscript;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC004 {
@Test
	public void DeleteEmp() 
	{
	General obj = new General();
	obj.openApplication();
	obj.login();
	obj.Switchtoframe();
	obj.DeleteEmp();
	obj.ExistFrame();
	obj.closeApplication();

	}

}
