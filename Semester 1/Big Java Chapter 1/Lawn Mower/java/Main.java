import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int lawnW, lawnH;
      char[][] lawn;
      Scanner cin = new Scanner(System.in);

      // Welcome the user
      System.out.println("Welcome to the lawm mower app");
      
      // Ask user for lawn width
      System.out.println("Please input the width of the lawn you want to construct");
      lawnW = cin.nextDouble();
      
      // Ask user for lawn height
      System.out.println("Please input the height of the lawn");
      lawnH = cin.nextDouble();
      
      // Generate lawn array
      lawn = new char[lawnW][lawnH];
      
      // Construct LawnMower object
      // while lawn not mowed
        // do mower stuff
        // display lawn
        // display mower
    }
}
