package Game;

public class Pair { 
	  public final int col; 
	  public final int row; 
	  public Pair(int row, int col) {
		if (col > 7 || col < 0 || row > 7 || row < 0) {
			System.out.println("ERROR: Pair out bounds!");
		}
	    this.col = col; 
	    this.row = row; 
	  } 
	  public String toString()
	  {

		  char letter = 'X';
		  switch(col)
		  {
		  case 0:
			letter = 'a';
			break;
		  case 1:
			letter = 'b';
			break;
		  case 2:
			letter = 'c';
			break;
		  case 3:
			letter = 'd';
			break;
		  case 4:
			letter = 'e';
			break;
		  case 5:
			letter = 'f';
			break;
		  case 6:
			letter = 'g';
			break;
		  case 7:
			letter = 'h';
			break;
		  }
		  return "" + letter + (8-row);
	  }
} 