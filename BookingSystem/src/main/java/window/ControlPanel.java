package window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import database.DatabaseInterface;
import database.entities.Invoice;
import database.entities.Customer;
import database.entities.Events;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.RepaintManager;

import main.BookingSystem;

import org.apache.commons.lang3.StringUtils;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.sql.Date;

public class ControlPanel {

	public JFrame frmBigbookingSystem;
	private JTextField eventPriceTextField;
	private JTextField customerID;
	private JTextField fname;
	private JTextField lname;
	private JTextField businessName;
	private JTextField addressLine1;
	private JTextField addressLine2;
	private JTextField addressLine3;
	private JTextField city;
	private JTextField country;
	private JTextField county;
	private JTextField postcode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControlPanel window = new ControlPanel();
					window.frmBigbookingSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ControlPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBigbookingSystem = new JFrame();
		frmBigbookingSystem.setTitle("The Big Disco Company - Booking System");
		frmBigbookingSystem.setBounds(100, 100, 562, 379);
		frmBigbookingSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBigbookingSystem.getContentPane().setLayout(null);
		
		JTabbedPane bookingPane = new JTabbedPane(JTabbedPane.TOP);
		bookingPane.setBounds(0, 0, 546, 341);
		frmBigbookingSystem.getContentPane().add(bookingPane);
		
		JTabbedPane newBookingPane = new JTabbedPane(JTabbedPane.TOP);
		bookingPane.addTab("Bookings", null, newBookingPane, null);
		
