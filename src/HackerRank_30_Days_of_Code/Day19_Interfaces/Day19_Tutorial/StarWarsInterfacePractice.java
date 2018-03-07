package HackerRank_30_Days_of_Code.Day19_Interfaces.Day19_Tutorial;

import java.util.Random;

public class StarWarsInterfacePractice {

    public static Character summonCharacter() {
        Random rand = new Random();
        if (Math.abs(rand.nextInt()) % 2 == 0) {
            return new Enemy();
        } else {
            return new Hero();
        }
    }

    public static void main(String[] args) {
        Enemy dartVader = new Enemy();
        Hero ObiWanKenobi = new Hero();
        dartVader.attack();
        ObiWanKenobi.attack();
        dartVader.heal();
        ObiWanKenobi.heal();
        System.out.println("Enemy weapon: "+dartVader.getWeapon());
        System.out.println("Hero weapon: "+ObiWanKenobi.getWeapon());
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
    }
}