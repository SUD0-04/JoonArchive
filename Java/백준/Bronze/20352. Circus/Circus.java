import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long s = sc.nextLong();

        double r = Math.sqrt((double) s / Math.PI);
        double result = 2 * r * Math.PI;

        System.out.printf("%.9f\n", result);

        sc.close();
    }
}