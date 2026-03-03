#include <iostream>
using namespace std;

int main(void) {
    int N;
    cin >> N;
    
    int ten = N / 10;
    int one = N % 10;
    
    if (ten == one) {
        cout << 1;
    } else {
        cout << 0;
    }
    
    return 0;
}