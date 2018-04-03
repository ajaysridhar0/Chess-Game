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
		
		if(b.getTile(yPos+direction, xPos).isOpen())
		{
			
		}
		if(!b.getTile(yPos+direction, xPos+1).isOpen())
		{
			
		}
		if(!b.getTile(yPos+direction, xPos-1).isOpen()) {
			
		}
		 if (yPos == )
		{
			
		}
	}
}
