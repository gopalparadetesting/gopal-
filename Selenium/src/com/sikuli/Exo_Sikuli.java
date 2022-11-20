package com.sikuli;
import org.sikuli.script.Screen;
public class Exo_Sikuli {
	public static void main(String args[]) throws Exception{
	    // Test steps
	Screen obj = new Screen();
	obj.click("C:\\Users\\hp\\Desktop\\Eclipse_project\\Selenium\\ECLIPSEIDEMINIMIZE.PNG");
	Thread.sleep(3000);
	obj.doubleClick("C:\\Users\\hp\\Desktop\\Eclipse_project\\Selenium\\RHISPC.PNG");
	Thread.sleep(3000);
	obj.click("C:\\Users\\hp\\Desktop\\Eclipse_project\\Selenium\\THISPCCLOSE.PNG");
	

	}

}
