package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Worker worker1 = new Picker(warehouse);

        System.out.println(warehouse);
        System.out.println(worker1);

        worker1.doWork();
        worker1.doWork();

        System.out.println(warehouse);
        System.out.println(worker1);
    }
}
