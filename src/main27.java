public class main27{

    public static int add(int a, int b){
        return a+b;
    }

    public static String add(String a, String b){
        return a + " " + b;
    }

    public static String add(int a, String b){
        return a + " " + b;
    }

    public static void main(String[] args){
        System.out.println(add(34, 78));
        System.out.println(add("Krishna", "Uprit"));
        System.out.println(add(10, "Apples"));
    }
}