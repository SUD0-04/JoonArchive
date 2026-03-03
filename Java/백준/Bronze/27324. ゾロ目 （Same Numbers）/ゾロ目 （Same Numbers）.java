import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();
        
        if (n.charAt(0) == n.charAt(1)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        sc.close();
    }
}