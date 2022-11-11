
package day17;

public class ChessBoard {
    ChessPiece[][] chessBoard;

    public ChessBoard(ChessPiece[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

    public void print() {
        for (int i = 0; i < chessBoard.length; i++){
            for (int j = 0; j < chessBoard[i].length; j++)
                System.out.print(chessBoard[i][j].getIcon());
            System.out.println();
        }
    }

    /*   print() with enhanced 'for'
    public void print() {
        for (ChessPiece[] chessPieces : chessBoard) {
            for (ChessPiece chessPiece : chessPieces) System.out.print(chessPiece.getIcon());
            System.out.println();
        }
    }  */
}
