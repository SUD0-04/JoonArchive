import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        int result_H = Math.abs(H - 9) * 60;
        
        System.out.println(result_H + M);
        
        sc.close();
    }
}