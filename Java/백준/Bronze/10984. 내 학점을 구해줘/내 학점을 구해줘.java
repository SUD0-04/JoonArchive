import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int cn = sc.nextInt();
        
        for (int i = 0; i < cn; i++) {
            int n = sc.nextInt();
            
            int total_c = 0;
            double grade_sum = 0;
            
            for (int j = 0; j < n; j++) {
                int c = sc.nextInt();
                double g = sc.nextDouble();
                
                total_c += c;
                grade_sum += (c * g);
            }
            
            double gpa = 0;
            if (total_c != 0) {
                gpa = grade_sum / total_c;
            }
            
            System.out.printf("%d %.1f\n", total_c, gpa);
        }
        
        sc.close();
    }
}