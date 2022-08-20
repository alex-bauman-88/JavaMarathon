/*
1. Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner, число,
соответствующее количеству этажей в здании. Используя условный оператор if, необходимо вывести
в консоль сообщение о типе такого дома.

Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более - “Многоэтажный дом”.
Также, необходимо учесть что может быть введено отрицательное значение, в таком случае сообщить “Ошибка ввода”.


*/
package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner houseNumber = new Scanner(System.in);
        //System.out.println("Enter house number");
        int houseN = houseNumber.nextInt();
        if (houseN <= 4 && houseN > 0){
            System.out.println("Ìàëîýòàæíûé äîì");
        } else if (houseN < 8 && houseN >=5) {
            System.out.println("Ñðåäíåýòàæíûé äîì");
        } else if (houseN >= 9) {
            System.out.println("Ìíîãîýòàæíûé äîì");
        } else {
            System.out.println("Îøèáêà ââîäà");
        }
    }
}
