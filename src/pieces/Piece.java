package pieces;
import java.util.ArrayList;

import Game.Alliance;
import Game.Board;
import Game.Pair;

public abstract class Piece {
	
	protected int col;
	protected int row;
	protected Alliance c;
	ArrayList<Pair> moves = new ArrayList<Pair>();
	public Piece(Alliance c, int row, int col)
	{
		this.c  = c;
		this.col = col;
		this.row = row;
	}
	public abstract void calcMoves(Board b);
	public ArrayList<Pair> getMoves()
	{
		return moves;
	}
	public Alliance getColor()
	{
		return c;
	}
}
