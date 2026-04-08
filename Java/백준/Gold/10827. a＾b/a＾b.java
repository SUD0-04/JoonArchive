import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String aStr = sc.next();
        int b = sc.nextInt();

        BigDecimal a = new BigDecimal(aStr);

        BigDecimal result = a.pow(b);

        System.out.println(result.toPlainString());

        sc.close();
    }
}