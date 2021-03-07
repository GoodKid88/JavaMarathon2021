package day11.task2;

public abstract class Hero implements PhysAttack {
    private int health;
    private double physDef;
    private double magicDef;
    private int physAtt;
    private int magicAtt;
    final int HEALTH_LIMIT_LOW = 0;
    final int HEALTH_LIMIT_HIGHT = 100;

    public Hero() {
        this.health = 100;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                ", physDef=" + physDef +
                ", magicDef=" + magicDef +
                ", physAtt=" + physAtt +
                ", magicAtt=" + magicAtt +
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
