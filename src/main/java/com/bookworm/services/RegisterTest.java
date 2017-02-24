package com.bookworm.services;

public class RegisterTest {
	
	public RegisterTest(){
		
	}
	
	/* Check for one '@', check that @ isnt at start or end, check
	 * for at least one '.', return false if any test fails
	 */
	public static boolean testEmail(String email) {
	    
		if (email.indexOf('@', email.indexOf('@')) != -1)
			return false;
		else if (email.indexOf('@') < 1)
			return false;
		else if (email.indexOf('@') == email.length() - 1)
			return false;
		else if (email.indexOf('.') < 0)
			return false;
		
		else return true;
	}
	
	public static boolean testPhone(String phone) {
		
		if (phone.length() < 7)
			return false;
		else if (phone.matches(".*[a-zA-Z].*"))
			return false;
		else return true;
	}
}
