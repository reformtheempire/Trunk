package chess.pieces.impl;

import chess.location.movement.Position;
import chess.pieces.PlayingPiece;

/**
 * Implementation of PlayingPiece - designed to be extended as a more advanced piece (e.g. Class King extends PlayingPiece)
 * @author CreativeMario
 *
 */

public class PlayingPieceImpl implements PlayingPiece{

	@Override
	public void move(Position one, Position two) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canBeTaken(PlayingPiece piece) {
		// TODO Auto-generated method stub
		return false;
	}

}
