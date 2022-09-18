/* 1. На складе происходит сборка и упаковка интернет-заказов.
Создайте классы:
“Склад” (англ. Warehouse) c полями countPickedOrders (количество собранных заказов), countDeliveredOrders (количество
доставленных заказов), get методами для обоих полей и методом toString() для получения информации о значениях полей склада.

“Сборщик” (англ. Picker) с полями salary (заработная плата) и isPayed (был выплачен бонус или нет), get методами для
обоих полей, методом toString() и конструктором.

“Курьер” (англ. Courier) с полями salary (заработная плата) и isPayed (был выплачен бонус или нет), get методами для
обоих полей, методом toString() и конструктором.

В классах “Сборщик” и “Курьер” могут понадобиться и другие поля на ваше усмотрение (чтобы эти классы соответствовали
условиям задачи). */
/*

Каждый класс-сотрудник должен реализовывать интерфейс Worker, в котором необходимо объявить сигнатуры doWork() и bonus().
Каждый раз, когда сотрудник выполняет свою работу (вызов метода doWork()), ему выплачивается заработная плата (сокр. ЗП)
(80 — сборщику, 100 — курьеру).
Также, при вызове doWork() у Сборщика, происходит увеличение значения поля countPickedOrders в объекте класса Warehouse
на 1. А при вызове doWork() у Курьера, происходит увеличение значения поля countDeliveredOrders в объекте класса
Warehouse на 1. Подумайте о том, как связать объекты работников с объектом склада (один из возможных вариантов -
передавать объект склада в качестве аргумента при создании объектов-работников и хранить его в поле).

Сотрудникам полагается бонус, в зависимости от персональных показателей: когда на складе собрано 10.000 заказов, Сборщику
выплачивается бонус в размере 70.000. Когда клиентам доставлено 10.000 заказов, Курьеру выплачивается бонус в размере 50.000.
Если на складе несколько сотрудников одной категории, то оценивается их коллективная работа, т.е. если 10 курьеров доставят
каждый по 1000 заказов, то каждый курьер получит бонус.
Бонус сотрудникам должен выдаваться при вызове метода bonus(). Причем, если на складе не достигнуты необходимые показатели
(10.000 собранных или доставленных заказов), вызов метода bonus() не должен начислять денежную премию, а должен выводить в
консоль сообщение “Бонус пока не доступен”. Бонус может быть выплачен только один раз. При попытке повторной выплаты бонуса
(повторный вызов метода bonus() на работнике) в консоль должно выводиться сообщение “Бонус уже был выплачен”.
*/
/*
Реализуйте в классе Task1 статический метод:
static void businessProcess(Worker worker)

Этот метод в качестве аргумента принимает объект класса, реализующего интерфейс Worker. В теле этого метода на объекте
worker должен 10.000 раз вызываться метод doWork(), и после этого должен быть один раз вызван метод bonus().

Для демонстрации и тестирования работы программы, в методе main() создайте склад и по 1 рабочему. Свяжите этих двух
рабочих со складом. После этого, вызовите метод businessProcess(Worker worker), передавая в качестве аргумента сотрудника.
Вызовите метод сначала для сборщика, а потом для курьера. Выведите в консоль количество собранных и доставленных заказов
на складе и ЗП каждого из сотрудников.
Создайте второй склад, на который также “примите” по 1 новому сотруднику. Вызовите один раз метод doWork() у сотрудников
второго склада. Проконтролируйте, что у склада 1 и его сотрудников при этом значения не меняются.

 */

package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);
        businessProcess(picker1);
        businessProcess(courier1);

        System.out.println(warehouse1);              // Number of picked orders: 10000; number of delivered orders: 10000
        System.out.println(picker1.getSalary());     // 870000
        System.out.println(courier1.getSalary());    // 1050000

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);
        businessProcess(picker2);
        businessProcess(courier2);

        System.out.println(warehouse1);              // Number of picked orders: 10000; number of delivered orders: 10000
        System.out.println(warehouse2);              // Number of picked orders: 10000; number of delivered orders: 10000

        // проверка, что бонус выплатится еще раз, когда будет 20 000 заказов

        businessProcess(picker1);                    // Bonus was paid, good job!
        businessProcess(courier1);                   // Bonus was paid, good job!
        System.out.println(warehouse1);              // Number of picked orders: 20000; number of delivered orders: 20000
        System.out.println(picker1.getSalary());     // 1740000
        System.out.println(courier1.getSalary());    // 2100000

        // проверка, что бонус не выплатится, если не достигнута планка очередных 10000 заказов

        businessProcessNotCompleted(picker1);        // Bonus was already paid previously
        businessProcessNotCompleted(courier1);       // Bonus was already paid previously
        System.out.println(warehouse1);              // Number of picked orders: 25000; number of delivered orders: 25000

    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
    static void businessProcessNotCompleted(Worker worker) {
        for (int i = 0; i < 5000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
