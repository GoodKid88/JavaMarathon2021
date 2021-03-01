package day8;

public class Task1 {
    public static void main(String[] args) {
        String string = "0";
        StringBuilder sb = new StringBuilder("0");

        long start = System.currentTimeMillis();
        for (int i = 1; i <= 20000; i++) {
            string += " " + i;
        }
        System.out.print(string);

        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);

        long start1 = System.currentTimeMillis();
        for (int i = 1; i <= 20000; i++) {
            sb.append(" " + i);
        }
        System.out.print(sb.toString());

        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;
        System.out.println(timeConsumedMillis1);
    }
}
