package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");

        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> people = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] ageString = line.split(" ");
                int age;

                for (String str : ageString) {
                    try {
                        age = Integer.parseInt(str);
                        if (age <= 0) {
                            try {
                                throw new Exception();
                            } catch (Exception e) {
                                System.out.println("Некорректный входной файл");
                                return null;
                            }
                        }
                    } catch (Exception e) {
                        //действия не требуется
                    }
                }
                people.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            people = null;
        }
        return people;
    }
}
