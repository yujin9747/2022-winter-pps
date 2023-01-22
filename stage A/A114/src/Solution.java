import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int numPrimeArrangements(int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        int flag=0;
        for(int i=2; i<=n; i++){
            flag=0; // 소수 0, 소수 아닌경우 1
            for(int j=0; j<primeNumbers.size(); j++){
                if((i%primeNumbers.get(j)) == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) primeNumbers.add(i);
        }

        int numberOfPrime = primeNumbers.size();

        BigInteger primeFactorial = factorial(numberOfPrime);
        BigInteger notPrimeFactorial = factorial(n-numberOfPrime);
        return primeFactorial.multiply(notPrimeFactorial).mod(BigInteger.valueOf(1000000007)).intValue();
    }

    public BigInteger factorial(int n){
        BigInteger fac = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fac = fac.multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(1000000007));
        }
        return fac;
    }
}
