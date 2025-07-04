package testLayer;

import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import pages.PimPage;

public class mainTest {
	
	public static void main(String[] args)
	{
		LoginPage login=new LoginPage();
		
		login.loginfuctionality("Admin", "admin123");
		
		HomePage home=new HomePage();
		home.validatelogo();
		
		PimPage pim=new PimPage();
		pim.clickOnPimPage();
		
		
		AdminPage admin=new AdminPage();
		
		admin.createNewEmployee();
	}

}
