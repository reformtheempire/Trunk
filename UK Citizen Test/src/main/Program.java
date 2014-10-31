package main;

import javax.swing.JOptionPane;

import input_output.IO;

public class Program {

	public static void main(String[] args) {

		IO.msgOut("Welcome to the UKIP British Citizenship test.");

		IO.msgOut("Please answer all questions honestly. \n"
				+ "We know this may be hard if you are a \n"
				+ "Member of Parliament.");

		String name = IO.msgInString("Please Enter Your Name");

		int age = IO.msgInInt("How old are you?");

		int choice;

		choice = IO.msgInInt("Question 1: \n" + name + ", which is best? \n"
				+ "1: Shrimp \n" + "2: Sauerkraut \n" + "3: Fromaige Frais \n"
				+ "4: Fish N Chips \n" + "5: The Queen \n");

		if (choice != 5) {
			IO.msgOut("YOU HAVE FAILED.");
			System.exit(0);
		} else {
			IO.msgOut("Correct. Well Done.");
		}

		choice = IO.msgInInt(name + ", Describe the UKIP Flag? \n"
				+ "1: Black \n" + "2: Blue with Green and Orange Stripes \n"
				+ "3: Green \n"
				+ "4: An image of Nigel Farage's Face on a burning cross \n"
				+ "5: Yellow and Purple \n");

		if (choice != 4) {
			IO.msgOut("YOU HAVE FAILED.");
			System.exit(0);
		} else {
			IO.msgOut("CORRECT.");
		}

		choice = IO.msgInInt("Did you vote Yes in the Scottish Referendum? \n"
				+ "1: Yes \n" + "2: No \n" + "3: I'm Not Scottish \n"
				+ "4: I'm not British \n" + "5: What referendum? \n");

		if (choice != 2) {
			IO.msgOut("YOU HAVE FAILED.");
			System.exit(0);
		} else {
			IO.msgOut("Correct. \n" + name + ", You are doing well.");
		}

		String strChoice = IO.msgInString("Final Question: are you foreign?"
				+ "\n ENTER 'YES' OR 'NO' ");

		if (strChoice.equalsIgnoreCase("yes")) {
			IO.msgOut("YOU HAVE FAILED.");
		} else {
			IO.msgOut("You have passed. \n"
					+ name + ", Age:" + age 
					+ "\nWelcome to the United Kingdom of Independance Party");
		}

	}

}
