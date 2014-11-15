package chess.location.board.cells.colour;

import java.util.ArrayList;
import java.util.Collection;

import chess.exceptions.CellNotFoundException;

/**
 * Colour - Utility to determine the colour of a cell on a chess board
 * @author CreativeMario
 */
public class Colour {

	private Collection<String> even = new ArrayList<String>();
	private Collection<String> odd = new ArrayList<String>();

	public Colour() {
		//Initialise the fields based on array
		setupEven();
		setupOdd();
	}

	private void setupOdd() {
		odd.add("1");
		odd.add("3");
		odd.add("5");
		odd.add("7");
	}

	private void setupEven() {
		even.add("0");
		even.add("2");
		even.add("4");
		even.add("6");
		even.add("8");
	}

	/**
	 * Used to determine the colour of a cell on a chess board
	 * @param x - the position on the 'x' axis
	 * @param y - the position on the 'y' axis
	 * @return String (Colour) The colour (black or white) of the cell based on the co-ordinates
	 */
	public String whatIsMyColor(int x, int y) {
		/*
		 * if x = even and y = odd colour is white
		 * 
		 * if x = odd and y = even colour is black
		 *
		 *
		 */
		
		if(even.contains(Integer.toString(x))){
			if(odd.contains(Integer.toString(y))){
				return "white";
			}
		}
		
		if(odd.contains(Integer.toString(x))){
			if(even.contains(Integer.toString(y))){
				return "black";
			}
		}
		
		throw new CellNotFoundException("Cell should not exist on an 8*8 board");
	}

}
