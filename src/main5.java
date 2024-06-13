import java.util.Scanner;

public class main5{
    public static void main(String[] args){
        System.out.println("Enter number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min_val = Integer.MIN_VALUE;

        for(int i = 1; i<=n; i++){
            int curr_val = sc.nextInt();
            min_val = Math.max(min_val, curr_val);
        }
        System.out.println("max value is: " + min_val);

    }
}