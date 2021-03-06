package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack {
    private int magicAtt;
    private int healHimself;
    private int healTeammate;

    public Shaman() {
        this.physDef = 0.2;
        this.magicDef = 0.2;
        this.physAtt = 10;
        this.magicAtt = 15;
        this.healHimself = 50;
        this.healTeammate = 30;
    }

    @Override
    public String toString() {
        return "Magican{" +
                "health=" + health +
                '}';
    }

    @Override
    public void healHimself() {
        if (health < HEALTH_LIMIT_HIGHT) {
            health += healHimself;
            if (health > HEALTH_LIMIT_HIGHT) {
                health = HEALTH_LIMIT_HIGHT;
            }
        } else {
            System.out.println("Герой не нуждается в лечении");
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth() < HEALTH_LIMIT_HIGHT) {
            hero.setHealth(hero.getHealth() + healTeammate);
            if (hero.getHealth() > HEALTH_LIMIT_HIGHT) {
                hero.setHealth(HEALTH_LIMIT_HIGHT);
            }
        } else {
            System.out.println("Герой не нуждается в лечении");
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
