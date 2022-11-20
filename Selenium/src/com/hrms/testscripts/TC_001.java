package com.hrms.testscripts;

import com.hrms.lib.General;
import com.kenai.jffi.Main;

public class TC_001 {
	public static void main(String[] args) {
		
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
	}
	

}
