package Game;
import pieces.Piece;

public abstract class Tile {
	public abstract Piece getPiece();
	public abstract boolean isOpen();
}
