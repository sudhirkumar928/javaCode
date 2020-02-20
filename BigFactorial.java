//Use:- import java.math.BigInteger;     

class BigFactorial {
public static void extraLongFactorial(int n) {
        BigInteger fact= BigInteger.ONE;   
           for (int i = 2; i <= n; i++)
           {
  
                 fact = fact.multiply(new BigInteger(String.valueOf(i)));

            }
            System.out.println(fact);
    }
    public static void main(String[] args) {
         extraLongFactorial(25);
    }
}
