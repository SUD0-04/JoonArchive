import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int c = sc.nextInt();
        
        for (int i = 0; i < c; i++) {
            String pwd = sc.next();
            
            if (pwd.length() >= 6 && pwd.length() <= 9) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            
        }
        
        sc.close();
    }
}