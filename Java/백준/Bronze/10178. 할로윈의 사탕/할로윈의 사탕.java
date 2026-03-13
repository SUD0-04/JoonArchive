import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int tc = sc.nextInt();
        
        for (int i = 0; i < tc; i++) {
            long c = sc.nextLong();
            long v = sc.nextLong();
            
            long p1 = c / v;
            long p2 = c % v;
            
            System.out.println("You get " + p1 + " piece(s) and your dad gets " + p2 +" piece(s).");
        }
        sc.close();
    }
}