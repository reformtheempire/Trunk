package chess.pieces.impl;

import java.util.Collection;

import chess.location.movement.Position;
import chess.pieces.PlayingPiece;

/**
 * Implementation of PlayingPiece - designed to be extended as a more advanced piece (e.g. Class King extends PlayingPiece)
 * @author CreativeMario
 *
 */

public class PlayingPieceImpl implements PlayingPiece{

	private boolean hasMoved;
	
	public PlayingPieceImpl(Position p) {
		this.hasMoved = false;
	}
	
	
	/**
	 * Used to move a piece from one cell to another (and possibly take piece)
	 * 
	 * @param Position one (the starting point of the piece to be moved)
	 * @param Position two (the ending point of the piece to be moved - must be in the 'moves' collection)
	 */
	public void move(Position one, Position two) {
		// TODO write move method
		
	}

	/**
	 * Used to determine if a piece can be taken (not intended for use in the human interface - except in the 'checkmate' class)
	 * 
	 * @return Boolean (true or false)
	 */
	public boolean canBeTaken() {
		// TODO write canBeTaken method
		return false;
	}
	
	/**
	 * Used to determine where the piece can move
	 * @return
	 */
	public Collection<Position> getMoves(Collection<String> allowedMoves){
		//TODO write getMoves method
		return null;
	}


	@Override
	public boolean getHasMoved() {
		return hasMoved;
	}
}
