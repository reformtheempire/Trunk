package authentication;

import main.BookingSystem;
import database.DatabaseInterface;
import users.User;

public class Authenticator {

	public static boolean authenticated = false;
	private User user;
	
	
	public Authenticator(User user) {
		super();
		this.user = user;
	}




	public boolean doLogin(){
		BookingSystem.databaseConnection = DatabaseInterface.getConnection();
		if(BookingSystem.databaseConnection != null){
			//assume authentication was successful
			authenticated = true;
			return true;
		}
		return false;
	}
	
}
