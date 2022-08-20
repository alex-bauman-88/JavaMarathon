/*
Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
Размер матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких строк несколько,
вывести индекс последней из них.

Пример сгенерированной матрицы (для простоты m=3, n=5):

3 2 1 5 7     // сумма - 18
1 2 5 6 2     // сумма - 16
3 4 9 6 4    // сумма - 26

Ответ: 2 (индекс строки, сумма чисел в которой максимальна)

*/
package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] twoD = new int[12][8];
        //Random randomNumber = new Random();

        int lineSumMax = 0;
        int lineSumMaxIndex = 0;

        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                twoD[i][j] = (int) (Math.random() * 51); //twoD[i][j] = randomNumber.nextInt(50);
                System.out.print(" " + twoD[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < twoD.length; i++) {
            int lineSum = 0;
            for (int j = 0; j < twoD[i].length; j++) {
                lineSum += twoD[i][j];
            }
            if (lineSumMax <= lineSum) {
                lineSumMax = lineSum;
                lineSumMaxIndex = i;
            }
        }

        System.out.println("The index is авп " + lineSumMaxIndex);
    }
}