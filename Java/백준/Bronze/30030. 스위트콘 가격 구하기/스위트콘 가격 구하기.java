import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        long B = sc.nextLong();
        
        long A = (B / 11) * 10;
        
        System.out.print(A);
        
        sc.close();
    }
}