public class main11{
    public static void main(String[] args){
        while(true){
            int num = (int) (Math.random() * 10 + 1);
            if(num == 5){
                break;
            }
            System.out.println(num);
        }
    }
}