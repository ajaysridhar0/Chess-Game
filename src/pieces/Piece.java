package pieces;
import java.util.ArrayList;

import Game.Alliance;
import Game.Board;
import Game.Pair;

public abstract class Piece {
	
	protected int xPos;
	protected int yPos;
	protected Alliance c;
	ArrayList<Pair> moves = new ArrayList<Pair>();
	public Piece(Alliance c, int xPos, int yPos)
	{
		this.c  = c;
		this.xPos = xPos;
		this.yPos = yPos;
	}
	public abstract void calcMoves(Board b);
	public Alliance getColor()
	{
		return c;
	}
}
