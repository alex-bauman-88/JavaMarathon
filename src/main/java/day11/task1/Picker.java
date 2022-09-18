
package day11.task1;

public class Picker implements Worker {
    private int salary;
    private static final int SALARY_INCREASE = 80;
    // Чтобы иметь доступ к полям класса Склад, будет добавлена ссылка
    // на Склад в поле класса Сборщика
    // https://www.delftstack.com/howto/java/is-a-vs-has-a-java/
    private Warehouse warehouseVar;

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return "Current salary: " + getSalary();
    }

    public Picker(Warehouse warehouseVar) {
        this.warehouseVar = warehouseVar;
    }

    @Override
    public void doWork() {
        salary += SALARY_INCREASE;
        warehouseVar.increaseCountPickedOrders();
    }


    @Override
    public void bonus() {
        if (warehouseVar.getCountPickedOrders() < 10000) {
            System.out.println("Bonus is not available yet");
        } else if (warehouseVar.getCountPickedOrders() % 10000 == 0) {
            salary += 70000;
            System.out.println("Bonus was paid, good job!");
        } else
            System.out.println("Bonus was already paid previously");
    }
}
