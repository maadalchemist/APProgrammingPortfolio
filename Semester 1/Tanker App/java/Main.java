import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    double oz_per_day = 0, lifespan_yrs = 0, tankers_consumed;
    Scanner sin = new Scanner(System.in);
    boolean correct_input = false;

    System.out.println("Welcome to the taker app!");
    while (correct_input == false){
      System.out.println("Please input the rate you will consume fluid in ounces per day");
      oz_per_day = sin.nextDouble();
      if (oz_per_day < 0){
        System.out.println("Please input a number greater than 0!");
      }else if (oz_per_day > 1000){
        System.out.println("That number is way too large!");
      }else {
        correct_input = true;
      }
    }
    correct_input = false;

    while (correct_input == false){
      System.out.println("Please input your expected lifespan in years");
      lifespan_yrs = sin.nextDouble();
      if (lifespan_yrs < 0){
        System.out.println("Please input a number greater than 0!");
      }else if (lifespan_yrs > 1000){
        System.out.println("That number is way too large!");
      }else {
        correct_input = true;
      }
    }
    correct_input = false;


    tankers_consumed = (oz_per_day * 365 * lifespan_yrs)/128 / 11000;
    System.out.println("Based of of that, you will consume " + tankers_consumed + " 11,000 gallon tankers in your lifetime!");
  }
}
