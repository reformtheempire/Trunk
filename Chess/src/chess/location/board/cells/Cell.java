package chess.location.board.cells;

import chess.exceptions.CellNotFoundException;
import chess.exceptions.ChessRuntimeException;
import chess.location.board.cells.colour.Colour;
import chess.pieces.PlayingPiece;

/**
 * Holds information relating to a cell on a chess board:
 * 
 * Cell position (int x, int y)
 * 
 * Cell colour (held in a String)
 * 
 * The Piece (if any) held on the cell (i.e. a King could be on a black cell at position (2,1))
 * otherwise holds a null piece.
 * 
 * @author CreativeMario
 *
 */
public class Cell {

	private int x;
	private int y;
	
	private String colour;
	//TODO Make colour return as an instance of java.awt.Color - Update javadoc
	private PlayingPiece piece;
	
	
	public Cell(int x, int y) {
		Colour colour = new Colour();
		this.x = x;
		this.y = y;
		
		try{
			this.colour = colour.whatIsMyColor(x, y);			
		}catch(CellNotFoundException e){
			System.err.println(e.getMessage());
			throw new ChessRuntimeException("Cell not found - See CELL.Java (location.board.cells.Cell)");
		}

	}

	public PlayingPiece getPiece() {
		return piece;
	}


	public void setPiece(PlayingPiece piece) {
		this.piece = piece;
	}


	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public String getColor() {
		return colour;
	}
	
	public boolean hasPiece(){
		if(piece != null){
			return true;
		}else{
			return false;
		}
	}
}
