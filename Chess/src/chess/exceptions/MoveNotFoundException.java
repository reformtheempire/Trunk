package chess.exceptions;

public class MoveNotFoundException extends RuntimeException{

	/**
	 * Used when a move does not exist for a piece
	 */
	private static final long serialVersionUID = 265331222426314479L;

	public MoveNotFoundException(String message) {
		super(message);
	}
	
	public MoveNotFoundException() {
		super();
	}
}
