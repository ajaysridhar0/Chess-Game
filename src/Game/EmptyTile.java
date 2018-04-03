package Game;

import pieces.Piece;

public class EmptyTile extends Tile {

	public Piece getPiece() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isOpen() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public String toString()
	{
		return "_";
	}
}
