package problem2;

public class Rook extends Piece{
	
	public Rook(Position a) {
		super(a);
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		if(a.row == b.row || a.col == b.col){
            return true;
        }
		
		return false;
	}
}
 