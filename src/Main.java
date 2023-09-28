import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the first side of the triangle:");
        double side1 = input.nextDouble();

        System.out.println("Enter the length of the second side of the triangle:");
        double side2 = input.nextDouble();

        System.out.println("Enter the length of the third side of the triangle:");
        double side3 = input.nextDouble();

        if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is not isosceles.");
        }

        input.close();
    }
}




