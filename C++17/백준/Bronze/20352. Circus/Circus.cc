#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;

int main () {
    long long s;
    cin >> s;
    
    double r = sqrt(s / M_PI);
    
    double result = 2 * M_PI * r;
    
    cout << fixed << setprecision(10) << result << endl;
    
    return 0;
}