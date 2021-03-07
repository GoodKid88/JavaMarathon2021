package day11.task1;

public class Warehouse {
    private int countPickedOrders;
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

    public void incrementPickedOrders(){
        countPickedOrders++;
    }

    public void incrementDeliveredOrders(){
        countDeliveredOrders++;
    }

    public void incrementWorkers(){

    }
}
