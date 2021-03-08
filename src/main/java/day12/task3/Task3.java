package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> mb = new ArrayList<>();

        mb.add(new MusicBand("Nirvana", 1987));
        mb.add(new MusicBand("Nautilus Pompilius", 1982));
        mb.add(new MusicBand("The Beatles", 1957));
        mb.add(new MusicBand("AC/DC", 1973));
        mb.add(new MusicBand("Queen", 1970));
        mb.add(new MusicBand("Black Sabbath", 1968));
        mb.add(new MusicBand("Linkin Park", 2000));
        mb.add(new MusicBand("Shinedown", 2001));
        mb.add(new MusicBand("My Chemical Romance", 2001));

        System.out.println(mb);

        System.out.println(groupsAfter2000(mb));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> after2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() >= 2000) {
                after2000.add(band);
            }
        }
        return after2000;
    }
}
