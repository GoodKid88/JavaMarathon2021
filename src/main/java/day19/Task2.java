package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        File file = new File("C:" + separator + "Users" + separator + "Andrei"
                + separator + "javaprojects" + separator + "JavaMarathon2021" + separator + "src" +
                separator + "main" + separator + "resources" + separator + "numbers19.txt");
        Scanner scanner = new Scanner(file);
        HashSet<Integer> set = new HashSet();
        int counter = 0;

        while (scanner.hasNextLine()) {
            set.add(Integer.parseInt(scanner.nextLine()));
        }

        for (int i = 500000000; i <= 600000000; i++) {
            if (set.contains(i)) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
