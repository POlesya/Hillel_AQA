import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month number (from 1 to 12): ");
        int monthNumber = input.nextInt();

        String monthName = switch (monthNumber) {
            case 1 -> "JANUARY";
            case 2 -> "FEBRUARY";
            case 3 -> "MARCH";
            case 4 -> "APRIL";
            case 5 -> "MAY";
            case 6 -> "JUNE";
            case 7 -> "JULY";
            case 8 -> "AUGUST";
            case 9 -> "SEPTEMBER";
            case 10 -> "OCTOBER";
            case 11 -> "NOVEMBER";
            case 12 -> "DECEMBER";
            default -> "Not a valid month";
        };

        System.out.println(monthName);

        input.close();
    }
}





