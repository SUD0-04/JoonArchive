import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int temp_x = x, temp_y = y;
            
            while (temp_y != 0) {
                int temp = temp_y;
                temp_y = temp_x % temp_y;
                temp_x = temp;
            }
            
            int lcm = x / temp_x * y;
            
            System.out.println(lcm);
        }
        
        sc.close();
    }
}