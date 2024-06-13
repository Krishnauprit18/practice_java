public class main10{
    public static void main(String[] args){
        for(int i = 1; i<=10; i++){
            if(i == 6){
                System.out.println("Breaking out of the loop");
                break;
            }
            System.out.println(i);
        }
    }
}