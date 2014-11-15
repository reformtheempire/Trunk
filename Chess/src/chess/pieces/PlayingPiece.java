package chess.pieces;

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

	public void move(Position one, Position two);
	
	public boolean canBeTaken(PlayingPiece piece);
	
	
}
