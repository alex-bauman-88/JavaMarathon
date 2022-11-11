/*
Используя созданный Enum, в методе main() класса Task1 создайте массив, содержащий 4 белых пешки и 4 черных ладьи.
Выведите содержимое этого массива на экран, используя строковые обозначения шахматных фигур.

Вывод в консоль должен быть таким:
♙ ♙ ♙ ♙ ♜ ♜ ♜ ♜

*/
package day17;

import java.util.ArrayList;
import java.util.List;



public class Task1 {
    public static void main(String[] args) {
        List<ChessPiece> chess = new ArrayList<>();

        for (int i = 0; i < 4; i++)
            chess.add(ChessPiece.PAWN_WHITE);
        for (int i = 0; i < 4; i++)
            chess.add(ChessPiece.ROOK_BLACK);

        for (ChessPiece piece : chess)
            System.out.print(piece.getIcon() + " ");
    }
}