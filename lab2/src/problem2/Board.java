package problem2;

public class Board {

    Piece[][] board = new Piece[8][8];

    public void placePiece(Piece p, Position pos){
        board[pos.row][pos.col] = p;
    }

    public void movePiece(Position from, Position to){

        Piece p = board[from.row][from.col];

        if(p == null){
            System.out.println("No piece here");
            return;
        }

        if(p.isLegalMove(to)){

            board[to.row][to.col] = p;
            board[from.row][from.col] = null;

            p.a = to;

            System.out.println("Move done");

        }else{
            System.out.println("Illegal move");
        }

    }
}