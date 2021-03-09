package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<MusicBand> mb = new ArrayList<>();
        List<String> members1 = new ArrayList<>();
        List<String> members2 = new ArrayList<>();

        mb.add(new MusicBand("Nirvana", 1987, members1));
        mb.add(new MusicBand("AC/DC", 1973, members2));

        members1.add("Kurt Cobain");
        members1.add("Krist Novoselic");
        members1.add("Dave Grohl");

        members2.add("Malcolm Young");
        members2.add("Angus Young");
        members2.add("Bon Scott");

        MusicBand.transferMembers(mb.get(0), mb.get(1));

        mb.get(0).printMembers();
        mb.get(1).printMembers();
    }
}
