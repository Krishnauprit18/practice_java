// palindromic string:-

import java.util.Scanner;
public class main22{
    public static void main(String[] args){
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // reversing the entered string:-
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String reversedString = sb.toString(); // converted string builder to string.

        // comparing reversed string to original string:-
        if(str.equals(reversedString)){
            System.out.println("Yes string is a palindromic String!!");
        }
        else{
            System.out.println("No, not a palindromic String!!");
        }
    }
}