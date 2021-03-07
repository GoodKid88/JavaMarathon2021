package day11.task1;

public class Warehouse {
    private static int countPickedOrders;
    private int countDeliveredOrders;

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders = " + countPickedOrders +
                ", countDeliveredOrders = " + countDeliveredOrders +
                '}';
    }
}
