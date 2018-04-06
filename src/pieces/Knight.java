package pieces;
import Game.Alliance;
import Game.Board;

public class Knight extends Piece
{
	public Knight(Alliance c, int row, int col) {
		super(c, row, col);
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
	@Override
	public void calcMoves(Board b) {
		// TODO Auto-generated method stub
		
	}
}