package chess.location.movement;


public class Movements {

	private boolean n;
	private boolean ne;
	private boolean nw;
	private boolean s;
	private boolean se;
	private boolean sw;
	private boolean e;
	private boolean w;	
	private int movesN;
	private int movesNE;
	private int movesNW;
	private int movesS;
	private int movesSE;
	private int movesSW;
	private int movesE;
	private int movesW;
	
	
	public Movements(boolean n, boolean ne, boolean nw, boolean s, boolean se,
			boolean sw, boolean e, boolean w, int movesN, int movesNE,
			int movesNW, int movesS, int movesSE, int movesSW, int movesE,
			int movesW) {
		this.n = n;
		this.ne = ne;
		this.nw = nw;
		this.s = s;
		this.se = se;
		this.sw = sw;
		this.e = e;
		this.w = w;
		this.movesN = movesN;
		this.movesNE = movesNE;
		this.movesNW = movesNW;
		this.movesS = movesS;
		this.movesSE = movesSE;
		this.movesSW = movesSW;
		this.movesE = movesE;
		this.movesW = movesW;
	}


	public boolean isN() {
		return n;
	}


	public boolean isNe() {
		return ne;
	}


	public boolean isNw() {
		return nw;
	}


	public boolean isS() {
		return s;
	}


	public boolean isSe() {
		return se;
	}


	public boolean isSw() {
		return sw;
	}


	public boolean isE() {
		return e;
	}


	public boolean isW() {
		return w;
	}


	public int getMovesN() {
		return movesN;
	}


	public int getMovesNE() {
		return movesNE;
	}


	public int getMovesNW() {
		return movesNW;
	}


	public int getMovesS() {
		return movesS;
	}


	public int getMovesSE() {
		return movesSE;
	}


	public int getMovesSW() {
		return movesSW;
	}


	public int getMovesE() {
		return movesE;
	}


	public int getMovesW() {
		return movesW;
	}
	
	
	
}