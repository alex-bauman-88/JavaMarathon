
package day11.task1;

public class Courier implements Worker {
    private int salary;
    private static final int SALARY_INCREASE = 100;
    private Warehouse warehouseVar;

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return "Current salary: " + getSalary();
    }

    public Courier(Warehouse warehouseVar) {
        this.warehouseVar = warehouseVar;
    }

    @Override
    public void doWork() {
        salary += SALARY_INCREASE;
        warehouseVar.increaseCountDeliveredOrders();
    }

    // Задумка такого bonus(): выплачивать бонус не только однократно при 10 000 заказов,
    // но и в дальшейшем, за достижение 20 000 заказов и тд,
    // в итоге boolean isPaid стал лишним
    @Override
    public void bonus() {
        if (warehouseVar.getCountDeliveredOrders() < 10000)
            System.out.println("Bonus is not available yet");
        else if (warehouseVar.getCountDeliveredOrders() % 10000 == 0) {
            salary += 50000;
            System.out.println("Bonus was paid, good job!");
        } else
            System.out.println("Bonus was already paid previously");
    }
}
