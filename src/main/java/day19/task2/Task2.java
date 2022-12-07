/*2. В папке resources находится файл taxi_cars.txt. Этот файл содержит в себе данные
о местоположении 500 машин такси (каждая машина такси находится на новой строке).

Формат данных в файле следующий:
id_машины координата_по_x координата_по_y

Каждая строка в файле содержит 3 целых числа, разделенных пробелами — уникальный идентификатор
машины такси, координата машины по оси X и координата машины такси по оси Y.
Значения каждой из координат находятся в диапазоне от 0 до 99.

Для вашего удобства, в пакете task2 реализован класс - Point. Класс Point необходим для
представления точек с координатами x,y в нашей программе. Местоположение машины такси — объект класса Point.

Вам необходимо считать строки из файла taxi_cars.txt в HashMap<Integer, Point>.
В качестве ключей используются id машин из файла, а в качестве значений используется объект Point,
созданный для двух координат текущей машины. После того, как все машины будут лежать в объекте HashMap,
вам необходимо запросить от пользователя 4 числа - координаты квадрата (x1, y1, x2, y2).
Первые два числа — координаты первой точки квадрата, вторые два числа — координаты второй точки квадрата.

Для квадрата, введенного пользователем, вам необходимо, используя сформированный объект
HashMap<Integer, Point>, определить, какие машины попали внутрь этого квадрата.
Вам необходимо вывести в консоль идентификаторы машин, которые находятся внутри квадрата и
общее количество машин в квадрате. Машины, лежащие на грани квадрата, не учитываются.
*/
package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        String separator = File.separator;
        String taxiFilePath = "src" + separator + "main" + separator + "resources" + separator + "taxi_cars.txt";

        Map<Integer, Point> taxiMap = new HashMap<>();

        readTaxiListToHashMap(taxiMap, taxiFilePath);
        searchForTaxiCars(taxiMap);
    }

    public static void readTaxiListToHashMap(Map<Integer, Point> hashMapName, String taxiFilePath) {
        try (Scanner scanner1 = new Scanner(new File(taxiFilePath))) {
            while (scanner1.hasNextLine()) {

                String[] singleLine = scanner1.nextLine().split(" ");
                int[] singleLineInt = new int[singleLine.length];

                for (int i = 0; i < singleLine.length; i++)
                    singleLineInt[i] = Integer.parseInt(singleLine[i]);

                int taxiId = singleLineInt[0];
                int pointCoordinateX = singleLineInt[1];
                int pointCoordinateY = singleLineInt[2];

                hashMapName.put(taxiId, new Point(pointCoordinateX, pointCoordinateY));
            }

        } catch (FileNotFoundException e) {
            e.getMessage();
        }

    }

    public static void searchForTaxiCars(Map<Integer, Point> hashMapName) {

        Scanner scannerIn = new Scanner(System.in);
        System.out.println("Введите координаты области поиска автомобилей такси: x1 y1 x2 y2");

        int coordinateX1 = scannerIn.nextInt();
        int coordinateY1 = scannerIn.nextInt();
        int coordinateX2 = scannerIn.nextInt();
        int coordinateY2 = scannerIn.nextInt();

        int carsCounter = 0;

        Point temporaryPoint;

        for (Map.Entry<Integer, Point> entry : hashMapName.entrySet()) {
            temporaryPoint = entry.getValue();
            if ((temporaryPoint.getX() > coordinateX1 && temporaryPoint.getX() < coordinateX2)
                    &&
                    (temporaryPoint.getY() < coordinateY1 && temporaryPoint.getY() > coordinateY2)) {
                System.out.println(entry.getKey());
                carsCounter++;
            }
        }
        System.out.println("Количество такси в заданной области: " + carsCounter);

        scannerIn.close();
    }
}

