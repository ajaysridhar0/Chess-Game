package pieces;
import Game.Alliance;
import Game.Board;
import Game.Pair;

public class Pawn extends Piece
{
	public Pawn(Alliance c, int row, int col) {
		super(c, row, col);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		if (this.c == Alliance.BLACK) {
			return "P";
		} else {
			return "p";
		}
	}
	
	public void calcMoves(Board b)
	{
		//determine which direction the pawn is moving
		int direction;
		if (this.c == Alliance.BLACK)
		{
			direction = 1;
		}else {
			direction = -1;
		}
		
		if(row+direction <= 7 && row+direction >= 0)
		{
			//check tile directly in front of pawn
			if(b.getTile(row+direction, col).isOpen())
			{
				moves.add(new Pair(col, row+direction));
			}
			
			//check tile to the right of the pawn relative to the board
			if(col+1 <= 7 && !b.isOpen(row+direction, col+1) && 
					(b.getTile(row+direction, col+1).getPiece().getColor() != this.c))
			{
				moves.add(new Pair(col+1, row+direction));
			}
			
			//check tile to the left of the pawn relative to the board
			if(col-1 >= 0 && !b.isOpen(row+direction, col-1) && 
				(b.getTile(row+direction, col-1).getPiece().getColor() != this.c))  	
			{
				moves.add(new Pair(col-1, row+direction));
			}
			
			//check if pawn is in starting position and can move two spaces forward
			if ((row == 1 && this.c == Alliance.BLACK) || (row == 6 && this.c == Alliance.WHITE) && 
				b.isOpen(row+direction, col) && b.isOpen(row+2*direction, col))
			{
				moves.add(new Pair(col, row+2*direction));
			}
		}
		
	}
}
