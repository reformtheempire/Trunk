package chess.pieces.impl;

import java.util.ArrayList;
import java.util.Collection;

import chess.location.movement.Position;

public class Pawn extends PlayingPieceImpl {
	
	public Pawn(Position p) {
		super(p);
		setMoves();
	}
	
	private Collection<String> moves = new ArrayList<String>();
	
	private void setMoves(){
		if(!super.getHasMoved()){
			moves.add("u2");
		}else{
			moves.add("u1");
		}
	}
	
}
