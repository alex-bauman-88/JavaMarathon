/*
Доп.материалы - Как измерить время работы программы:
long startTime = System.currentTimeMillis(); //сохраняем время перед запуском блока кода
… // ваш код, время которого необходимо измерить
long stopTime = System.currentTimeMillis(); //сохраняем время после того, как код отработал
System.out.println(“Длительность работы, в мс.: “ + stopTime - startTime);

Задачи:

1. Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна строка, полученная конкатенацией
(“склеиванием”) чисел из диапазона через пробел (0 + “ “ + 1 + “ “ + 2 + … + 20000).
После создания такой строки, вызов System.out.println() на этой строке должен вывести в консоль сразу все числа из диапазона:
0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000

Для того, чтобы почувствовать разницу в производительности между конкатенацией обычных строк (класс String) и
использовании StringBuilder, реализуйте описанную задачу этими двумя способами, замеряя время работы программы.
 */

package day8;

public class Task1 {
    public static void main(String[] args) {

        // ========================== конкатенация обычных строк ========================================

//        long startTime = System.currentTimeMillis(); //сохраняем время перед запуском блока кода
//
//        String iString; // int конвертированный в String
//        String theString = null; // конкатинированный String
//
//        for (int i = 0; i <= 20000; i++) {
//            iString = String.valueOf(i);
//            theString = theString + iString + " ";
//        }
//        System.out.println(theString);
//
//        long stopTime = System.currentTimeMillis(); //сохраняем время после того, как код отработал
//        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime)); // 821 ms

        // ================================== StringBuilder ============================================

        long startTime = System.currentTimeMillis(); //сохраняем время перед запуском блока кода

        String iString; // int конвертированный в String
        StringBuilder theString = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            iString = String.valueOf(i);
            theString.append(iString).append(" ");
        }
        System.out.println(theString);

        long stopTime = System.currentTimeMillis(); //сохраняем время после того, как код отработал
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime)); // 24 ms
    }
}
