package chess.location.board;

import chess.location.board.cells.Cell;

/**
 * A chess board (8*8) - made up of a 2D array of type Cell (see Cell.java)
 * 
 * @author CreativeMario
 *
 */
public class Board {

	public static Cell[][] board;
	
	//Constructor
	public Board() {
		//TODO make the board generate from an enum (allows variable sizes of board)
		for(int y = 0; y < 7; y++){
			for(int x = 0; x < 7; x++){
				board[x][y] = new Cell(x, y);				
			}
		}
	}
}
