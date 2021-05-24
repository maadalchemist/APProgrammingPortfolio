import java.math.BigInteger;
import java.time.Duration;

public class Tester {
    public static void main(String[] args) {
        Math math = new Math();


        System.out.println("#####################################################################################################################################\n" +
                           "#                                                                                                                                   #\n" +
                           "#                                                    Factorial Testing (Recursive)                                                  #\n" +
                           "#                                                                                                                                   #\n" +
                           "#####################################################################################################################################\n");
        long startTime = System.nanoTime();
        for(int i = 1; i < 8192; i++) {
            long sTime = System.nanoTime();
            System.out.println(i + ": " + math.r_factorial(i));
            System.out.println("Time elapsed (in nanos): " + (System.nanoTime() - sTime));
            System.out.println();
        }
        long endTime = System.nanoTime();
        long fac_rec = endTime - startTime;


        System.out.println("#####################################################################################################################################\n" +
                           "#                                                                                                                                   #\n" +
                           "#                                                    Factorial Testing (Iterative)                                                  #\n" +
                           "#                                                                                                                                   #\n" +
                           "#####################################################################################################################################\n");
        startTime = System.nanoTime();
        for(int i = 0; i < 8192; i++) {
            long sTime = System.nanoTime();
            System.out.println(i + ": " + math.i_factorial(i));
            System.out.println("Time elapsed (in nanos): " + (System.nanoTime() - sTime));
            System.out.println();
        }
        endTime = System.nanoTime();
        long fac_ite = endTime - startTime;


        System.out.println("#####################################################################################################################################\n" +
                           "#                                                                                                                                   #\n" +
                           "#                                                   Fibbinacci Testing (Recursive)                                                  #\n" +
                           "#                                                                                                                                   #\n" +
                           "#####################################################################################################################################\n");
        startTime = System.nanoTime();
        for(int i = 1; i < 40; i++) {
            long sTime = System.nanoTime();
            System.out.println(i + ": " + math.r_fibbinacci(i));
            System.out.println("Time elapsed (in nanos): " + (System.nanoTime() - sTime));
            System.out.println();
        }
        endTime = System.nanoTime();
        long fib_rec = endTime - startTime;


        System.out.println("#####################################################################################################################################\n" +
                           "#                                                                                                                                   #\n" +
                           "#                                                   Fibbinacci Testing (Iterative)                                                  #\n" +
                           "#                                                                                                                                   #\n" +
                           "#####################################################################################################################################\n");
        startTime = System.nanoTime();
        for(int i = 1; i < 40; i++) {
            long sTime = System.nanoTime();
            System.out.println(i + ": " + math.i_fibbinacci(i));
            System.out.println("Time elapsed (in nanos): " + (System.nanoTime() - sTime));
            System.out.println();
        }
        endTime = System.nanoTime();
        long fib_ite = endTime - startTime;


        System.out.println("#####################################################################################################################################\n" +
                           "#                                                                                                                                   #\n" +
                           "#                                                                RESULTS                                                            #\n" +
                           "#                                                                                                                                   #\n" +
                           "#####################################################################################################################################\n\n");
        System.out.println("Factorial functions with 2048 interations:");
        System.out.println("Factorial recursive execution time (in nanos): " + fac_rec);
        System.out.println("Factorial iterative execution time (in nanos): " + fac_ite);
        System.out.println();
        System.out.println("Fibbinacci functions with 50 interations:");
        System.out.println("Fibbinacci recursive execution time (in nanos): " + fib_rec);
        System.out.println("Fibbinacci iterative execution time (in nanos): " + fib_ite);
    }
}
