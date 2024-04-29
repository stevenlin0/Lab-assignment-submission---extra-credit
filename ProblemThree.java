import java.math.BigInteger;

public class ProblemThree {
    public static void main(String[] args) {
        // Prints the result of the run method
        System.out.println(new ProblemThree().run());
    }
    public String run() {
        // Sets the modulus to 10^10
        BigInteger modulus = BigInteger.TEN.pow(10);
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= 1000; i++)
        sum = sum.add(BigInteger.valueOf(i).modPow(BigInteger.valueOf(i), modulus));
        // Returns the sum modulo the modulus as a string
        return sum.mod(modulus).toString();
    }
}
