package day19.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        File file = new File("C:" + separator + "Users" + separator + "Andrei"
                + separator + "javaprojects" + separator + "JavaMarathon2021" + separator + "src" +
                separator + "main" + separator + "resources" + separator + "taxi_cars.txt");
        Scanner scanner = new Scanner(file);
        HashMap<Integer, Point> map = new HashMap<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] car = line.split(" ");
            int id = Integer.parseInt(car[0]);
            Point point = new Point(Integer.parseInt(car[1]), Integer.parseInt(car[2]));
            map.put(id, point);
        }
        scanner.close();
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Введите координаты x1, y1, x2, y2: ");
        int x1 = scanner1.nextInt();
        int y1 = scanner1.nextInt();
        int x2 = scanner1.nextInt();
        int y2 = scanner1.nextInt();

        int counter = 0;

        for (Map.Entry<Integer, Point> entry : map.entrySet()) {
            if (entry.getValue().getX() > x1 && entry.getValue().getX() < x2) {
                if (entry.getValue().getY() < y1 && entry.getValue().getY() > y2) {
                    System.out.println(entry.getKey());
                    counter++;
                }
            }
        }
        scanner.close();
        System.out.println("Всего машин в квадрате: " + counter);
    }
}

