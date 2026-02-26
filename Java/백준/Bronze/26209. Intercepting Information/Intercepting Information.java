import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean isFailed = false;

        for (int i = 0; i < 8; i++) {
            int n = sc.nextInt();
            if (n == 9) {
                isFailed = true;
                break;
            }
        }

        if (isFailed) {
            System.out.println("F");
        } else {
            System.out.println("S");
        }
        
        sc.close();
    }
}