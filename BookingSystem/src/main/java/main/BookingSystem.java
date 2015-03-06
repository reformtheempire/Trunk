package main;

import java.awt.EventQueue;
import java.sql.Connection;

import users.User;
import window.ControlPanel;
import window.LoginScreen;
import database.DatabaseInterface;



public class BookingSystem {

	public static Connection databaseConnection;
	public static User user;
	static ControlPanel window;
	public static void main(String[] args) {
		LoginScreen loginScreen = new LoginScreen();
		loginScreen.show();
		
	}
	
	
	public static void showMainWindow(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new ControlPanel();
					window.frmBigbookingSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});;
	}


	public static void reloadControlPanel() {
		window.frmBigbookingSystem.dispose();
		window = new ControlPanel();
		window.frmBigbookingSystem.setVisible(true);
		
	}
	
}
