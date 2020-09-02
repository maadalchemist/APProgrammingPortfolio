public class Main {
  public static void main(String[] args) {
    double pi = 1;
    double num1 = 1;
    boolean subtract = true;
    System.out.println("Loading...");
    for (int i = 3; i < 2147483647; i += 2) {
      num1 = i;
      num1 = 1/num1;
      if (subtract) {
        pi += -num1;
      }else {
        pi += num1;
      }
      subtract = !subtract;
    }
    pi = pi*4;
    System.out.println(pi);
  }
}
