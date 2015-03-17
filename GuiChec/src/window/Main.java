package window;

import ht.tm.dev.chec.command.CommandCentre;
import ht.tm.dev.chec.whois.WhoisData;
import ht.tm.dev.chec.whois.telstar.methods.TelstarWHOISInterface;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;

public class Main {

	private JFrame checFrame;
	private JTextField domainNameResult;
	private JTextField whoisserverResultField;
	private JTextField txtDomain;
	private JTextField specificWhoisServer;
	private String whoisServer;
	private String whoisResponse;
	private JTextArea txtrWhoisresultfield;
	private JPanel resultsPanel;
	private JLabel lblChecItOut;
	private JLabel lblChecit;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.alee.laf.WebLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.checFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		checFrame = new JFrame();
		checFrame.setTitle("CHEC - GUI: chec.it");
		checFrame.setBounds(100, 100, 450, 300);
		checFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		checFrame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel searchPanel = new JPanel();
		tabbedPane.addTab("Search", null, searchPanel, null);
		searchPanel.setLayout(null);
		
		JButton btnChec = new JButton("CHEC");
		btnChec.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				doWhois();
			}

			private void doWhois() {
				String[] args = new String[1];
				args[0] = txtDomain.getText();
				if(args == null || args.length == 0){
					System.err.println("No Domain Specified");
					System.exit(1);
				}
				
				
//				ServerManager serverManager = new ServerManager();
//				serverManager.setupProperties();
//				serverManager.getServerDetails("UK");
				
				
				
			
				
				CommandCentre.getWhoisData(args);
				Collection<String> parameters;
				if(CommandCentre.hasParams()){
					parameters = CommandCentre.getParams();
					CommandCentre.examineParameters(parameters);
				}
				
				WhoisData whoisData = CommandCentre.getData();
				
				TelstarWHOISInterface interface1 = new TelstarWHOISInterface(whoisData);
				interface1.setupConnector();
				interface1.attachCommunicator();
				interface1.getWhoisResponse();
				whoisData = interface1.getWhoisData();
				whoisResponse = whoisData.getResponse().getResponse();
				if(specificWhoisServer.getText().equalsIgnoreCase("") || specificWhoisServer == null){
					whoisServer = whoisData.getServer().getAddress();
				}
				whoisserverResultField.setText(whoisServer);
				txtrWhoisresultfield.setText(whoisResponse);
				domainNameResult.setText(txtDomain.getText());
				tabbedPane.setSelectedComponent(resultsPanel);
			}
		});
		btnChec.setBounds(171, 140, 85, 25);
		searchPanel.add(btnChec);
		
		txtDomain = new JTextField();
		txtDomain.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode() == 10){
					doWhois();
					
				}
			}

			private void doWhois() {
				String[] args = new String[1];
				args[0] = txtDomain.getText();
				if(args == null || args.length == 0){
					System.err.println("No Domain Specified");
					System.exit(1);
				}
				
				
//				ServerManager serverManager = new ServerManager();
//				serverManager.setupProperties();
//				serverManager.getServerDetails("UK");
				
				
				
			
				
				CommandCentre.getWhoisData(args);
				Collection<String> parameters;
				if(CommandCentre.hasParams()){
					parameters = CommandCentre.getParams();
					CommandCentre.examineParameters(parameters);
				}
				
				WhoisData whoisData = CommandCentre.getData();
				
				TelstarWHOISInterface interface1 = new TelstarWHOISInterface(whoisData);
				interface1.setupConnector();
				interface1.attachCommunicator();
				interface1.getWhoisResponse();
				whoisData = interface1.getWhoisData();
				whoisResponse = whoisData.getResponse().getResponse();
				if(specificWhoisServer.getText().equalsIgnoreCase("") || specificWhoisServer == null){
					whoisServer = whoisData.getServer().getAddress();
				}
				whoisserverResultField.setText(whoisServer);
				txtrWhoisresultfield.setText(whoisResponse);
				domainNameResult.setText(txtDomain.getText());
				tabbedPane.setSelectedComponent(resultsPanel);
				
			}
		});
		txtDomain.setToolTipText("Enter a domain to search for");
		txtDomain.setBounds(12, 90, 404, 25);
		searchPanel.add(txtDomain);
		txtDomain.setColumns(10);
		
		specificWhoisServer = new JTextField();
		specificWhoisServer.setToolTipText("OPTIONAL: Specify a WHOIS Server (e.g: whois.nic.example)");
		specificWhoisServer.setBounds(306, 198, 110, 25);
		searchPanel.add(specificWhoisServer);
		specificWhoisServer.setColumns(10);
		
		JLabel lblAdvancedSpecifyWhois = new JLabel("Advanced: Specify WHOIS Server:");
		lblAdvancedSpecifyWhois.setBounds(111, 203, 211, 15);
		searchPanel.add(lblAdvancedSpecifyWhois);
		
		lblChecit = new JLabel("chec.it");
		lblChecit.setFont(new Font("Lucida Sans", Font.PLAIN, 12));
		lblChecit.setToolTipText("visit chec.it for a Web Interface!");
		lblChecit.setBounds(306, 74, 53, 15);
		searchPanel.add(lblChecit);
		
		lblChecItOut = new JLabel("CHEC it out!");
		lblChecItOut.setFont(new Font("Segoe Script", Font.PLAIN, 45));
		lblChecItOut.setBounds(51, 12, 332, 79);
		searchPanel.add(lblChecItOut);
		
		resultsPanel = new JPanel();
		tabbedPane.addTab("Results", null, resultsPanel, null);
		resultsPanel.setLayout(null);
		
		domainNameResult = new JTextField();
		domainNameResult.setEditable(false);
		domainNameResult.setBounds(184, 12, 110, 25);
		resultsPanel.add(domainNameResult);
		domainNameResult.setColumns(10);
		
		whoisserverResultField = new JTextField();
		whoisserverResultField.setEditable(false);
		whoisserverResultField.setColumns(10);
		whoisserverResultField.setBounds(306, 12, 110, 25);
		resultsPanel.add(whoisserverResultField);
		
		JLabel lblWhoisResult = new JLabel("WHOIS Result");
		lblWhoisResult.setBounds(12, 17, 110, 15);
		resultsPanel.add(lblWhoisResult);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 44, 404, 179);
		resultsPanel.add(scrollPane);
		
		txtrWhoisresultfield = new JTextArea();
		txtrWhoisresultfield.setTabSize(4);
		txtrWhoisresultfield.setWrapStyleWord(true);
		txtrWhoisresultfield.setLineWrap(true);
		txtrWhoisresultfield.setEditable(false);
		scrollPane.setViewportView(txtrWhoisresultfield);
		txtrWhoisresultfield.setText("Perform a CHEC to populate this page");
		
	}
}
