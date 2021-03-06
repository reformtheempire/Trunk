package chess.pieces.impl;

import chess.location.movement.Position;
import chess.location.movement.pieces.PiecesEnum;

public class Pawn extends PlayingPieceImpl {
	
	public Pawn(Position p, PiecesEnum type) {
		super(p, type);
		setMoves();
	}
	
	
	private void setMoves(){
		if(super.hasMoved()){
			super.setupMovements(true, false, false, false, false, false, false, false, 1, 0, 0, 0, 0, 0, 0, 0);
		}else{
			super.setupMovements(true, false, false, false, false, false, false, false, 2, 0, 0, 0, 0, 0, 0, 0);
		}
	}
	
}
