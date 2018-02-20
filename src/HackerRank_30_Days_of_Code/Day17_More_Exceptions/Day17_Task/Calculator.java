package HackerRank_30_Days_of_Code.Day17_More_Exceptions.Day17_Task;

class Calculator {
    /**
     * Task
     * Write a Calculator class with a single method: int power(int,int).
     * The power method takes two integers n and p as parameters
     * and returns the integer result of n^p.
     * If either n or p is negative, then the method must throw an exception with the message:
     * "n and p should be non-negative".
     * Note: Do not use an access modifier (e.g.: public) in the declaration for your Calculator class.
     */
    public int power(int n, int p) {
//    public int power(int n, int p) throws Exception {
//        if (n < 0) {
//            throw new Exception("n and p should be non-negative");
//        } else if (p < 0) {
//            throw new Exception("n and p should be non-negative");
//        }
//        int ans = (int)Math. pow(n, p);
//        return ans;
//    }
        if (n < 0 || p < 0) {
            throw new IllegalArgumentException("n and p should be non-negative");
        }
        return (int) Math.pow(n, p);
    }
}