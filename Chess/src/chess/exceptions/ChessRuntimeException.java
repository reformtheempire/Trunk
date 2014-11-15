package chess.exceptions;

public class ChessRuntimeException extends RuntimeException{

	/**
	 * Used when a runtime error occurs - use only if it will affect gameplay to the extent that the game has to close or re-start
	 */
	private static final long serialVersionUID = 5725777772880221282L;

	public ChessRuntimeException(String message) {
		super(message);
	}
	
	public ChessRuntimeException() {
		super();
	}
	
}
