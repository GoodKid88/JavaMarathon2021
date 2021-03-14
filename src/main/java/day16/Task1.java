package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers");

        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            double sum = 0;
            double average;
            int counter = 0;

            for (int i = 0; i < numbers.length; i++) {
                sum += Integer.parseInt(numbers[i]);
                counter++;
            }
            average = sum / counter;
            String format = new DecimalFormat("#0.000").format(average);
            System.out.print(average + " --> " + format);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

