import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        while (true) {
            long M = sc.nextLong();
            long F = sc.nextLong();
            
            if (M == 0 && F == 0) {
                break;
            }
            System.out.println(M + F);
        }
        
        sc.close();
    }
}