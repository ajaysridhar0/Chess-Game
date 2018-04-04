package pieces;
import Game.Alliance;
import Game.Board;
import Game.Pair;

public class Pawn extends Piece
{
	public Pawn(Alliance c, int xPos, int yPos) {
		super(c, xPos, yPos);
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
		int direction;
		if (this.c == Alliance.BLACK)
		{
			direction = 1;
		}else {
			direction = -1;
		}
		
		if(yPos+direction <= 7 && yPos+direction >= 0)
		{
			if(b.getTile(yPos+direction, xPos).isOpen())//check tile directly in front of pawn
			{
				moves.add(new Pair(xPos, yPos+direction));
			}
			if(xPos+1 <= 7 && !b.getTile(yPos+direction, xPos+1).isOpen() && 
					(b.getTile(yPos+direction, xPos+1).getPiece().getColor() != this.c))//check tile to the right of the pawn relative to the board
			{
				moves.add(new Pair(xPos+1, yPos+direction));
			}
			if(xPos-1 >= 0 && !b.getTile(yPos+direction, xPos-1).isOpen() && 
					(b.getTile(yPos+direction, xPos-1).getPiece().getColor() != this.c))//check tile to the left of the pawn relative to the board 
			{
				moves.add(new Pair(xPos-1, yPos+direction));
			}
			if ((yPos == 1 && this.c == Alliance.BLACK) || (yPos == 6 && this.c == Alliance.WHITE) && 
					b.getTile(yPos+direction, xPos).isOpen() && b.getTile(yPos+2*direction, xPos).isOpen())
			{
				moves.add(new Pair(xPos, yPos+2*direction));
			}
		}
		
	}
}
