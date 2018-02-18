package HackerRank_30_Days_of_Code.Day12_Inheritance.Day12_Tutorial;

public class Dog extends Animal {

    public Dog(/**int age*/){
        super(/**age*/15);
        System.out.println("A dog has been created!");
    }
    public void ruff(){
        System.out.println("The dog says ruff");
    }
    public void run(){
        System.out.println("A dog is running");
    }
}