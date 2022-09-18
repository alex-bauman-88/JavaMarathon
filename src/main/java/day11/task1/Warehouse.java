
package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void increaseCountPickedOrders(){
        countPickedOrders++;
    }

    public void increaseCountDeliveredOrders(){
        countDeliveredOrders++;
    }

    public String toString() {
        return "Number of picked orders: " + getCountPickedOrders() + "; number of delivered orders: " + getCountDeliveredOrders();
    }


}
