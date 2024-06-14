// string vs charArray:-

public class main23{
    public static void main(String[] args){
        String str1 = "hello";
        char[] arr1 = {'h', 'e', 'l', 'l', 'o'};

        System.out.println("String is: ");
        System.out.println(str1);

        System.out.println("char arr is: ");
        System.out.println(arr1);

        // conversion from string to char arr:-
        char[] arr2= str1.toCharArray();
        System.out.println("String to char arr is: " + arr2);

        // char arr to string:-
        String str2 = new String(arr1);
        System.out.println("char arr to string is: " + str2);
    }
}