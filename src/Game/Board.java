package Game;
import pieces.Bishop;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Piece;
import pieces.Queen;
import pieces.Rook;

public class Board {
	private Tile[][] chessBoard = new Tile[8][8];
	
	public Board() 
	{
		chessBoard[0][0] = new  OccupiedTile(new Rook(Alliance.BLACK, 0, 0));
		chessBoard[0][1] = new OccupiedTile(new Knight(Alliance.BLACK, 0, 1));
		chessBoard[0][2] = new OccupiedTile(new Bishop(Alliance.BLACK, 0, 2));
		chessBoard[0][3] = new OccupiedTile(new Queen(Alliance.BLACK, 0, 3));
		chessBoard[0][4] = new OccupiedTile(new King(Alliance.BLACK, 0, 4));
		chessBoard[0][5] = new OccupiedTile(new Bishop(Alliance.BLACK, 0, 5));
		chessBoard[0][6] = new OccupiedTile(new Knight(Alliance.BLACK, 0, 6));
		chessBoard[0][7] = new OccupiedTile(new Rook(Alliance.BLACK, 0, 7));
		
		chessBoard[7][0] = new OccupiedTile(new Rook(Alliance.WHITE, 7, 0));
		chessBoard[7][1] = new OccupiedTile(new Knight(Alliance.WHITE, 7, 1));
		chessBoard[7][2] = new OccupiedTile(new Bishop(Alliance.WHITE, 7, 2));
		chessBoard[7][3] = new OccupiedTile(new Queen(Alliance.WHITE, 7, 3));
		chessBoard[7][4] = new OccupiedTile(new King(Alliance.WHITE, 7, 4));
		chessBoard[7][5] = new OccupiedTile(new Bishop(Alliance.WHITE, 7, 5));
		chessBoard[7][6] = new OccupiedTile(new Knight(Alliance.WHITE, 7, 6));
		chessBoard[7][7] = new OccupiedTile(new Rook(Alliance.WHITE, 7, 7));
		
		for (int i = 0; i < chessBoard.length; i++)
		{
			chessBoard[1][i] = new OccupiedTile(new Pawn(Alliance.BLACK, 1, i)); 
			chessBoard[6][i] = new OccupiedTile(new Pawn(Alliance.WHITE, 6, i)); 
		}
		
		for(int i = 2; i < 6; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				chessBoard[i][j] = new EmptyTile();
			}
		}
		chessBoard[4][4] = new OccupiedTile(new Knight(Alliance.WHITE, 4, 4));
		
		//printBoard();
		
		chessBoard[4][4].getPiece().calcMoves(this);
		System.out.println(chessBoard[4][4].getPiece().getMoves());
	}
	
	public Tile getTile(int row, int col) {
		return chessBoard[row][col];
	}
	
	public boolean isOpen(int row, int col) {
		return chessBoard[row][col].isOpen();
	}
	
	public void updateMoves() {
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				if(!chessBoard[i][j].isOpen())
					chessBoard[i][j].getPiece().calcMoves(this);
			}
		}
	}
	
	public void printBoard()
	{
		int xaxis = 8;
		for(int row = 0; row < chessBoard.length; row++)
		{
			System.out.print(xaxis - row);
			for(int col = 0; col < chessBoard[0].length; col++) 
			{	
				System.out.print("|" + chessBoard[row][col]);
			}
			System.out.println("|");
		}
		System.out.print("  a b c d e f g h");
	}
}
