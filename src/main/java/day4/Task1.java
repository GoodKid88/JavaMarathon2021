package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int Up8 = 0;
        int one = 0;
        int d = 0;
        int e = 0;
        int sum = 0;

        int[] arr = new int[arrayLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (1 + Math.random() * 10);
            System.out.print(arr[i] + " ");
            if (arr[i] > 8) {
                Up8++;
            } else if (arr[i] == 1) {
                one++;
            }
            if (arr[i] % 2 == 0) {
                d++;
            } else {
                e++;
            }
            sum += arr[i];
        }
        System.out.println();
        System.out.println("Длина массива: " + arrayLength);
        System.out.println("Количество чисел больше 8: " + Up8);
        System.out.println("Количество чисел равных 1: " + one);
        System.out.println("Количество четных чисел: " + d);
        System.out.println("Количество нечетных чисел: " + e);
        System.out.println("Сумма всех элементов мвссива: " + sum);
    }
}
