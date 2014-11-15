package chess.location.movement.pieces.impl;

import java.util.ArrayList;
import java.util.Collection;

import chess.location.movement.Position;
import chess.location.movement.pieces.Calculator;
import chess.pieces.impl.PlayingPieceImpl;

public class CalculatorImpl implements Calculator {

	@Override
	public Collection<Position> getMoves(PlayingPieceImpl piece) {
		Position p = piece.getPosition();
		Collection<Position> moves = new ArrayList<Position>();
		switch(piece.type) {
		case BISHOP:
			moves.add(new Position(p.getX() + 1, p.getY() + 1));
			moves.add(new Position(p.getX() + 2, p.getY() + 2));
			moves.add(new Position(p.getX() + 3, p.getY() + 3));
			moves.add(new Position(p.getX() + 4, p.getY() + 4));
			moves.add(new Position(p.getX() + 5, p.getY() + 5));
			moves.add(new Position(p.getX() + 6, p.getY() + 6));
			moves.add(new Position(p.getX() + 7, p.getY() + 7));
			
			moves.add(new Position(p.getX() - 1, p.getY() - 1));
			moves.add(new Position(p.getX() - 2, p.getY() - 2));
			moves.add(new Position(p.getX() - 3, p.getY() - 3));
			moves.add(new Position(p.getX() - 4, p.getY() - 4));
			moves.add(new Position(p.getX() - 5, p.getY() - 5));
			moves.add(new Position(p.getX() - 6, p.getY() - 6));
			moves.add(new Position(p.getX() - 7, p.getY() - 7));
			
			moves.add(new Position(p.getX() - 1, p.getY() + 1));
			moves.add(new Position(p.getX() - 2, p.getY() + 2));
			moves.add(new Position(p.getX() - 3, p.getY() + 3));
			moves.add(new Position(p.getX() - 4, p.getY() + 4));
			moves.add(new Position(p.getX() - 5, p.getY() + 5));
			moves.add(new Position(p.getX() - 6, p.getY() + 6));
			moves.add(new Position(p.getX() - 7, p.getY() + 7));
			
			moves.add(new Position(p.getX() + 1, p.getY() - 1));
			moves.add(new Position(p.getX() + 2, p.getY() - 2));
			moves.add(new Position(p.getX() + 3, p.getY() - 3));
			moves.add(new Position(p.getX() + 4, p.getY() - 4));
			moves.add(new Position(p.getX() + 5, p.getY() - 5));
			moves.add(new Position(p.getX() + 6, p.getY() - 6));
			moves.add(new Position(p.getX() + 7, p.getY() - 7));
			break;
		case KING:
			moves.add(new Position(p.getX(), p.getY() + 1));
			moves.add(new Position(p.getX(), p.getY() - 1));
			
			moves.add(new Position(p.getX() + 1, p.getY()));
			moves.add(new Position(p.getX() - 1, p.getY()));
			
			moves.add(new Position(p.getX() + 1, p.getY() + 1));
			moves.add(new Position(p.getX() - 1, p.getY() - 1));
			
			moves.add(new Position(p.getX() - 1, p.getY() + 1));
			moves.add(new Position(p.getX() + 1, p.getY() - 1));
			break;
		case KNIGHT:
			moves.add(new Position(p.getX() + 2, p.getY() - 1));
			moves.add(new Position(p.getX() + 2, p.getY() + 1));
			
			moves.add(new Position(p.getX() + 1, p.getY() - 2));
			moves.add(new Position(p.getX() + 1, p.getY() + 2));
			
			moves.add(new Position(p.getX() - 2, p.getY() - 1));
			moves.add(new Position(p.getX() - 2, p.getY() + 1));
			
			moves.add(new Position(p.getX() - 1, p.getY() - 2));
			moves.add(new Position(p.getX() - 1, p.getY() + 2));
			
			break;
		case PAWN:
			moves.add(new Position(p.getX(), p.getY() + 1));
			if(!piece.hasMoved()){
				moves.add(new Position(p.getX(), p.getY() + 2));
			}
			break;
		case QUEEN:
			moves.add(new Position(p.getX() + 1, p.getY() + 1));
			moves.add(new Position(p.getX() + 2, p.getY() + 2));
			moves.add(new Position(p.getX() + 3, p.getY() + 3));
			moves.add(new Position(p.getX() + 4, p.getY() + 4));
			moves.add(new Position(p.getX() + 5, p.getY() + 5));
			moves.add(new Position(p.getX() + 6, p.getY() + 6));
			moves.add(new Position(p.getX() + 7, p.getY() + 7));
			
			moves.add(new Position(p.getX() - 1, p.getY() - 1));
			moves.add(new Position(p.getX() - 2, p.getY() - 2));
			moves.add(new Position(p.getX() - 3, p.getY() - 3));
			moves.add(new Position(p.getX() - 4, p.getY() - 4));
			moves.add(new Position(p.getX() - 5, p.getY() - 5));
			moves.add(new Position(p.getX() - 6, p.getY() - 6));
			moves.add(new Position(p.getX() - 7, p.getY() - 7));
			
			moves.add(new Position(p.getX() - 1, p.getY() + 1));
			moves.add(new Position(p.getX() - 2, p.getY() + 2));
			moves.add(new Position(p.getX() - 3, p.getY() + 3));
			moves.add(new Position(p.getX() - 4, p.getY() + 4));
			moves.add(new Position(p.getX() - 5, p.getY() + 5));
			moves.add(new Position(p.getX() - 6, p.getY() + 6));
			moves.add(new Position(p.getX() - 7, p.getY() + 7));
			
			moves.add(new Position(p.getX() + 1, p.getY() - 1));
			moves.add(new Position(p.getX() + 2, p.getY() - 2));
			moves.add(new Position(p.getX() + 3, p.getY() - 3));
			moves.add(new Position(p.getX() + 4, p.getY() - 4));
			moves.add(new Position(p.getX() + 5, p.getY() - 5));
			moves.add(new Position(p.getX() + 6, p.getY() - 6));
			moves.add(new Position(p.getX() + 7, p.getY() - 7));
			
			moves.add(new Position(p.getX(), p.getY() + 1));
			moves.add(new Position(p.getX(), p.getY() + 2));
			moves.add(new Position(p.getX(), p.getY() + 3));
			moves.add(new Position(p.getX(), p.getY() + 4));
			moves.add(new Position(p.getX(), p.getY() + 5));
			moves.add(new Position(p.getX(), p.getY() + 6));
			moves.add(new Position(p.getX(), p.getY() + 7));
			
			moves.add(new Position(p.getX(), p.getY() - 1));
			moves.add(new Position(p.getX(), p.getY() - 2));
			moves.add(new Position(p.getX(), p.getY() - 3));
			moves.add(new Position(p.getX(), p.getY() - 4));
			moves.add(new Position(p.getX(), p.getY() - 5));
			moves.add(new Position(p.getX(), p.getY() - 6));
			moves.add(new Position(p.getX(), p.getY() - 7));
			
			moves.add(new Position(p.getX() + 1, p.getY()));
			moves.add(new Position(p.getX() + 2, p.getY()));
			moves.add(new Position(p.getX() + 3, p.getY()));
			moves.add(new Position(p.getX() + 4, p.getY()));
			moves.add(new Position(p.getX() + 5, p.getY()));
			moves.add(new Position(p.getX() + 6, p.getY()));
			moves.add(new Position(p.getX() + 7, p.getY()));
			
			moves.add(new Position(p.getX() - 1, p.getY()));
			moves.add(new Position(p.getX() - 2, p.getY()));
			moves.add(new Position(p.getX() - 3, p.getY()));
			moves.add(new Position(p.getX() - 4, p.getY()));
			moves.add(new Position(p.getX() - 5, p.getY()));
			moves.add(new Position(p.getX() - 6, p.getY()));
			moves.add(new Position(p.getX() - 7, p.getY()));
			break;
		case ROOK:
			moves.add(new Position(p.getX(), p.getY() + 1));
			moves.add(new Position(p.getX(), p.getY() + 2));
			moves.add(new Position(p.getX(), p.getY() + 3));
			moves.add(new Position(p.getX(), p.getY() + 4));
			moves.add(new Position(p.getX(), p.getY() + 5));
			moves.add(new Position(p.getX(), p.getY() + 6));
			moves.add(new Position(p.getX(), p.getY() + 7));
			
			moves.add(new Position(p.getX(), p.getY() - 1));
			moves.add(new Position(p.getX(), p.getY() - 2));
			moves.add(new Position(p.getX(), p.getY() - 3));
			moves.add(new Position(p.getX(), p.getY() - 4));
			moves.add(new Position(p.getX(), p.getY() - 5));
			moves.add(new Position(p.getX(), p.getY() - 6));
			moves.add(new Position(p.getX(), p.getY() - 7));
			
			moves.add(new Position(p.getX() + 1, p.getY()));
			moves.add(new Position(p.getX() + 2, p.getY()));
			moves.add(new Position(p.getX() + 3, p.getY()));
			moves.add(new Position(p.getX() + 4, p.getY()));
			moves.add(new Position(p.getX() + 5, p.getY()));
			moves.add(new Position(p.getX() + 6, p.getY()));
			moves.add(new Position(p.getX() + 7, p.getY()));
			
			moves.add(new Position(p.getX() - 1, p.getY()));
			moves.add(new Position(p.getX() - 2, p.getY()));
			moves.add(new Position(p.getX() - 3, p.getY()));
			moves.add(new Position(p.getX() - 4, p.getY()));
			moves.add(new Position(p.getX() - 5, p.getY()));
			moves.add(new Position(p.getX() - 6, p.getY()));
			moves.add(new Position(p.getX() - 7, p.getY()));
			break;
		default:
			break;
		
		}
		return moves;
	}

}
