/*
Unboxing:- conversion of Java wrapper classes into primitive type
by the compiler.
 */

public class main31{
    public static void main(String[] args){
        Integer x = 78;
        Double d = 45.7;
        Float f = 40.543F;
        Long l = 675L;

        // Unboxing:-
        int y = x;
        double z = d;
        float g = f;
        long k = l;

        System.out.println(y);
        System.out.println(z);
        System.out.println(g);
        System.out.println(k);




    }
}