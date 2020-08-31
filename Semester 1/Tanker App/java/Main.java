import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    double oz_per_day, lifespan_yrs, tankers_consumed;
    Scanner sin = new Scanner(System.in);

    System.out.println("Welcome to the taker app!");
    System.out.println("Please input the rate you will consume fluid in ounces per day");
    oz_per_day = sin.nextDouble();

    System.out.println("Please input your expected lifespan in years");
    lifespan_yrs = sin.nextDouble();

    tankers_consumed = (oz_per_day * 365 * lifespan_yrs)/128 / 11000;
    System.out.println("Based of of that, you will consume " + tankers_consumed + " 11,000 gallon tankers in your lifetime!");
  }
}
