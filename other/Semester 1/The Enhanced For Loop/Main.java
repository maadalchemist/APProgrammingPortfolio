import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();

    int[] randArray = new int[100];
    for (int i = 0; i < randArray.length; i++) {
      randArray[i] = (random.nextInt()%100);
    }

    System.out.print("Here is the entire array:  ");
    for (int member : randArray) {
      System.out.print(member);
      System.out.print(' ');
    }
    System.out.println();

    int maxValue = -99;
    System.out.print("The maximum:  ");
    for (int member : randArray) {
      if (member > maxValue) { maxValue = member; }
    }
    System.out.println(maxValue);

    int countNegative = 0;
    System.out.print("Number of negative values:  ");
    for (int member : randArray) {
      if (member < 0) { countNegative ++; }
    }
    System.out.println(countNegative);
  }
}
