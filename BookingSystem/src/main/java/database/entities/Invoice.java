package database.entities;

import java.sql.Date;

public class Invoice {
	
	private int ID;
	private int customerID;
	private int eventType;
	private Date date;
	private double price;
//	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getCustomerID() {
		return customerID;
	}
	public Invoice(int iD, int customerID, int eventType, Date date,
			double price) {
		super();
		ID = iD;
		this.customerID = customerID;
		this.eventType = eventType;
		this.date = date;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Booking [ID=" + ID + ", customerID=" + customerID
				+ ", eventType=" + eventType + ", date=" + date + ", price="
				+ price + "]";
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getEventType() {
		return eventType;
	}
	public void setEventType(int eventType) {
		this.eventType = eventType;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
