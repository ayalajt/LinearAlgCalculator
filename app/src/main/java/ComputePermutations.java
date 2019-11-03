import android.os.Bundle;
import Java.util.Scanner;

/*
/  Author: Mark Groves
/  Init Date: 10/9/19
*/


public class ComputePermutations {

    public static void main(String[] args) {
        boolean repeat;

        // C or P choice from user
        // maybe replace with buttons
        Scanner in = new Scanner(System.in);
        String user_in = in.next();

        // comb
        if (user_in.equals("C")){
            // repeat?
        }

        // perm
        else if(user_in.equals("P")){
            // repeat?
        }

        else {
            // try again
        }
    }

    private static int factorial(int n) {
        if(n<=1){
            return 1;
        }
        return (n * factorial(n-1));
    }

    private static int nPr(int n, int r) {
        return (factorial(n) / factorial(n - r));
    }

}