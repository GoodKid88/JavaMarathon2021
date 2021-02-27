package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2010, 250, 1000);
        airplane.setYear(2011);
        airplane.setLength(300);
        airplane.fillUp(100);
        airplane.fillUp(250);
        airplane.info();
    }
}
