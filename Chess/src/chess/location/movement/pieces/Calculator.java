/**
 * 
 */
package chess.location.movement.pieces;

import java.util.Collection;

import chess.location.movement.Position;
import chess.pieces.impl.PlayingPieceImpl;

/**
 * Used to determine the moves for the pieces specified in the ENUM
 * @author Ziomxz
 *
 */
public interface Calculator {
	public Collection<Position> getMoves(PlayingPieceImpl piece);
		
}
