package HackerRank_30_Days_of_Code;

public class Day9_RecursionGOODLUCK {
    //f(a)=5+a;a=20
    //f(f(f(a)))=(5+(5+(5+20)))=35
    public static int Summation(int n) {
        //Base case: WE ARE AT THE END
        if (n <= 0) {
            return 0;
        }
        //Recursive case: KEEP GOING
        else {
            return n + Summation(n - 1);
        }
    }

    //5!=5+4+3+2+1
    public static int Factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }

    //5^3=5*5*5
    public static int Exponentiation(int n, int p) {
        if (p <= 0) {
            return 1;
        } else {
            return n * Exponentiation(n, p - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(Summation(3));
        System.out.println(Factorial(5));
        System.out.println(Exponentiation(5,3));
    }
}
