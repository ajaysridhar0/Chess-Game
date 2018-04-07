package pieces;
import Game.Alliance;
import Game.Board;
import Game.Pair;

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
		int xdir = 0;
		int ydir = 0;
		
		for(double i = 0; i < 2* Math.PI; i += Math.PI/2)
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
			
			
			//BUG : DOESN'T CALCULATE RIGHT MOVES
			int current_col = 0;
			if(xdir != 0)
			{
				current_col = col + 2*xdir;
				if (row - 1 >= 0 && current_col >=0 && current_col < 8) {
					if(b.isOpen(row - 1, current_col))
					{
						moves.add(new Pair(row - 1, current_col));
					}
					else if( b.getTile(row - 1, current_col).getPiece().getColor() != this.c)
					{
						moves.add(new Pair(row - 1, current_col));
					}
				}
				
				if (row + 1 < 8 && current_col >=0 && current_col < 8) {
					if(b.isOpen(row + 1, current_col))
					{
						moves.add(new Pair(row + 1, current_col));
					}
					else if( b.getTile(row - 1, current_col).getPiece().getColor() != this.c)
					{
						moves.add(new Pair(row + 1, current_col));
					}
				}
			}
			else
			{
				int current_row = row + 2*ydir;
				if (col - 1 >= 0 && current_row >=0 && current_row < 8) {
					if(b.isOpen(current_row, col - 1))
					{
						moves.add(new Pair(current_row, col - 1));
					}
					else if( b.getTile(current_row, col - 1).getPiece().getColor() != this.c)
					{
						moves.add(new Pair(current_row, col - 1));
					}
				}
				
				if (col + 1 < 8 && current_row >=0 && current_row < 8) {
					if(b.isOpen(current_row, col + 1))
					{
						moves.add(new Pair(current_row, col + 1));
					}
					else if( b.getTile(current_row, col + 1).getPiece().getColor() != this.c)
					{
						moves.add(new Pair(current_row, col + 1));
					}
				}
			}
		}
		
	}
}