package pieces;
import Game.Alliance;
import Game.Board;

public class Bishop extends Piece
{
	public Bishop(Alliance c, int row, int col) {
		super(c, row, col);
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
	@Override
	public void calcMoves(Board b) {
		// TODO Auto-generated method stub
		
	}
}