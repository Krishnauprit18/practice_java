import java.util.Scanner;
public class main2{
    public static void main(String[] args){
        int num = 10;
        int num1 = 7;
        System.out.println(num);
        System.out.println(num1);


        char a = 'k';
        boolean istrue = false;
        System.out.println(a);
        System.out.println(istrue);

        byte f = 4;
        int h = 34;
        long i = 12;
        short k = 120;
        long q = 800_000_000_000L;

        System.out.println(f + " " + h + " " + i + " " + k + " " + q);

        String w = "Hello World";
        System.out.println(w);

        // return character at provided indices:-
        System.out.println(w.charAt(6));
        System.out.println(w.charAt(2));

        // printing long string:-
        String names = """
                Krishna uprit
                Avijit Nigam
                aaditya 
                """;
        System.out.println("names are: " + names);

        // this is single line comment
        /*
        this is
        multiline comment
         */

        // widening type casting:- storing smaller data type to larger data type.
         /*explicit type casting:- explicitly defining the data type.
         In the cases jab hume long data type ko small data type me store karana hao tab.
         to hum us small data type ko explicitly dete hai.
         data
          */

        int r = 90;
        long u = r; // this is allowed.

        long m = 89_000_000_000L;
        int s = (int) m; // this is a lossy conversion. We are getting anonymous negative values.

        System.out.println(m);
        System.out.println(s);

        // defining const variables:-
        final double PI = 3.14;
        System.out.println(PI);

        // but if we change PI value then we will get error.
        // Since it is set to final by "final" keyword.

        // taking input:-
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        System.out.println(x);
        System.out.println(x*x); // we can perform operations.

        /* taking different types of inputs:-
        System.out.println("Enter a number: ");
        byte y = sc.nextByte();
        System.out.println("Enter a number: ");
        long z = sc.nextLong();
        System.out.println("Enter a number: ");
        short g = sc.nextShort();
        */

        // taking string inputs:-
        System.out.println("Enter string: ");
        String str = sc.next();
        System.out.println(str);
        // here output me space ke baad ki strings accept nahi hui hai.

        // we will use nextLine():-
        System.out.println("Enter second string: ");
        String str1 = sc.nextLine();
        System.out.println(str1);

        // taking boolean values:-
        System.out.println("Enter boolean value: ");
        boolean bool = sc.nextBoolean();
        System.out.println(bool);

        /* there is no official single character input function in scanner.
        we will read string input then using charAt() method will access 0th index
        character.
         */

        System.out.println("Enter name: ");
        char name = sc.next().charAt(0);
        System.out.println("first letter of name is: " + name);


    }
}