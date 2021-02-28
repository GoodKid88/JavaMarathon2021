package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2015, 150, 500);
        Airplane airplane2 = new Airplane("TU", 2020, 200, 550);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}