#include <iostream>
#include <iomanip>
using namespace std;

int main () {
    int c;
    cin >> c;
    
    for (int i = 0; i < c; i++) {
        int n;
        cin >> n;
        
        int total_c = 0;
        double grade_sum = 0;
        
        for (int j = 0; j < n; j++) {
            int c;
            double g;
            cin >> c >> g;
            
            total_c += c;
            grade_sum += (c * g);
        }
        
        double gpa = 0;
        if (total_c != 0) {
            gpa = grade_sum / total_c; 
        }
    
        cout << fixed << setprecision(1);
        cout << total_c << " " << gpa << endl;
    }
    
    return 0;
}