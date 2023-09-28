import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if a number is even or odd
        if (number % 2 == 0) {
            System.out.println("Even number"); // Even number
        } else {
            System.out.println("Odd number"); // Odd number
        }

        // Outputting "BYE" before ending the program
        System.out.println("BYE");

        input.close();
    }
}





