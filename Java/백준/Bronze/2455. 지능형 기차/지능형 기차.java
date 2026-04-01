import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int total = 0;
        int max = 0;
        
        for (int i = 0; i < 4; i++) {
            int op = sc.nextInt();
            int ip = sc.nextInt();
            
            total -= op;
            total += ip;
            
            if (total > max) {
                max = total;
            }
        }
        
        System.out.print(max);
        
        sc.close();
    }
}