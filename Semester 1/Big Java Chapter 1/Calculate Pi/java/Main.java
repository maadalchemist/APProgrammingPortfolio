public class Main {
  public static void main(String[] args) {
    double pi = 1;
    int subtract = -1;
    for (double i = 3; i < 2147483647; i += 2) {
      pi += (1 / i) * (subtract);
      subtract = -subtract;
    }
    pi = pi*4;
    System.out.println(pi);
  }
}
