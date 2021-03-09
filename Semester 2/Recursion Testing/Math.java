import java.math.BigInteger;

public class Math {
    // public static final BigInteger ZERO;
    // public static final BigInteger ONE;

    public Math() {}

    /* recursive factorial function */
    BigInteger r_factorial (BigInteger n) {
        if (n.equals(BigInteger.ONE)) { return BigInteger.ONE; }
        else { return n.multiply(r_factorial(n.subtract(BigInteger.ONE))); }
    }
    BigInteger r_factorial(int n) {
        Integer integer = Integer.valueOf(n);
        return r_factorial(BigInteger.valueOf(integer.intValue()));
    }

    /* interative factorial function */
    int i_factorial (int n) {
        int out = n;
        for (int i = n - 1; i > 0; i++) {
            out *= n;
            n --;
        }
        return out;
    }

    /* recursive fibbinacci function */
    //int r_fibbinacci(int n) {}

    /* iterative fibbinacci function */
    //int i_fibbinacci(int n) {}
}
