package chess.location.movement.pieces.impl;

import java.util.Collection;

import chess.location.movement.Position;
import chess.location.movement.pieces.Calculator;
import chess.location.movement.pieces.PiecesEnum;
import chess.pieces.impl.PlayingPieceImpl;

public class CalculatorImpl implements Calculator {

	@Override
	public Collection<String> getMoves(PlayingPieceImpl piece) {
		Position p = piece.getPosition();
		PlayingPieceImpl pieces = new PlayingPieceImpl(new Position(4, 1), PiecesEnum.PAWN);
	}

}
