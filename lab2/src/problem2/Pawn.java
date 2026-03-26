package problem2;

public class Pawn extends Piece{
	
	public Pawn(Position a){
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b){
        if(b.col == a.col && b.row == a.row + 1){
            return true;
        }

        return false;
    }

}
