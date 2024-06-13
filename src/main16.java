import java.util.Scanner;
public class main16{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println("Enter key: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        boolean isfound = false;

        for(int num: arr){
            if(num == key){
                isfound  = true;
                break;
            }
        }

        if(isfound){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found!!");
        }

    }
}