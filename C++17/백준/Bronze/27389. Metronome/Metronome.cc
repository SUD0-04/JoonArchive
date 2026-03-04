#include <iostream>
#include <iomanip>
using namespace std;

int main (void) {
    double num;
    cin >> num;
    
    double result = num / 4.0;
    
    cout << fixed << setprecision(2) << result;
    
    return 0;
} 