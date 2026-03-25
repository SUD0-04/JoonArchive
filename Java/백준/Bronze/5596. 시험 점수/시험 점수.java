import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        int s1 = 0;
        int s2 = 0;
        
        for (int i = 0; i < 4; i++) {
            int score1 = sc.nextInt();
            s1 += score1;
        }
        
        for (int i = 0; i < 4; i++) {
            int score2 = sc.nextInt();
            s2 += score2;
        }
        
        if (s1 > s2) {
            System.out.print(s1);
        } else {
            System.out.print(s2);
        }
        
        sc.close();
    }
}