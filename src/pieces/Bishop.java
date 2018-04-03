package pieces;
import Game.Alliance;

public class Bishop extends Piece
{
	public Bishop(Alliance c, int xPos, int yPos) {
		super(c, xPos, yPos);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		if (this.c == Alliance.BLACK) {
			return "B";
		} else {
			return "b";
		}
	}
}