package HackerRank_30_Days_of_Code.Day12_Inheritance.Day12_Tutorial;

public class Cat extends Animal {

    public Cat(/**int age*/){
        super(/**age*/7);
        System.out.println("A cat has been created!");
    }
    public void meow(){
        System.out.println("A cat meows!");
    }
    public void prance(){//move with high springy steps
        System.out.println("A cat is prancing");
    }
}