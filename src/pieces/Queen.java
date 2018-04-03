package pieces;
import Game.Alliance;

public class Queen extends Piece
{
	public Queen(Alliance c, int xPos, int yPos) {
		super(c, xPos, yPos);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		if (this.c == Alliance.BLACK) {
			return "Q";
		} else {
			return "q";
		}
	}
}