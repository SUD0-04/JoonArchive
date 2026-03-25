import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int burger = 2001;
        int drink = 2001;
        
        for (int i = 0; i < 3; i++) {
            int val = sc.nextInt();
            
            if (val < burger) {
                burger = val;
            }
        }
        
        for (int i = 0; i < 2; i++) {
            int val = sc.nextInt();
            
            if (val < drink) {
                drink = val;
            }
        }
        
        System.out.print(burger + drink - 50);
        
        sc.close();
    }
}