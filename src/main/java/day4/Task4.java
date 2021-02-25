package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int sum;
        int max = 0;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length - 2; i++) {
            sum = arr[i] + arr[i + 1] + arr[i + 2];
            if (sum > max) {
                max = sum;
                index = i;
            }

        }
        System.out.println();
        System.out.println(max);
        System.out.println(index);
    }
}
