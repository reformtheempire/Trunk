package chess.exceptions;

public class CellNotFoundException extends RuntimeException{

	/**
	 * Used when a cell is not valid
	 */
	private static final long serialVersionUID = -1354941069364471808L;

	public CellNotFoundException() {
		super();
	}
	
	public CellNotFoundException(String message){
		super(message);
	}
	
}
