import java.util.Scanner;

public class DayTester {
  public static void main(String[] args) {
      Day today = new Day();
      Day userBDay;

      Scanner cin = new Scanner(System.in);
      int bDayY, bDayM, bDayD;

      System.out.println("\nWelcome to this console application where we ask \"How many days have you been alive?\"");
      System.out.println("What is your birthday? (mm dd yyyy)");
      bDayM = cin.nextInt();
      bDayD = cin.nextInt();
      bDayY = cin.nextInt();

      userBDay = new Day(bDayY, bDayM, bDayD);

      System.out.println("You have been alive for " + today.daysFrom(userBDay) + " days!\n");

  }
}
