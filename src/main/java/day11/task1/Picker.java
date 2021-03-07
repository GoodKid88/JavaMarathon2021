package day11.task1;

public class Picker implements Worker {
    private int oneOrderSalary = 80;
    private int salary;
    private boolean isPayed = false;
    private Warehouse warehouse;
    private int countDoWork;
    private int bonus = 70000;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary = " + salary +
                ", isPayed = " + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        countDoWork++;
        salary += oneOrderSalary;
        warehouse.setCountPickedOrders(countDoWork);
    }

    @Override
    public void bonus() {
        if (isPayed == false) {
            if (warehouse.getCountPickedOrders() >= 10000) {
                salary += bonus;
            } else {
                System.out.println("Бонус пока не доступен");
            }
        } else {
            System.out.println("Бонус уже был выплачен");
        }
        isPayed = true;
    }
}
