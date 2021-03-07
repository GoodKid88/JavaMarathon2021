package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Worker worker1 = new Picker(warehouse);
        Worker worker2 = new Courier(warehouse);

        Warehouse warehouse1 = new Warehouse();
        Worker worker3 = new Picker(warehouse1);
        Worker worker4 = new Courier(warehouse1);

        businessProcess(worker1);
        businessProcess(worker2);
        businessProcess(worker3);
        businessProcess(worker4);

        System.out.println(worker1);
        System.out.println(worker2);
        System.out.println(worker3);
        System.out.println(worker4);
    }

    static void businessProcess(Worker worker) {
        for (int i = 1; i <= 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
