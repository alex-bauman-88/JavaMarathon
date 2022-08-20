/*
1. Реализовать программу, используя switch, которая в консоль выводит название страны,
принимая на вход название города. Программа должна работать до тех пор, пока не будет введено слово “Stop”.

Реализовать, используя следующие данные:

Москва, Владивосток, Ростов - Россия             Moscow Vladivostok Rostov Russia
Рим, Милан, Турин - Италия                       Rome Milan Turin Italy
Ливерпуль, Манчестер, Лондон - Англия            Liverpool Manchester London England
Берлин, Мюнхен, Кёльн - Германия                 Berlin Munich Cologne Germany

При вводе любого другого города,                 Unknown country
вывести сообщение “Неизвестная страна”.
------------
Для сравнения строк используются методы equals() (с учетом регистра) и equalsIgnoreCase() (без учета регистра).
Оба метода в качестве параметра принимают строку, с которой надо сравнить:

String str1 = "Hello";
String str2 = "hello";

System.out.println(str1.equals(str2)); // false
System.out.println(str1.equalsIgnoreCase(str2)); // true
*/

package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner anyWord = new Scanner(System.in);
        System.out.println("Enter any city name");

        while (true) {
            String cityName = anyWord.nextLine();
            if (cityName.equals("stop")) // можно не юзать фиг скобки если в теле if только одна инструкция
                break;

            switch (cityName) {
                case "Moscow":
                case "Vladivostok":
                case "Rostov":
                    System.out.println("Russia");
                    break;
                case "Rome":
                case "Milan":
                case "Turin":
                    System.out.println("Italy");
                    break;
                default:
                    System.out.println("Unexpected value: " + cityName);
                    break;
            }
        }
    }
}
