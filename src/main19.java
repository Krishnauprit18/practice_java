class main19{
    public static void main(String[] args){
        String str = "Hello world!!";
        System.out.println(str.indexOf('!'));
        System.out.println(str.indexOf('x')); // op. is -1 since it is not present in the string.

        // contains():-
        System.out.println(str.contains("wor")); // return true if the substring is present in the
                                                 // string.
        String s1 = "HELLO KRISHNA";
        System.out.println(s1.toLowerCase());

        String s2 = "hello world";
        System.out.println(s2.toUpperCase());

        // .replace():-
        String s3 = "I love programming!!";
        System.out.println(s3);
        System.out.println(s3.replace("programming", "Java"));

        // .substring():-
        String s4 = "Hello Krishna";
        System.out.println(s4.substring(7)); // beginning index.
        System.out.println(s4.substring(7, 10 )); // beginning and end index.

        // stirng concatenation:-
         String s5 = "Hello";
         String s6 = "world";
        System.out.println(s5 + " " + s6);

    }
}