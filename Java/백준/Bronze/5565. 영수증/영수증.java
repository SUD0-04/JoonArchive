import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        long total = sc.nextLong();
        
        for (int i = 0; i < 9; i++) {
            long price = sc.nextLong();
            total -= price;
        }
        
        System.out.print(total);
        
        sc.close();
    }
}