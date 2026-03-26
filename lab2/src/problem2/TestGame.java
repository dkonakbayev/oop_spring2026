package problem2;

public class TestGame {

    public static void main(String[] args) {

        Board board = new Board();

        Rook rook = new Rook(new Position(0,0));

        board.placePiece(rook, new Position(0,0));

        board.movePiece(
                new Position(0,0),
                new Position(2,5)
        );

    }
}
