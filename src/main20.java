// reversing a string:-

public class main20{
    public static void main(String[] args){
        String s = "Hello Good Morning Krishna Uprit!!";
        String reverse = "";

        for(int i = s.length()-1; i>=0; i--){
            reverse += s.charAt(i);
        }
        System.out.println(reverse);
    }
}