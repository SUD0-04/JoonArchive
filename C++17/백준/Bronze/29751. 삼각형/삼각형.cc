#include <iostream>
#include <iomanip>
using namespace std;

int main (void) {
    double H, W;
    cin >> H >> W;
    
    cout << fixed << setprecision(1) << (H * W) / 2.0;
    
    return 0;
}