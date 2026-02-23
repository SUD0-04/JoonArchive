import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        long N = sc.nextLong();
        long M = sc.nextLong();
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        
        System.out.println(A * B);
        
        sc.close();
    }
}