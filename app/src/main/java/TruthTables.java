/*
Author: Quincey Cuthbert
InitDate: 10/13/19
 */
class TruthTables {

    /*
    Basic framework for the truth tables generator set up with
    three variables and stand-in logic statements
     */
    public static void main( String[] args ) {

        System.out.println( "  p  q  r  | p∧q p∨q ¬r" );
        System.out.println( "-----------+-----------" );
        for (int p = 0; p <= 1; p++ ) {
            for (int q = 0; q <= 1; q++ ) {

                for (int r=0; r<=1; r++ ) {
                    boolean pp = (p == 1)? true: false;
                    boolean qq = (q == 1)? true: false;
                    boolean rr = (r == 1)? true: false;
                    System.out.println(String.format( "%3s%3s%3s  |%3s%3s%3s",
                            trueOrFalse(pp), trueOrFalse(qq), trueOrFalse(rr),
                            trueOrFalse(expressionOne(pp, qq, rr)),
                            trueOrFalse(expressionTwo(pp, qq, rr)),
                            trueOrFalse(expressionThree(pp, qq, rr))));

                }
            }
        }
    }

    static boolean expressionOne( boolean p, boolean q, boolean r ) {
        return (p & q);
    }

    static boolean expressionTwo( boolean p, boolean q, boolean r ) {
        return (p | q);
    }

    static boolean expressionThree( boolean p, boolean q, boolean r ) {
        return !r;
    }

    static String trueOrFalse( boolean p ) {
        return ((p == true)?  "T":  "F" );
    }

}