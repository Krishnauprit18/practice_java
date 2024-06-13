import java.sql.SQLOutput;
import java.util.Scanner;

public class main13{
    public static void main(String[] args){
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements of array are: ");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}