import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month number (from 1 to 12): ");
        int monthNumber = input.nextInt();

        if (monthNumber == 1) {
            System.out.println("JANUARY");
        } else if (monthNumber == 2) {
            System.out.println("FEBRUARY");
        } else if (monthNumber == 3) {
            System.out.println("MARCH");
        } else if (monthNumber == 4) {
            System.out.println("APRIL");
        } else if (monthNumber == 5) {
            System.out.println("MAY");
        } else if (monthNumber == 6) {
            System.out.println("JUNE");
        } else if (monthNumber == 7) {
            System.out.println("JULY");
        } else if (monthNumber == 8) {
            System.out.println("AUGUST");
        } else if (monthNumber == 9) {
            System.out.println("SEPTEMBER");
        } else if (monthNumber == 10) {
            System.out.println("OCTOBER");
        } else if (monthNumber == 11) {
            System.out.println("NOVEMBER");
        } else if (monthNumber == 12) {
            System.out.println("DECEMBER");
        } else {
            System.out.println("Not a valid month");
        }

        input.close();
    }
}





