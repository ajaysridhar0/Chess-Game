package pieces;
import Game.Alliance;
import Game.Board;
import Game.Pair;

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
		int xdir;
		int ydir;
		for(double i = 0; i < 2* Math.PI; i += Math.PI/4)
		{
			if(Math.cos(i)>0)
			{
				xdir = 1;
			}
			else if(Math.cos(i)<0)
			{
				xdir = -1;
			}
			else
			{
				xdir = 0;
			}
			
			if(Math.sin(i)>0)
			{
				ydir = 1;
			}
			else if(Math.sin(i)<0)
			{
				ydir = -1;
			}
			else
			{
				ydir = 0;
			}
			
			if(col+xdir < 8 && col+xdir >= 0 && row+ydir < 8 && row+ydir >= 0 && (b.isOpen(row+ydir, col+xdir) || b.getTile(row+ydir, col+xdir).getPiece().getColor() != this.c))
			{
				// TODO: ADD CHECK TO SEE IF TILE IS IN CHECK 
				moves.add(new Pair(row+ydir, col+xdir));
			}
		}
	}
}