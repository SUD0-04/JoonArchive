import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int count = 1;

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            for (int i = 0; i < n; i++) {
                sc.nextInt();
            }

            System.out.printf("Case %d: Sorting... done!\n", count);
            count++;
        }

        sc.close();
    }
}