package database.entities;

public class Events {

	@Override
	public String toString() {
		return "Events [ID=" + ID + ", name=" + name + "]";
	}
	int ID;
	String name;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Events(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}
	
	
	
}
