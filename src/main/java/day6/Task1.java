package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        Motorbike motorbike = new Motorbike(1986, "black", "Harley Davidson");
        motorbike.info();
        System.out.println(motorbike.yearDifference(2021));
        car.setYear(2015);
        car.info();
        System.out.println(car.yearDifference(2021));
    }
}
