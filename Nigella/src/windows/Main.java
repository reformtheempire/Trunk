package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextPane txtpnTextoutputpane = new JTextPane();
		txtpnTextoutputpane.setText("TextOutputPane");
		contentPane.add(txtpnTextoutputpane, BorderLayout.WEST);
		
		JTextArea txtrInputtextbox = new JTextArea();
		txtrInputtextbox.setText("InputTextBox");
		contentPane.add(txtrInputtextbox, BorderLayout.SOUTH);
		
		JButton btnSendmessage = new JButton("SendMessage");
		contentPane.add(btnSendmessage, BorderLayout.EAST);
	}

}
