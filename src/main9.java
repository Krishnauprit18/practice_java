import java.util.Scanner;

public class main9{
        public static void main(String[] args){
            System.out.println("Enter number: ");
            Scanner sc = new Scanner(System.in);
            int num;
            int sum = 0;

            do{
                num = sc.nextInt();
                sum += num;
            }while(num > 0);

            System.out.println("sum is: " + sum);
        }
}