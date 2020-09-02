public class Main {
  public static void main(String[] args) {
    double pi = 1;
    for (int i = 3; i < 10000000; i += 2) {
      pi -= 1/i;
    }
    pi *= 4;
    System.out.println(pi);
  }
}
