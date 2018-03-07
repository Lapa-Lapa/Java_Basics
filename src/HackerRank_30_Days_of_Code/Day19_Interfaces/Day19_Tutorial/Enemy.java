package HackerRank_30_Days_of_Code.Day19_Interfaces.Day19_Tutorial;

public class Enemy implements Character {
    public String weapon = "lightsaber";

    public Enemy() {
    }

    @Override
    public void attack() {
        System.out.println("The enemy attacks YOU!");
    }

    @Override
    public void heal() {
        System.out.println("The enemy heals himself");
    }

    @Override
    public String getWeapon() {
        return weapon;
    }

    public void weaponDraw() {
        System.out.println("draw put weapon");
    }
}