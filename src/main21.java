// String builder:- It is a mutable class in java which is used to modify string.

public class main21{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println("this is a stirng builder: " + sb);

        sb.append(" iam alive.");
        System.out.println(sb);

        sb.insert(5, " this is awesome");
        System.out.println(sb);

        sb.delete(27, 37);
        System.out.println(sb);

        sb.replace(14, 21, "amazing");
        System.out.println(sb);

        // conversion from string builder to string:-
        String str = sb.toString();
        System.out.println("this is a string: " + str);
    }
}