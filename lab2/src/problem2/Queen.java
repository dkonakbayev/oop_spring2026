package problem2;

public class Queen extends Piece{
	
	public Queen(Position a) {
		super(a);
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		 if(a.row == b.row || a.col == b.col){
	            return true;
	        }

	     if(Math.abs(a.row - b.row) == Math.abs(a.col - b.col)){
	            return true;
	        }
	     
	     return false;
	}
}
