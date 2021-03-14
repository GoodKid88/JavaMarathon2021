package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        String pathShoes = "C:" + separator + "Users" + separator + "Andrei" + separator + "javaprojects" + separator +
                "JavaMarathon2021" + separator + "src" + separator + "main" + separator + "resources"
                + separator + "shoes.csv";
        String pathMissingShoes = "C:" + separator + "Users" + separator + "Andrei" + separator + "javaprojects" + separator +
                "JavaMarathon2021" + separator + "src" + separator + "main" + separator + "resources"
                + separator + "missing_shoes.txt";
        File file = new File(pathShoes);
        File file2 = new File(pathMissingShoes);

        try {
            Scanner scanner = new Scanner(file);
            PrintWriter printWriter = new PrintWriter(file2);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] lineArray = line.split(";");
                if (lineArray[2].equals("0")) {
                    printWriter.println(lineArray[0] + "," + lineArray[1] + "," + lineArray[2]);
                }
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
