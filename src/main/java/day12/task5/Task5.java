package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicBand> mb = new ArrayList<>();
        List<MusicArtist> members1 = new ArrayList<>();
        List<MusicArtist> members2 = new ArrayList<>();

        mb.add(new MusicBand("Nirvana", 1987, members1));
        mb.add(new MusicBand("AC/DC", 1973, members2));

        members1.add(new MusicArtist("Kurt Cobain", 1967));
        members1.add(new MusicArtist("Krist Novoselic", 1965));
        members1.add(new MusicArtist("Dave Grohl", 1969));

        members2.add(new MusicArtist("Malcolm Young", 1953));
        members2.add(new MusicArtist("Angus Young", 1955));
        members2.add(new MusicArtist("Bon Scott", 1946));

        mb.get(0).printMembers();
        mb.get(1).printMembers();

        MusicBand.transferMembers(mb.get(0), mb.get(1));

        mb.get(0).printMembers();
        mb.get(1).printMembers();
    }
}
