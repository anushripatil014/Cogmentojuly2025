package testLayer;

import pages.HomePage;
import pages.LoginPage;

public class mainTest {
	
	public static void main(String[] args)
	{
		LoginPage login=new LoginPage();
		
		login.loginfuctionality("Admin", "admin123");
		
		HomePage home=new HomePage();
		home.validatelogo();
		
		
	}

}
