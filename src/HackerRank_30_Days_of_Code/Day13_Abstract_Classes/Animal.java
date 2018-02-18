package HackerRank_30_Days_of_Code.Day13_Abstract_Classes;

public abstract class Animal {
    public int age;

    public Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created!");
    }

    public abstract void eat();
    /*public void eat() {
        System.out.println("An animal is eating");
    }
    Don't work any more! With abstract class*/

    public void sleep() {
        System.out.println("An animal is sleeping");
    }

    public static void main(String[] args) {
        /*Animal a = new Animal(5);
        Don't work any more! With abstract class*/
        Dog d = new Dog();
        Cat c = new Cat();
        d.ruff();
        c.meow();
        /*a.eat();
        Don't work any more! With abstract class*/
        d.eat();
        c.eat();
        d.run();
        c.prance();
        System.out.println(d.age);
        /**But if in Animal public int age --> private int age
         * Will be Error!
         * Need:
         * public int getAge(){return age;}
         * and
         * System.out.println(d.getAge);
         */
        d.sleep(); //"A dog is sleeping" - OVERRIDE
        c.sleep(); //"An animal is sleeping" - NOT OVERRIDE
        c.sleepysleep();//"A cat is sleeping" - NOT OVERRIDED, another method

        //Casting
        Object dog = new Dog();
        //dog.ruff(); - Error
        Dog realDog = (Dog) dog;
        realDog.ruff();

        Object str = "est";
        String realS = (String)str;
        realS.getBytes();

        Dog doggy = new Dog();
        if (doggy instanceof Animal){
            Animal animal = (Animal)doggy;
            animal.sleep();
        }
        doggy.sleep();
    }
}