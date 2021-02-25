package day4;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int max = 0;
        int min = 1000;
        int b = 0;
        int sum = 0;
        for (int i : arr) {
            arr[i] = (int) (0 + Math.random() * 1000);
            System.out.print(arr[i] + " ");
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] % 10 == 0) {
                b++;
                sum += arr[i];
            }
        }
        System.out.println();
        System.out.println("наибольший элемент массива " + max);
        System.out.println("наименьший элемент массива " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0 " + b);
        System.out.println("сумму элементов массива, оканчивающихся на 0" + sum);
    }
}
