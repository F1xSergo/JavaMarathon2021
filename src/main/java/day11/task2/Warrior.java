package day11.task2;

public class Warrior extends Hero {

    public Warrior() {
        physDef = 0.8;
        physAtt = 30;
    }

//    @Override
//    public void physicalAttack(Hero hero) {
//        int attack = (physAtt * ( 100 - hero.physAtt)) / 100;
//       if(hero.health - physAtt < 0){
//           health = 0;
//       }else
//           health -= attack;
//    }


    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
//изначально мысль была имплементить в каждом воине виды атак