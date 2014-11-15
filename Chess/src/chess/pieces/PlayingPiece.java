package chess.pieces;

import java.util.Collection;

import chess.location.movement.Position;

/**
 * A playing piece (designed for a Chess game) 
 * has two methods: move, can be taken - Designed for the implementation
 * to be extended to add functionality
 * 
 * @author CreativeMario
 *
 */

public interface PlayingPiece {

	/**
	 * Used to move a piece from one cell to another (and possibly take piece)
	 * 
	 * @param Position one (the starting point of the piece to be moved)
	 * @param Position two (the ending point of the piece to be moved - must be in the 'moves' collection)
	 */
	public void move(Position one, Position two);
	
	/**
	 * Used to determine if a piece can be taken (not intended for use in the human interface - except in the 'checkmate' class)
	 * 
	 * @return Boolean (true or false)
	 */
	public boolean canBeTaken();
	
	/**
	 * Get the places the piece can move to
	 * @param Collection<String> allowedMoves
	 * @return Collection<Postition> placesPieceCanMove
	 */
	public Collection<Position> getMoves(Collection<String> allowedMoves);
	
	public boolean getHasMoved();
}
