import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int real_cheese = Math.min(B, A - 1);
        
        System.out.print(real_cheese + (real_cheese + 1));
        
        sc.close();
    }
}