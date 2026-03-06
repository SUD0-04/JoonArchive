import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String cls = sc.next();
            
            if (cls.equals("Algorithm")) {
                System.out.println(204);
            } else if (cls.equals("DataAnalysis")) {
                System.out.println(207);
            } else if (cls.equals("ArtificialIntelligence")) {
                System.out.println(302);
            } else if (cls.equals("CyberSecurity")) {
                System.out.println("B101");
            } else if (cls.equals("Network")) {
                System.out.println(303);
            } else if (cls.equals("Startup")) {
                System.out.println(501);
            } else {
                System.out.println(105);
            }
        }
        
        sc.close();
    }
}