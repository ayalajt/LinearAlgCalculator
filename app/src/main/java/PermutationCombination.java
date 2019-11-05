import android.os.Bundle;
import android.widget.TextView;

/*
/  Author: Mark Groves
/  Init Date: 10/9/19
*/

public class PermutationCombination {

    public static void main(String[] args) {
        boolean repeat;

        // C or P choice from user
        // maybe replace with buttons
        String user_in = "";

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
