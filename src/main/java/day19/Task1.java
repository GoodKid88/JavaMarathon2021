package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        File file = new File("C:" + separator + "Users" + separator +
                "Andrei" + separator + "javaprojects" + separator + "JavaMarathon2021"
                + separator + "src" + separator + "main" + separator + "resources" + separator + "dushi.txt");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("[.,:;()?!\"\\s–]+");
        List<String> words = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        //int counter = 0;

        while (scanner.hasNext()) {
            words.add(scanner.next());
        }

        for (String word : words) {
//            if (word.equals("Чичиков")) {
//                counter++;
//            }
            if (!word.isEmpty()) {
                Integer count = map.get(word);
                if (count == null) {
                    count = 0;
                }
                map.put(word, ++count);
            }
        }

        TreeMap<Integer, String> treemap = new TreeMap<>(Collections.reverseOrder());
        for (String word : map.keySet()) {
            treemap.put(map.get(word), word);
        }

        treemap.entrySet().stream().limit(100).forEach(System.out::println);

        //Чичиков - 601
        //System.out.println("Чичиков" + ": " + counter);
    }
}

