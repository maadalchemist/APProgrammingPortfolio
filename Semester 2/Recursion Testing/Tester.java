import java.math.BigInteger;
import java.time.Duration;

public class Tester {
    public static void main(String[] args) {
        Math math = new Math();


        System.out.println("#####################################################################################################################################\n" +
                           "#                                                                                                                                   #\n" +
                           "#                                                   Fibbinacci Testing (Recursive)                                                  #\n" +
                           "#                                                                                                                                   #\n" +
                           "#####################################################################################################################################\n");
        long startTime = System.nanoTime();
        for(int i = 2; i < 256; i++) {
            long sTime = System.nanoTime();
            System.out.println(i + ": " + math.r_factorial(i));
            System.out.println("time elapsed (in millis): " + (System.nanoTime() - sTime));
            System.out.println("\n");
        }
        long endTime = System.nanoTime();
        long fib_rec = endTime - startTime;


        System.out.println("#####################################################################################################################################\n" +
                           "#                                                                                                                                   #\n" +
                           "#                                                   Fibbinacci Testing (Iterative)                                                  #\n" +
                           "#                                                                                                                                   #\n" +
                           "#####################################################################################################################################\n");
        startTime = System.nanoTime();
        for(int i = 2; i < 256; i++) {
            long sTime = System.nanoTime();
            System.out.println(i + ": " + math.r_factorial(i));
            System.out.println("time elapsed (in millis): " + (System.nanoTime() - sTime));
            System.out.println("\n");
        }
        endTime = System.nanoTime();
        long fib_ite = endTime - startTime;
    }
}
