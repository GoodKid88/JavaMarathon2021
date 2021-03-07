package day11.task1;

public class Courier implements Worker {
    private int oneOrderSalary = 100;
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;
    private int countDoWork;
    private int bonus = 50000;
    int countCouriers;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
        countCouriers++;
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
        countDoWork++;
        salary += oneOrderSalary;
        warehouse.setCountDeliveredOrders(countDoWork);
    }

    @Override
    public void bonus() {
        if (isPayed == false) {
            if (warehouse.getCountDeliveredOrders() >= 10000) {
                salary += bonus / countCouriers;
            } else {
                System.out.println("Бонус пока не доступен");
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }
        isPayed = true;
    }
}
