package day11.task2;

public class Warrior extends Hero implements PhysAttack{
    private int health;
    private double physDef;
    private double magicDef;
    private int physAtt;

    public Warrior() {
        this.health = 100;
        this.physDef = 0.8;
        this.magicDef = 0;
        this.physAtt = 30;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public double getPhysDef() {
        return physDef;
    }

    @Override
    public double getMagicDef() {
        return magicDef;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + getHealth() +
                '}';
    }

    @Override
    public void physicalAttack(Hero hero) {
        int a = (int) (hero.getHealth() - (physAtt - (physAtt * hero.getPhysDef())));
        if (a <= HEALTH_LIMIT_LOW) {
            hero.setHealth(0);
        } else {
            hero.setHealth(a);
        }
    }
}
