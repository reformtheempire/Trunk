package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import main.BookingSystem;
import users.User;
import database.entities.Customer;
import database.entities.Events;
import database.entities.Invoice;

public class DatabaseInterface {

	public static void testCanConnect() {
		try {
			BookingSystem.databaseConnection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		User user = BookingSystem.user;
		System.out.println("Connecting to DB");
		Connection conn = null;
		String url = "jdbc:mysql://server.mather.ch:3306/";
		String dbName = "david_db";
		String driver = "com.mysql.jdbc.Driver";
		String userName = user.getUsername();
		String password = user.getPassword();
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager
					.getConnection(url + dbName, userName, password);
			System.out.println("Connected to the database");
			return conn;
			// conn.close();
			// System.out.println("Disconnected from database");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static Customer getCustomer(int ID) {
		Connection con = getConnection();
		Customer c = null;
		String selectString = "Select * from Customers where id = ?";
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement(selectString);
			stmt.setInt(1, ID);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("ID");
				String fname = rs.getString("fname");
				String lname = rs.getString("lname");
				String businessName = rs.getString("business_name");
				String addressLine1 = rs.getString("address_line_1");
				String addressLine2 = rs.getString("address_line_2");
				String addressLine3 = rs.getString("address_line_3");
				String city = rs.getString("city");
				String county = rs.getString("county");
				String country = rs.getString("country");
				String postcode = rs.getString("postcode");
				c = new Customer(id, fname, lname, businessName, addressLine1,
						addressLine2, addressLine3, city, county, country,
						postcode);
			}
			stmt.close();
			con.close();
			System.out.println(c);
		} catch (SQLException ex) {
			System.err.println("SQL Exeception: " + ex.getMessage());
			c = null;
		}
		return c;
	}

	public static Collection<Customer> getCustomers() {
		Connection con = getConnection();
		Collection<Customer> customers = new ArrayList<Customer>();
		String selectString = "Select * from Customers";
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement(selectString);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("ID");
				String fname = rs.getString("fname");
				String lname = rs.getString("lname");
				String businessName = rs.getString("business_name");
				String addressLine1 = rs.getString("address_line_1");
				String addressLine2 = rs.getString("address_line_2");
				String addressLine3 = rs.getString("address_line_3");
				String city = rs.getString("city");
				String county = rs.getString("county");
				String country = rs.getString("country");
				String postcode = rs.getString("postcode");
				customers.add(new Customer(id, fname, lname, businessName,
						addressLine1, addressLine2, addressLine3, city, county,
						country, postcode));
			}
			for (Customer customer : customers) {
				System.out.println(customer.toString());
			}
			stmt.close();
			con.close();
		} catch (SQLException ex) {
			System.err.println("SQL Exeception: " + ex.getMessage());
			customers = null;
		}
		return customers;
	}

	public static Collection<Events> getEvents() {
		Connection con = getConnection();
		Collection<Events> events = new ArrayList<Events>();
		String selectString = "Select * from Events";
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement(selectString);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("name");
				events.add(new Events(id, name));
			}
			stmt.close();
			con.close();
			for (Events events2 : events) {
				System.out.println(events2.toString());
			}
		} catch (SQLException ex) {
			System.err.println("SQL Exeception: " + ex.getMessage());
			events = null;
		}
		return events;
	}

	public static int getNewID() {
		Connection con = getConnection();
		int number = 4864534;
		String selectString = "Select COUNT(*) from Invoices";
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement(selectString);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				number = rs.getInt("COUNT(*)");
				number++;
			}
			stmt.close();
			con.close();
			System.out.println("New invoice number :" + number);
		} catch (SQLException ex) {
			System.err.println("SQL Exeception: " + ex.getMessage());
			number = 4864534;
		}
		return number;
	}
	
	public static boolean createNewInvoice(Invoice invoice){
		Connection con = getConnection();
		String insertString = "INSERT INTO Invoices(ID, Customer_ID, Event_Type, Event_Date, Event_Price) VALUES (?,?,?,?,?)";
		PreparedStatement stmt = null;
		boolean completed = false;
		try{
			stmt = con.prepareStatement(insertString);
			stmt.setInt(1, invoice.getID());
			stmt.setInt(2, invoice.getCustomerID());
			stmt.setInt(3, invoice.getEventType());
			stmt.setDate(4, invoice.getDate());
			stmt.setDouble(5, invoice.getPrice());
			completed = stmt.execute();
			stmt.close();
			con.close();
		}catch (SQLException e){
			System.err.println("SQL Exception" + e.getMessage());
			return completed;
		}
		return completed;
	}

	public static int getNextCustomerID() {
		Connection con = getConnection();
		int number = 4864534;
		String selectString = "Select COUNT(*) from Customers";
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement(selectString);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				number = rs.getInt("COUNT(*)");
				number++;
			}
			stmt.close();
			con.close();
			System.out.println("New customer number :" + number);
		} catch (SQLException ex) {
			System.err.println("SQL Exeception: " + ex.getMessage());
			number = 4864534;
		}
		return number;
	}

	public static boolean createNewCustomer(Customer customer) {
		Connection con = getConnection();
		String insertString = "INSERT INTO Customers(ID, FName, LName, Business_Name, Address_Line_1, Address_Line_2, Address_Line_3, City, County, Country, Postcode) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = null;
		boolean completed = false;
		if(customer.getBusinessName().equals("")){
			customer.setBusinessName(null);
		}
		if(customer.getAddressLine2().equals("")){
			customer.setAddressLine2(null);
		}
		if(customer.getAddressLine3().equals("")){
			customer.setAddressLine3(null);
		}
		
		try{
			stmt = con.prepareStatement(insertString);
			stmt.setInt(1, customer.getID());
			stmt.setString(2, customer.getFname());
			stmt.setString(3, customer.getLname());
			stmt.setString(4, customer.getBusinessName());
			stmt.setString(5, customer.getAddressLine1());
			stmt.setString(6, customer.getAddressLine2());
			stmt.setString(7, customer.getAddressLine3());
			stmt.setString(8, customer.getCity());
			stmt.setString(9, customer.getCounty());
			stmt.setString(10, customer.getCountry());
			stmt.setString(11, customer.getPostcode());
			completed = stmt.execute();
			stmt.close();
			con.close();
			System.out.println("created new " + customer.toString());
		}catch (SQLException e){
			System.err.println("SQL Exception" + e.getMessage());
			return completed;
		}
		return completed;
	}
}
