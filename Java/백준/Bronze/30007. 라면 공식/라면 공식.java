import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();

            System.out.println(A * (X - 1) + B);
        }
        
        sc.close();
    }
}