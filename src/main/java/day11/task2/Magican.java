package day11.task2;

public class Magican extends Hero implements PhysAttack, MagicAttack {
    private int health;
    private double physDef;
    private double magicDef;
    private int physAtt;
    private int magicAtt;

    public Magican() {
        this.health = 100;
        this.physDef = 0;
        this.magicDef = 0.8;
        this.physAtt = 5;
        this.magicAtt = 20;
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
        return "Magican{" +
                "health=" + health +
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

    @Override
    public void magicalAttack(Hero hero) {
        int a = (int) (hero.getHealth() - (magicAtt - (magicAtt * hero.getMagicDef())));
        if (a <= HEALTH_LIMIT_LOW) {
            hero.setHealth(0);
        } else {
            hero.setHealth(a);
        }
    }
}
