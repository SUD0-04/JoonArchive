import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int s = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int total_price = 250;
        int current_h = a;
        
        if (a > s) {
            System.out.print(total_price);
        } else {
            while (current_h < s) {
                current_h += b;
                total_price += 100;
            }
            System.out.print(total_price);
        }
        
        sc.close();
    }
}