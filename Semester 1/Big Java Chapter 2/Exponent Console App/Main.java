import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        BigInteger a;

        System.out.println("Welcome to the exponent console app!");
        System.out.println("Please input a number:");
        a = new BigInteger(cin.next());
        System.out.println("Your number:                      " + pow(a,1));
        // System.out.println("Your number squared:           " + pow(a,2));
        // System.out.println("Your number to the power of 4: " + pow(a,4));
        // System.out.println("Your number to the power of 8: " + pow(a,8));

    }
}
