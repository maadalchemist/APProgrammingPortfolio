/**
 * The CounterDemo program is a demo for the Counter class to
 * test each of its methods
 *
 * @author  Joseph Wardle
 * @version 1.0
 * @since   2020-09-30
 */

public class CounterDemo {
  public static void main(String[] args){
    Counter tally = new Counter();

    System.out.println("Count    : " + tally.getValue());
    System.out.println("Expected : " + "0\n");

    tally.click();
    System.out.println("Count    : " + tally.getValue());
    System.out.println("Expected : " + "1\n");

    tally.click(2);
    System.out.println("Count    : " + tally.getValue());
    System.out.println("Expected : " + "3\n");

    tally.undo();
    System.out.println("Count    : " + tally.getValue());
    System.out.println("Expected : " + "2\n");

    tally.undo(2);
    System.out.println("Count    : " + tally.getValue());
    System.out.println("Expected : " + "0\n");

    tally.reset();
    System.out.println("Count    : " + tally.getValue());
    System.out.println("Expected : " + "0\n");

    tally.reset(10);
    System.out.println("Count    : " + tally.getValue());
    System.out.println("Expected : " + "10\n");

    tally = new Counter(10);

    System.out.println("Count    : " + tally.getValue());
    System.out.println("Expected : " + "10\n");

    tally.click();
    System.out.println("Count    : " + tally.getValue());
    System.out.println("Expected : " + "11\n");

    tally.click(2);
    System.out.println("Count    : " + tally.getValue());
    System.out.println("Expected : " + "13\n");

    tally.undo();
    System.out.println("Count    : " + tally.getValue());
    System.out.println("Expected : " + "12\n");

    tally.undo(2);
    System.out.println("Count    : " + tally.getValue());
    System.out.println("Expected : " + "10\n");

    tally.reset();
    System.out.println("Count    : " + tally.getValue());
    System.out.println("Expected : " + "0\n");

    tally.reset(10);
    System.out.println("Count    : " + tally.getValue());
    System.out.println("Expected : " + "10\n");
  }
}
