/*1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
Добавить в середину еще 1 автомобиль,
удалить самый первый автомобиль из списка. Вывести список в консоль.
*/

package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> carsArrayList = new ArrayList<>();
        carsArrayList.add("BMW");
        carsArrayList.add("Volvo");
        carsArrayList.add("Citroen");
        carsArrayList.add("Tesla");
        carsArrayList.add("Honda");
        System.out.println(carsArrayList);

        carsArrayList.add(2,"Hyundai");
        carsArrayList.remove(0);
        System.out.println(carsArrayList);
    }
}
