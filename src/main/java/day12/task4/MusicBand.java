package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", member=" + members +
                '}';
    }

    public List<String> getMembers() {
        return members;
    }

    public void printMembers() {
        System.out.println(members);
    }

    public static void transferMembers(MusicBand bandA, MusicBand bandB) {
        while (bandA.members.isEmpty() != true) {
            int i = 0;
            bandB.members.add(bandA.members.get(i));
            bandA.members.remove(i);
        }
    }
}
