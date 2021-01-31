package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {

    static final int HEAL_AMOUNT = 50;
    static final int HEAL_TEAMMATE_AMOUNT = 30;
    int magicAtt = 15;

    public Shaman() {
        physDef =  0.2;
        magicDef =  0.2;
        physAtt = 10;
    }


    @Override
    public void healHimself() {
        if (health + HEAL_AMOUNT > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += HEAL_AMOUNT;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEAL_TEAMMATE_AMOUNT > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += HEAL_TEAMMATE_AMOUNT;
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attack = magicAtt * (1 - hero.magicDef);
        if (hero.health - attack < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attack;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
