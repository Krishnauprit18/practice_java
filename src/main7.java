import java.util.Scanner;

public class main7{
    public static void main(String[] args){
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digits = 0;

        while(num > 0){
            num /= 10;
            digits++;
        }
        System.out.println("No. of digits in input value are: " + digits);
    }
}