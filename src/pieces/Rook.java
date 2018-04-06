package pieces;
import Game.Alliance;
import Game.Board;

public class Rook extends Piece
{
	public Rook(Alliance c, int row, int col) {
		super(c, row, col);
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

	@Override
	public void calcMoves(Board b) {
		// TODO Auto-generated method stub
		
	}
}