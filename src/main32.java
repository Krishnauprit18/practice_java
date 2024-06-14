import com.sun.security.jgss.GSSUtil;

// Constructors:-
class Car{
    int price = 670000;
    String model = "Hatchback";
    boolean isLocked = false;

    /* conctructor has no return type.
    Car(){
        System.out.println("Inside the constructor");
    }
    */


    // parameterized constructor:-
    Car(String modelName, int Setprice){
        model = modelName;
        price = Setprice;
    }

    // non parameterized constructor:-
    Car(){
        model = "benz";
        price = 56000000;
    }
    void drive(){
        System.out.println("Car driving!!");
    }

    void Locked(){
        isLocked = true;
        System.out.println("car is locked");
    }

    void Unlocked(){
        isLocked = false;
        System.out.println("car is unlocked");
    }

    float getPrice(){
        return price;
    }

    void setPrice(int priceValue){
        if(priceValue < 0){
            priceValue = 0;
        }
        price = priceValue;
    }
}

public class main32{
    public static void main(String[] args){
        Car c1 = new Car("hyundai", 450000);
        Car c2 = new Car();

        System.out.println(c1.model);
        System.out.println(c2.price);
        System.out.println(c1.getPrice());
        System.out.println(c2.isLocked);
        System.out.println(c2.price);
        System.out.println(c2.model);
        c2.model = "sedan";
        System.out.println(c2.model);

        c1.getPrice();
        c2.drive();
    }
}