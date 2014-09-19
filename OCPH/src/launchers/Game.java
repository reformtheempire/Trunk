package launchers;

public class Game {
public boolean gameOver;

public Game(boolean gameOver) {
	this.gameOver = gameOver;
}

public boolean isGameOver() {
	return gameOver;
}

public void setGameOver(boolean gameOver) {
	this.gameOver = gameOver;
}

}
