import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        long H = sc.nextLong();
        long I = sc.nextLong();
        long A = sc.nextLong();
        long R = sc.nextLong();
        long C = sc.nextLong();
        
        long result = (H * I) - (A * R * C);
        
        System.out.println(result);
        
        sc.close();
    }
}