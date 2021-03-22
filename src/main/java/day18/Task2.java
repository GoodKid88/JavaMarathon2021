package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237));
    }

    public static int count7(int i) {
        if (i == 0) {
            return 0;
        }
        int counter = 0;
        if (i % 10 == 7)
            counter++;

        return counter + count7(i /= 10);
    }
}
