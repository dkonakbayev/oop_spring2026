package problem2;

public class TestChess {

	public static void main(String[] args) {
		
		Position p1 = new Position(4 , 7);
		
		Bishop b1 = new Bishop(p1);
		
		Rook r1 = new Rook(p1);
		
		Position p2 = new Position(4 , 7);
		
		System.out.println(b1.isLegalMove(p2));
		
		System.out.println(r1.isLegalMove(p2));
		
	}

}
