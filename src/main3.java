import java.util.Scanner;
public class main3{
    public static void main(String[] args){

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String ans = num % 2 == 0 ? "Even" : "Odd";
        System.out.println("Number is : " + ans);
    }
}