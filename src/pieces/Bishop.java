package pieces;
import Game.Alliance;
import Game.Board;
import Game.Pair;

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
		int xdir;
		int ydir;
		for(double i = Math.PI/4; i < 2* Math.PI; i += Math.PI/2)
		{
			if(Math.cos(i)>0.0001)
			{
				xdir = 1;
			}
			else if(Math.cos(i)<-0.0001)
			{
				xdir = -1;
			}
			else
			{
				xdir = 0;
			}
			
			if(Math.sin(i)>0.0001)
			{
				ydir = 1;
			}
			else if(Math.sin(i)<-0.0001)
			{
				ydir = -1;
			}
			else
			{
				ydir = 0;
			}
			for(int current_row = row+ydir, current_col = col+xdir; (current_row < 8 && current_row >= 0) && (current_col < 8 && current_col >= 0); 
					current_row+=ydir, current_col+=xdir)
			{ 
				if(b.isOpen(current_row, current_col))
				{
					moves.add(new Pair(current_row, current_col));
				}
				else {
					if( b.getTile(current_row, current_col).getPiece().getColor() != this.c)
					{
						moves.add(new Pair(current_row, current_col));
					}
					break;
				}
			}
		}
		
	}
}