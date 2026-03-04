#include <iostream>
using namespace std;

int main (void) {
    int t1, t2, t3;
    cin >> t1 >> t2 >> t3;
    int max_total = (t1 * 3) + (t2 * 20) + (t3 * 120);
    
    int e1, e2, e3;
    cin >> e1 >> e2 >> e3;
    int mel_total = (e1 * 3) + (e2 * 20) + (e3 * 120);
    
    if (max_total > mel_total) {
        cout << "Max";
    } else if (max_total < mel_total) {
        cout << "Mel";
    } else {
        cout << "Draw";
    }
    
    return 0;
}