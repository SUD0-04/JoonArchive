import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        
        BigInteger two = new BigInteger("2");
        
        BigInteger klaudia = a.subtract(b).divide(two).add(b);
        BigInteger natalia = a.subtract(b).divide(two);
        
        System.out.println(klaudia);
        System.out.println(natalia);
        
        sc.close();
    }
}