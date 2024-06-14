public class main25{

    public static void introduction(String name, int age, String[] hobbies){
        System.out.println("my name is: " + name);
        System.out.println("iam " + age + " years old");
        System.out.println("my hobbies are: ");
        for(String hobby: hobbies){
            System.out.println("- " + hobby);
        }
    }
    public static void main(String[] args){
        String name = "Krishna Uprit";
        int age = 20;
        String[] hobbies = {"Badminton", "Piano", "Coding"};

        // calling function:-
        introduction(name, age, hobbies);
    }
}