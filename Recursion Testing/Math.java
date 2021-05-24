import java.math.BigInteger;

public class Math {

    public Math() {}

    /* recursive factorial function */
    BigInteger r_factorial (BigInteger n) {
        if (n.equals(BigInteger.ONE)) { return BigInteger.ONE; }
        else { return n.multiply(r_factorial(n.subtract(BigInteger.ONE))); }
    }
    BigInteger r_factorial(int n) {
        // Integer integer = Integer.valueOf(n);
        return r_factorial(BigInteger.valueOf(Integer.valueOf(n).intValue()));
    }

    /* interative factorial function */
    BigInteger i_factorial (BigInteger n) {
        BigInteger out = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            out = out.multiply(i);
        }
        return out;
    }
    BigInteger i_factorial(int n) {
        Integer integer = Integer.valueOf(n);
        return i_factorial(BigInteger.valueOf(integer.intValue()));
    }

    /* recursive fibbinacci function */
    BigInteger r_fibbinacci (BigInteger n) {
        if (n.equals(BigInteger.ZERO)) { return BigInteger.ZERO; }
        else if (n.equals(BigInteger.ONE)) { return BigInteger.ONE; }
        return r_fibbinacci(n.subtract(BigInteger.ONE)).add(r_fibbinacci(n.subtract(BigInteger.ONE.add(BigInteger.ONE))));
    }
    BigInteger r_fibbinacci(int n) {
        // Integer integer = Integer.valueOf(n);
        return r_fibbinacci(BigInteger.valueOf(Integer.valueOf(n).intValue()));
    }

    /* iterative fibbinacci function */
    BigInteger i_fibbinacci (BigInteger n) {
        if (n.equals(BigInteger.ONE)) { return BigInteger.ONE; }
        else if (n.equals(BigInteger.ONE.add(BigInteger.ONE))) { return BigInteger.ONE; }
        BigInteger prevPrev = BigInteger.ZERO;
        BigInteger prev = BigInteger.ONE;
        BigInteger current = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
            current = prevPrev.add(prev);
            prevPrev = prev;
            prev = current;
        }
        return current;
    }
    BigInteger i_fibbinacci(int n) {
        Integer integer = Integer.valueOf(n);
        return i_fibbinacci(BigInteger.valueOf(integer.intValue()));
    }
}

/*
Hardware: AMD Ryzen 5 3600, 16 GB RAM

Factorial functions with 8192 interations:
Factorial recursive execution time (in nanos): 70797434600
Factorial iterative execution time (in nanos): 69161929800

Fibbinacci functions with 50 interations:
Fibbinacci recursive execution time (in nanos): 10959284100
Fibbinacci recursive execution time (in nanos): 4285600
*/
