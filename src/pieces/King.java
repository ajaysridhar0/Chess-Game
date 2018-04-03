package pieces;
import Game.Alliance;

public class King extends Piece
{
	public King(Alliance c, int xPos, int yPos) {
		super(c, xPos, yPos);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		if (this.c == Alliance.BLACK) {
			return "K";
		} else {
			return "k";
		}
	}
}