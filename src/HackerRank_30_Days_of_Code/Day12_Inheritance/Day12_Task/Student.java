package HackerRank_30_Days_of_Code.Day12_Inheritance.Day12_Task;

public class Student extends Person {
    /**
     * Task
     * You are given two classes, Person and Student, where Person
     * is the base class and Student is the derived class.
     * Completed code for Person and a declaration for Student are provided
     * for you in the editor. Observe that Student inherits all the properties
     * of Person.
     * Complete the Student class by writing the following:
     * A Student class constructor, which has  parameters:
     * A string firstName.
     * A string lastName.
     * An integer id.
     * An integer array (or vector) of test scores.
     * A char calculate() method that calculates a Student object's average
     * and returns the grade character representative of their calculated average:
     * according Grading Scale.
     */
    private int[] testScores;
    private int sum;
    private char gradeLetter;
    int average;
    /**
     * Class Constructor
     *
     * @param firstName - A string denoting the Person's first name.
     * @param lastName  - A string denoting the Person's last name.
     * @param id        - An integer denoting the Person's ID number.
     * @param scores    - An array of integers denoting the Person's test scores.
     */
    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = id;
        this.testScores = scores;
    }

    /**
     * Method Name: calculate
     *
     * @return A character denoting the grade.
     */
    public char calculate() {
        for (int i = 0; i <= testScores.length-1; i++) {
            sum += testScores[i];
        }
        average = sum / testScores.length;
        if (average <= 100 && average >= 90) {
            gradeLetter = 'O';
        } else if (average < 90 && average >= 80) {
            gradeLetter = 'E';
        } else if (average < 80 && average >= 70) {
            gradeLetter = 'A';
        } else if (average < 70 && average >= 55) {
            gradeLetter = 'P';
        } else if (average < 55 && average >= 40) {
            gradeLetter = 'D';
        } else {
            gradeLetter = 'T';
        }
        return gradeLetter;
    }
}