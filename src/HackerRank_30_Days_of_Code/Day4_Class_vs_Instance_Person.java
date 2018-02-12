package HackerRank_30_Days_of_Code;

public class Day4_Class_vs_Instance_Person {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Day4_Class_vs_Instance_Person(int initialAge) {
        if (initialAge > 0) {
            age = initialAge;
        } else {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age < 18 && age >= 13) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() {
        setAge(getAge() + 1);
    }
}