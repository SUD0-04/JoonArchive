import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String n = sc.next();
        String m = sc.next();
        
        String rN = new StringBuilder(n).reverse().toString();
        String rM = new StringBuilder(m).reverse().toString();
        
        int nN = Integer.parseInt(rN);
        int nM = Integer.parseInt(rM);
        
        if (nN > nM) {
            System.out.print(nN);
        } else {
            System.out.print(nM);
        }
        
        sc.close();
    }
}