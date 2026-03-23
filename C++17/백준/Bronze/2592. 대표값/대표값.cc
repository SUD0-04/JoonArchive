#include <iostream>
using namespace std;

int main() {
    int total = 0, avg;
    int arr[10];
    int count[1001] = {0};
    
    for (int i = 0; i < 10; i++) {
        int n;
        cin >> n;
        
        total += n;
        arr[i] = n;
        count[n]++;
    }
    
    avg = total / 10;
    
    int maxIdx = 0;
    int mode = 0;
    
    for (int i = 0; i <= 1000; i++) {
        if (count[i] > maxIdx) {
            maxIdx = count[i];
            mode = i;
        }
    }
    
    cout << avg << endl;
    cout << mode << endl;
    
    return 0;
}