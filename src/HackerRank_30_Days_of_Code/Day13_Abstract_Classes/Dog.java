package HackerRank_30_Days_of_Code.Day13_Abstract_Classes;

public class Dog extends Animal {
    public Dog(/**int age*/) {
        super(/**age*/15);
        System.out.println("A dog has been created!");
    }
    //NEW!!!
    public void eat() {
        System.out.println("A dog is eating");
    }

    public void sleep() {
        System.out.println("A dog is sleeping");
    }

    public void ruff() {
        System.out.println("The dog says ruff");
    }

    public void run() {
        System.out.println("A dog is running");
    }
}