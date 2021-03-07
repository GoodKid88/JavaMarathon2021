package day11.task1;

public class Courier implements Worker {
    private final int ONE_ORDER_SALARY = 100;
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;
    private final int BONUS = 50000;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary = " + salary +
                ", isPayed = " + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += ONE_ORDER_SALARY;
        warehouse.incrementDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (isPayed == false) {
            if (warehouse.getCountDeliveredOrders() >= 10000) {
                salary += BONUS;
            } else {
                System.out.println("Бонус пока не доступен");
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }
        isPayed = true;
    }
}
