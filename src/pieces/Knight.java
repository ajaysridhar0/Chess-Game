package pieces;
import Game.Alliance;

public class Knight extends Piece
{
	public Knight(Alliance c, int xPos, int yPos) {
		super(c, xPos, yPos);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		if (this.c == Alliance.BLACK) {
			return "N";
		} else {
			return "n";
		}
	}
}