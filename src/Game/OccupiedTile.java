package Game;

import pieces.Piece;

public class OccupiedTile extends Tile {
	private Piece p;
	
	public OccupiedTile(Piece p)
	{
		this.p = p;
	}
	
	public Piece getPiece() {
		// TODO Auto-generated method stub
		return this.p;
	}

	public boolean isOpen() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String toString()
	{
		return p.toString();
	}
}
