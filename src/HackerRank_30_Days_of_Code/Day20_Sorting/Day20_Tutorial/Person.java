package HackerRank_30_Days_of_Code.Day20_Sorting.Day20_Tutorial;

//import static HackerRank_30_Days_of_Code.Day20_Sorting.Day20_Tutorial.HairColor.BLONDE;
import static HackerRank_30_Days_of_Code.Day20_Sorting.Day20_Tutorial.HairColor.*;

public class Person {
    //https://docs.oracle.com/javase/8/docs/api/
    HairColor hairColor=BLACK;
    public Person(){
    }
    public static void main(String[] args) {
        Person peterParker  = new Person();
        Person spiderMan = peterParker;
        System.out.println(peterParker.hairColor);
        System.out.println(spiderMan.hairColor);
        peterParker.hairColor = PINK;
        System.out.println(peterParker.hairColor);
        System.out.println(spiderMan.hairColor);
        spiderMan.hairColor = BLONDE;
        System.out.println(peterParker.hairColor);
        System.out.println(spiderMan.hairColor);
    }
}