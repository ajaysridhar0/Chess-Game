package pieces;
import Game.Alliance;
import Game.Board;

public class Queen extends Piece
{
	public Queen(Alliance c, int row, int col) {
		super(c, row, col);
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