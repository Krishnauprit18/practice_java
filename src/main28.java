// function call stack:-

public class main28{
    public static void main(String[] args){
        int x = 0;
        System.out.println("inside main: " + x);
        second();
    }

    public static void second(){
        int x = 10;
        System.out.println("inside second: " + x);
        third();
    }

    public static void third(){
        int x = 20;
        System.out.println("inside third: " + x);
    }
}