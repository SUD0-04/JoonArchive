import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum_val = a + b;
        int sub_val = a - b;
        
        System.out.println(Math.max(sum_val, sub_val));
        System.out.println(Math.min(sum_val, sub_val));
        
        sc.close();
    }
}