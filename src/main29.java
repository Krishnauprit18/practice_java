public class main29{

    static float avgno(float... varargs){    // we can rename the varargs.

        float total = 0;

        for(float num: varargs){
            total += num;
        }

        return total / varargs.length;
    }

    // varargs is an array of floating point numbers.

    public static void main(String[] args){
        float avg1 = avgno(23,56,53,2);
        System.out.println(avg1);
    }
}