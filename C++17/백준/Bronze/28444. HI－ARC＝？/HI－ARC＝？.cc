#include <iostream>
using namespace std;

int main(void) {
    int H, I, A, R, C;
    cin >> H >> I >> A >> R >> C;
    
    int result = (H * I) - (A * R * C);
    cout << result << endl;
    
    return 0;
}