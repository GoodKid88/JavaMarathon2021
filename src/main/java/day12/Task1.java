package day12;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Audi");
        arrayList.add("BMW");
        arrayList.add("Subaru");
        arrayList.add("Mercedes");
        arrayList.add("MINI");

        System.out.println(arrayList);

        arrayList.add(3, "Nissan");
        arrayList.remove(2);

        System.out.println(arrayList);
    }
}
