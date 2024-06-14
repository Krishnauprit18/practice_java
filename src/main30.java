/*autoboxing:- the automatic conversion of the primitive types to java wrapper class by the
compiler.
*/

public class main30{
    public static void main(String[] args){

        int x = 9;
        float f = 5.89F;
        long l = 6000;

        // Autoboxing:-
        Integer IntObj = x;
        Float FloatObj = f;
        Long LongObj = l;

        System.out.println(IntObj);
        System.out.println(FloatObj);
        System.out.println(LongObj);

        /*
        so these are the class objects, and we can perform
        various operations.
         */

        // max and min values Integer in java can hold:-
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}