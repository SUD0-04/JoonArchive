import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String justin = sc.next();
        String dr = sc.next();
        
        if (justin.length() >= dr.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
        
        sc.close();
    }
}