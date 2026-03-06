import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        BigInteger divisor = new BigInteger("42");
        
        while (true) {
            BigInteger n = sc.nextBigInteger();
            
            if (n.equals(BigInteger.ZERO)) break;
            
            if (n.remainder(divisor).equals(BigInteger.ZERO)) {
                System.out.println("PREMIADO");
            } else {
                System.out.println("TENTE NOVAMENTE");
            }
        }
        sc.close();
    }
}