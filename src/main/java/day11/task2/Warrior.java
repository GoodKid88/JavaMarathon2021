package day11.task2;

public class Warrior extends Hero{

    public Warrior() {
        this.physDef = 0.8;
        this.magicDef = 0;
        this.physAtt = 30;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
