package HackerRank_30_Days_of_Code.Day19_Interfaces.Day19_Task;

import HackerRank_30_Days_of_Code.Day19_Interfaces.Day19_Tutorial.Enemy;

class Calculator implements AdvancedArithmetic {
    /**
     * Task
     * The AdvancedArithmetic interface and the method declaration
     * for the abstract int divisorSum(int n) method are provided for you in the editor below.
     * Write the Calculator class, which implements the AdvancedArithmetic interface.
     * The implementation for the divisorSum method must be public and take an integer parameter
     * and return the sum of all its divisors.
     * Note: Because we are writing multiple classes in the same file, do not use an access modifier
     * (e.g.: public) in your class declaration (or your code will not compile);
     * however, you must use the public access modifier before your method declaration
     * for it to be accessible by the other classes in the file.
     */
    @Override
    public int divisorSum(int n) {
        int summ = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                summ += i;
            }
        }
        return summ;
    }
}