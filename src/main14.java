import java.util.Scanner;

public class main14{
    public static void main(String[] args){
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements in array: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key");
        int key = sc.nextInt();

        int ans = -1;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == key) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}