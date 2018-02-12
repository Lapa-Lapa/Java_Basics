package HackerRank_30_Days_of_Code;

import java.util.Scanner;

public class Day6_Lets_Review {
    /**
     * Task
     * Given a string S of length N that is indexed from 0 to N-1
     * print its even-indexed and odd-indexed characters as 2 space-separated
     * strings on a single line
     * Note: 0 is considered to be an even index.
     * Sample Input:
     * 2
     * Hacker
     * Rank
     * Sample Output:
     * Hce akr
     * Rn ak
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int j = 0; j < N; j++) {
            String S = in.next();
            String[] arr = S.split("");
            String S0 = "";
            String S1 = "";
            for (int i = 0; i < S.length(); i++) {
                if (i % N == 0) {   //Чет-нечет
                    S0 = S0 + arr[i];
                } else {
                    S1 = S1 + arr[i];
                }
            }
            System.out.println(S0 + " " + S1);
        }
        in.close();
    }
}