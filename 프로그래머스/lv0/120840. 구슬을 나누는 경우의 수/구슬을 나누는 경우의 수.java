import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        return combinations(balls, share);
    }
    
    public static BigInteger factorial(int n) {
        if (n <= 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }
    
    public static BigInteger combinations(int n, int m) {
        BigInteger numerator = factorial(n);
        BigInteger denominator = factorial(m).multiply(factorial(n - m));
        
        return numerator.divide(denominator);
    }
}