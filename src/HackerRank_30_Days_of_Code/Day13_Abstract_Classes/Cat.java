package HackerRank_30_Days_of_Code.Day13_Abstract_Classes;

public class Cat extends Animal {

    public Cat(/**int age*/) {
        super(/**age*/7);
        System.out.println("A cat has been created!");
    }

    //NEW!!!
    public void eat() {
        System.out.println("A cat is eating");
    }

    public void sleepysleep() {
        System.out.println("A cat is sleeping");
    }

    public void meow() {
        System.out.println("A cat meows!");
    }

    public void prance() {//move with high springy steps
        System.out.println("A cat is prancing");
    }
}