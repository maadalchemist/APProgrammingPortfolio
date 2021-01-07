import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // If month is 1, 2, or 3, season = "Winter"
        // Else if month is 4, 5, or 6, season = "Spring"
        // Else if month is 7, 8, or 9, season = "Summer"
        // Else if month is 10, 11, or 12, season = "Fall"
        // If month is divisible by 3 and day >= 21
        //   If season is "Winter", season = "Spring"
        //   Else if season is "Spring", season = "Summer"
        //   Else if season is "Summer", season = "Fall"
        //   Else season = "Winter"
        int month = 0;
        int day = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Month: ");
        while (month == 0) {
            if (in.hasNextInt()) {
                if (in.nextInt() > 0 && in.nextInt() <= 12) {
                    month = in.nextInt();
                    break;
                }
            }
            System.out.println("\nPlease input a valid month");
        }
        while (day == 0) {
            if (in.hasNextInt()) {
                if (in.nextInt() > 0 && in.nextInt() <= 31) {
                    day = in.nextInt();
                    break;
                }
            }
            System.out.println("\nPlease input a valid day");
        }
    }
}
