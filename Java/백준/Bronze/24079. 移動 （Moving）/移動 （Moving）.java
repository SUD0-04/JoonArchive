import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        int total_time = x + y;
        
        if (total_time <= z) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
        
        sc.close();
    }
}