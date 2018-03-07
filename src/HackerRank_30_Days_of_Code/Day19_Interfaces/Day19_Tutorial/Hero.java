package HackerRank_30_Days_of_Code.Day19_Interfaces.Day19_Tutorial;

public class Hero implements Character {
    public String weapon = "The Force";

    public Hero() {
    }

    @Override
    public void attack() {
        System.out.println("The hero attacks the enemy");
    }

    @Override
    public void heal() {
        System.out.println("The hero heals you");
    }

    @Override
    public String getWeapon() {
        return weapon;
    }

    public void weaponDraw() {
        System.out.println("draw put weapon");
    }
}