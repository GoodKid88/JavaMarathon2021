package day11.task2;

public class Magican extends Hero implements MagicAttack {
    private int magicAtt;

    public Magican() {
        this.physDef = 0;
        this.magicDef = 0.8;
        this.physAtt = 5;
        this.magicAtt = 20;
    }

    @Override
    public String toString() {
        return "Magican{" +
                "health=" + health +
                '}';
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
