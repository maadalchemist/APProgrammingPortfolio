import java.util.Scanner;

public class DayTester {
  public static void main(String[] args) {
      Day today = new Day();
      Day userBDay;
      Scanner cin = new Scanner(System.in);

      System.out.println("\nWelcome to this console application where we ask: \"How many days have you been alive?\"");
      System.out.println("What is your birthday? (yyyy mm dd)");
      userBDay = new Day(cin.nextInt(), cin.nextInt(), cin.nextInt());
      System.out.println("You have been alive for " + today.daysFrom(userBDay) + " days!\n");
  }
}
