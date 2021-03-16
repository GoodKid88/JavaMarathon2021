package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");


        try {
            PrintWriter printWriter = new PrintWriter(file1);
            int number;
            for (int i = 0; i < 1000; i++) {
                number = (int) (Math.random() * 100);
                printWriter.print(number + " ");
            }
            printWriter.close();

            printWriter = new PrintWriter(file2);
            Scanner scanner = new Scanner(file1);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            for (int i = 0; i < numbers.length - 19; i += 20) {
                double average;
                double sum = 0;
                for (int j = i; j < i + 20; j++) {
                    sum += Integer.parseInt(numbers[j]);
                }
                average = sum / 20;
                printWriter.print(average + " ");
            }
            printWriter.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        printResult(file2);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            double sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += Double.parseDouble(numbers[i]);
            }
            System.out.println((int) sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
