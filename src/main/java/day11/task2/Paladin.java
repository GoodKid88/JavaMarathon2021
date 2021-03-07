package day11.task2;

public class Paladin extends Hero implements Healer {
    private int healHimself;
    private int healTeammate;

    public Paladin() {
        this.physDef = 0.5;
        this.magicDef = 0.2;
        this.physAtt = 15;
        this.healHimself = 25;
        this.healTeammate = 10;
    }

    @Override
    public String toString() {
        return "Paladin{" +
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
}
