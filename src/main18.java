public class main18{
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = "abc";

        String s3 = new String("abc");

        if(s1 == s2){
            System.out.println("Equal");
        }
        else{
            System.out.println("not equal");
        }

        if(s1 == s3){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }

        if(s1.equals(s3)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal!!");
        }
    }
}

/*
here s1 and s2 are in the same string pool in the heap memory whereas s3 is out of string pool
but in the heap memory. '==' checks the objects referred to.
 */

/*
But if we use .equals() method then it will compare the string elements(the object elements).
And hence in the second if-else condition output is 'Equal'.
 */

