package pieces;
import Game.Alliance;
import Game.Board;

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

	@Override
	public void calcMoves(Board b) {
		// TODO Auto-generated method stub
		
	}
}