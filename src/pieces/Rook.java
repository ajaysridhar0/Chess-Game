package pieces;
import Game.Alliance;

public class Rook extends Piece
{
	public Rook(Alliance c, int xPos, int yPos) {
		super(c, xPos, yPos);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		if (this.c == Alliance.BLACK) {
			return "R";
		} else {
			return "r";
		}
	}
}