		JPanel panel = new JPanel();
		newBookingPane.addTab("New Booking", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblBookingId = new JLabel("Booking ID");
		lblBookingId.setBounds(23, 30, 60, 14);
		panel.add(lblBookingId);
		
		JLabel lblCustomer = new JLabel("Customer");
		lblCustomer.setBounds(23, 54, 60, 17);
		panel.add(lblCustomer);
		
		final JComboBox customerBox = new JComboBox();
		customerBox.setBounds(124, 52, 126, 20);
		customerBox.addItem("Select...");
		Collection<Customer> customers = DatabaseInterface.getCustomers();
		for (Customer customer : customers) {
			customerBox.addItem(customer.getID() + ":" + customer.getBusinessName());
		}
		panel.add(customerBox);
		
		JLabel lblBookingType = new JLabel("Booking Type");
		lblBookingType.setBounds(23, 82, 78, 14);
		panel.add(lblBookingType);
		
		final JComboBox bookingTypeBox = new JComboBox();
		bookingTypeBox.setBounds(124, 79, 126, 20);
		Collection<Events> events = DatabaseInterface.getEvents();
		bookingTypeBox.addItem("Select...");
		for (Events event : events) {
			bookingTypeBox.addItem(event.getID() + ":" + event.getName());
		}
		panel.add(bookingTypeBox);
		
		final JTextField lblId = new JTextField(DatabaseInterface.getNewID()+"");
		lblId.setEditable(false);
		if(lblId.getText() == "4864534"){
			JOptionPane.showMessageDialog(null, "There has been an error. Please restart the program to continue");
		}
		lblId.setBounds(125, 28, 125, 17);
		panel.add(lblId);
		
		JLabel lblEventPrice = new JLabel("Event Price (\u00A3)");
		lblEventPrice.setBounds(23, 107, 100, 17);
		panel.add(lblEventPrice);
		
		eventPriceTextField = new JTextField();
		eventPriceTextField.setBounds(124, 105, 126, 20);
		panel.add(eventPriceTextField);
		eventPriceTextField.setColumns(10);
		
		JLabel lblEventDate = new JLabel("Event Date:");
		lblEventDate.setBounds(23, 135, 78, 14);
		panel.add(lblEventDate);
		
		final JComboBox dayComboBox = new JComboBox();
		dayComboBox.setBounds(23, 186, 60, 20);
		for (int i = 1; i < 32; i++) {
			dayComboBox.addItem(i);
		}
		panel.add(dayComboBox);
		
		final JComboBox monthComboBox = new JComboBox();
		monthComboBox.setBounds(93, 186, 60, 20);
		for (int i = 1; i < 13; i++) {
			monthComboBox.addItem(i);
		}
		panel.add(monthComboBox);
		
		final JComboBox yearComboBox = new JComboBox();
		yearComboBox.setBounds(163, 186, 65, 20);
		for (int i = 2015; i < 2026; i++) {
			yearComboBox.addItem(i);
		}
		panel.add(yearComboBox);
		
		JButton btnCreateBooking = new JButton("Create Booking");
		btnCreateBooking.setBounds(386, 251, 140, 23);
		btnCreateBooking.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String strDate = yearComboBox.getSelectedItem().toString() + "-" + monthComboBox.getSelectedItem().toString() + "-" + dayComboBox.getSelectedItem().toString();
				System.out.println(strDate);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				java.util.Date dated = null;
				try {
					dated = sdf.parse(strDate);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(dated == null){
					JOptionPane.showMessageDialog(null, "There has been an error. Please restart the program to continue");
				}
				Date date = new Date(dated.getTime());
				
				String[] customerID = StringUtils.split(customerBox.getSelectedItem().toString(), ":");
				String[] eventType = StringUtils.split(bookingTypeBox.getSelectedItem().toString(), ":");
				Invoice booking = new Invoice(Integer.parseInt(lblId.getText()), Integer.parseInt(customerID[0]), Integer.parseInt(eventType[0]), date, Double.parseDouble(eventPriceTextField.getText()));
				System.out.println("Created new: " + booking.toString());
				DatabaseInterface.createNewInvoice(booking);
			}
		});
		
		panel.add(btnCreateBooking);
		
		JButton btnPrintInvoice = new JButton("Print Invoice");
		btnPrintInvoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPrintInvoice.setBounds(386, 217, 140, 23);
		panel.add(btnPrintInvoice);
		
		JButton btnRefreshPage = new JButton("Refresh Page");
		btnRefreshPage.setBounds(386, 183, 140, 23);
		btnRefreshPage.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				BookingSystem.reloadControlPanel();
			}
		});
		panel.add(btnRefreshPage);
		
		JLabel lblDay = new JLabel("Day");
		lblDay.setBounds(23, 160, 46, 14);
		panel.add(lblDay);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setBounds(93, 160, 46, 14);
		panel.add(lblMonth);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(164, 161, 46, 14);
		panel.add(lblYear);
		
		//Control Panel
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		bookingPane.addTab("Control Panel", null, tabbedPane_2, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane_2.addTab("Create Customer", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblCustomerId = new JLabel("Customer ID");
		lblCustomerId.setBounds(10, 11, 80, 14);
		panel_1.add(lblCustomerId);
		
		customerID = new JTextField();
		customerID.setEditable(false);
		customerID.setBounds(121, 8, 136, 20);
		panel_1.add(customerID);
		customerID.setColumns(10);
		customerID.setText(DatabaseInterface.getNextCustomerID()+"");
		
		JLabel lblCustomerFirstName = new JLabel("Customer First Name");
		lblCustomerFirstName.setBounds(10, 42, 100, 14);
		panel_1.add(lblCustomerFirstName);
		
		fname = new JTextField();
		fname.setBounds(121, 39, 136, 20);
		panel_1.add(fname);
		fname.setColumns(10);
		
		JLabel lblCustomerLastName = new JLabel("Customer Last Name");
		lblCustomerLastName.setBounds(281, 42, 99, 14);
		panel_1.add(lblCustomerLastName);
		
		lname = new JTextField();
		lname.setBounds(390, 39, 136, 20);
		panel_1.add(lname);
		lname.setColumns(10);
		
		businessName = new JTextField();
		businessName.setBounds(121, 71, 136, 20);
		panel_1.add(businessName);
		businessName.setColumns(10);
		
		JLabel lblBusinessName = new JLabel("Business Name");
		lblBusinessName.setBounds(10, 74, 100, 14);
		panel_1.add(lblBusinessName);
		
		addressLine1 = new JTextField();
		addressLine1.setBounds(121, 102, 405, 20);
		panel_1.add(addressLine1);
		addressLine1.setColumns(10);
		
		addressLine2 = new JTextField();
		addressLine2.setBounds(121, 133, 405, 20);
		panel_1.add(addressLine2);
		addressLine2.setColumns(10);
		
		addressLine3 = new JTextField();
		addressLine3.setBounds(121, 164, 405, 20);
		panel_1.add(addressLine3);
		addressLine3.setColumns(10);
		
		city = new JTextField();
		city.setBounds(121, 195, 136, 20);
		panel_1.add(city);
		city.setColumns(10);
		
		country = new JTextField();
		country.setBounds(121, 226, 136, 20);
		panel_1.add(country);
		country.setColumns(10);
		
		county = new JTextField();
		county.setBounds(390, 195, 136, 20);
		panel_1.add(county);
		county.setColumns(10);
		
		JLabel lblAddressLine = new JLabel("Address Line 1");
		lblAddressLine.setBounds(10, 105, 100, 14);
		panel_1.add(lblAddressLine);
		
		JLabel lblAddressLine_1 = new JLabel("Address Line 2");
		lblAddressLine_1.setBounds(10, 136, 100, 14);
		panel_1.add(lblAddressLine_1);
		
		JLabel lblAddressLine_2 = new JLabel("Address Line 3");
		lblAddressLine_2.setBounds(10, 167, 100, 14);
		panel_1.add(lblAddressLine_2);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(10, 198, 100, 14);
		panel_1.add(lblCity);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(10, 229, 100, 14);
		panel_1.add(lblCountry);
		
		postcode = new JTextField();
		postcode.setBounds(390, 226, 136, 20);
		panel_1.add(postcode);
		postcode.setColumns(10);
		
		JLabel lblCounty = new JLabel("County");
		lblCounty.setBounds(281, 198, 92, 14);
		panel_1.add(lblCounty);
		
		JLabel lblPostcode = new JLabel("Postcode");
		lblPostcode.setBounds(281, 229, 46, 14);
		panel_1.add(lblPostcode);
		
		JButton btnCreateCustomer = new JButton("Create Customer");
		btnCreateCustomer.setBounds(390, 257, 136, 23);
		btnCreateCustomer.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Customer customer = new Customer(Integer.parseInt(customerID.getText()), fname.getText(), lname.getText(), businessName.getText(), addressLine1.getText(), addressLine2.getText(), addressLine3.getText(), city.getText(), county.getText(), country.getText(), postcode.getText());
				
				if(DatabaseInterface.createNewCustomer(customer)){
					BookingSystem.reloadControlPanel();
					JOptionPane.showMessageDialog(null, "New Customer Created");
				}else{
					JOptionPane.showMessageDialog(null, "There has been an error. Please restart the program to continue");
				}
			}
		});
		panel_1.add(btnCreateCustomer);
	}

}
