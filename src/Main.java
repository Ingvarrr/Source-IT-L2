/**
 * Created by vig on 10/3/16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Cat vasya = new Cat();
        vasya.name = "Vasya";
        vasya.color = "Red";
        vasya.myau();

        Cat petya = new Cat();
        petya.name = "Vasya";
        petya.color = "Blue";
        petya.myau();
    }
}
