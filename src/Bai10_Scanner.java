import java.util.Scanner;

public class Bai10_Scanner {
    public static void main(String[] args) {

        // Input String
        System.out.print("Enter your name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Hello " + name);

        // Input Integer
        System.out.print("Enter your age: ");
        int age = new Scanner(System.in).nextInt();
        System.out.println("Your age is: " + age);

        // Input Float
        System.out.print("Enter your weight: ");
        float weight = new Scanner(System.in).nextFloat();
        System.out.println("Your weight is: " + weight);
    }
}
