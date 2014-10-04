package input_output;

import javax.swing.JOptionPane;

public class IO {

	public static void msgOut(String message){
		JOptionPane.showMessageDialog(null, message);
	}
	
	public static String msgInString(String message){
		String input = JOptionPane.showInputDialog(message);
		return input;
	}
	
	public static int msgInInt(String message){
		int input = 1337;
		do{
		try{			
			input = Integer.parseInt(JOptionPane.showInputDialog(message));
		}catch(NullPointerException e){
			msgOut("Invalid entry, Please enter a whole number");
			input = 1337;
		}
		}while(input == 1337);
		return input;
	}
	
	
	public static double msgInDouble(String message){
		double input = 1337;
		do{
		try{			
			input = Double.parseDouble(JOptionPane.showInputDialog(message));
		}catch(NullPointerException e){
			msgOut("Invalid entry, Please enter a number with a decimal point");
			input = 1337;
		}
		}while(input == 1337);
		return input;
	}
	
}
