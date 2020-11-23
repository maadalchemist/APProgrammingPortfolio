import java.util.Random;

public class ArrayMethodsTester {
  public static void main(String[] args) {
    Random random = new Random();
    ArrayMethods am = new ArrayMethods();

    int[] randArray = new int[100];
    for (int i = 0; i < randArray.length; i++) {
      randArray[i] = (random.nextInt()%100);
    }

    System.out.println("Print test: ");
    am.print(randArray);
    System.out.println('\n');

    System.out.print("Sum test: ");
    System.out.print(am.sum(randArray));
    System.out.println('\n');

    System.out.print("Average test: ");
    System.out.print(am.average(randArray));
    System.out.println('\n');

    System.out.print("Minimum test: ");
    System.out.print(am.min(randArray));
    System.out.println('\n');

    System.out.print("Maximum test: ");
    System.out.print(am.max(randArray));
    System.out.println('\n');

    System.out.println("Search test: ");
    if (am.contains(randArray, 69)) {
      System.out.print("List contains 69 at " + am.search(randArray, 69));
    } else {
      System.out.print("Does not contain 69");
    }
    System.out.println('\n');


  }
}
// Sum
// Average
// Minimum
// Maximum
// Print Element Separators
// Linear Search for any value between -99 and 99 (can be hard coded)
// Removing an element
// Inserting an element
// Swapping two elements
// Copying the entire array
