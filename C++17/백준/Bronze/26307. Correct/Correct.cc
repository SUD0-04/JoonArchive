#include <iostream>
#include <cmath>
using namespace std;

int main (void) {
    int H, M;
    cin >> H >> M;
    
    int result_H = abs(H - 9) * 60;
    
    cout << result_H + M << endl;
    
    return 0;
}