import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            
            String top_plr = "";
            long max_price = -1;
            
            for (int j = 0; j < p; j++) {
                long price = sc.nextLong();
                String name = sc.next();
                
                if (price > max_price) {
                    max_price = price;
                    top_plr = name;
                }
            }
            System.out.println(top_plr);
        }
        
        sc.close();
    }
}