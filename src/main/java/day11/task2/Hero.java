package day11.task2;

public abstract class Hero implements PhysAttack {
    static final int MAX_HEALTH = 100;
    static final int MIN_HEALTH = 0;
    int health; //(здоровье)
    double physDef; //(процент поглощения физического урона)
    double magicDef; //(процент поглощения магического урона)
    int physAtt; //(величина физической атаки), по необходимости


    public Hero() {
        this.health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attack = physAtt *(1 - hero.physDef);
        if (hero.health - attack < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attack;
        }
    }
}
//сделал по видео