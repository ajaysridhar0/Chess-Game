package pieces;
import Game.Alliance;
import Game.Board;

public class King extends Piece
{
	public King(Alliance c, int row, int col) {
		super(c, row, col);
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

	@Override
	public void calcMoves(Board b) {
		// TODO Auto-generated method stub
		
	}
}