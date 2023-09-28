import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        double absoluteValue1 = Math.abs(number1);
        double absoluteValue2 = Math.abs(number2);

        if (absoluteValue1 > absoluteValue2) {
            System.out.println(number1 + " has more absolute value.");
        } else if (absoluteValue2 > absoluteValue1) {
            System.out.println(number2 + " has more absolute value.");
        } else {
            System.out.println("Both numbers have the same absolute value.");
        }

        input.close();
    }
}




