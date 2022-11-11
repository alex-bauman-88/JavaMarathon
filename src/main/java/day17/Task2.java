/*Добавьте новую “фигуру” в enum ChessPiece, которая будет называться EMPTY. Эта “фигура” будет обозначать пустое пространство
на шахматной доске. Ценность этой фигуры равна -1, а строковое обозначение равно нижнему подчеркиванию ("_").

Затем создайте класс Шахматная доска (англ. ChessBoard). Этот класс в единственном аргументе конструктора должен принимать
на вход двумерный массив шахматных фигур. Этот двумерный массив задает конфигурацию фигур на шахматной доске.
Пустое пространство на шахматной доске задается с помощью значения EMPTY. Также, у класса ChessBoard должен быть реализован
метод print(), который выводит шахматную доску в консоль.
В методе main() класса Task2 создайте новый объект класса ChessBoard, передав ему в качестве аргумента двумерный массив с
расположением фигур как на картинке ниже (матч Крамник - Каспаров 2000 года).

Затем, используя метод print() выведите шахматную доску в консоль, используя строковые обозначения шахматных фигур.
Вывод в консоль должен быть таким:
0    ♜____♜♚_
1    _♖__♟♟_♟
2    ♟_♞___♟_
3    ♛__♗____
4    ___♝♙___
5    ____♗♙__
6    ♙__♕_♙_♙
7    _____♖♔_

 */
package day17;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] chessPieces = new ChessPiece[8][8];
        ChessBoard chessBoard1 = new ChessBoard(chessPieces);

        for (ChessPiece[] chessPiece : chessPieces) {
            Arrays.fill(chessPiece, ChessPiece.EMPTY);
        }
        //System.out.println(Arrays.deepToString(chessPieces));
        chessPieces[0][0] = ChessPiece.ROOK_BLACK;
        chessPieces[0][5] = ChessPiece.ROOK_BLACK;
        chessPieces[0][6] = ChessPiece.KING_BLACK;
        chessPieces[1][1] = ChessPiece.ROOK_WHITE;
        chessPieces[1][4] = ChessPiece.PAWN_BLACK;
        chessPieces[1][5] = ChessPiece.PAWN_BLACK;
        chessPieces[1][7] = ChessPiece.PAWN_BLACK;
        chessPieces[2][0] = ChessPiece.PAWN_BLACK;
        chessPieces[2][2] = ChessPiece.KNIGHT_BLACK;
        chessPieces[2][6] = ChessPiece.PAWN_BLACK;
        // принцип понятен, дальше менять EMPTY на фигуры не буду

        chessBoard1.print();

    }
}
