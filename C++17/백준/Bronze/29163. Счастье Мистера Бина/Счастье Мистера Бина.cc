#include <iostream>
#include <vector>
using namespace std;

int main (void) {
    int N;
    cin >> N;
    
    int even_cnt = 0;
    int odd_cnt = 0;
    
    for (int i = 0; i < N; i++) {
        int num;
        cin >> num;
        
        if (num % 2 == 0) {
            even_cnt++;
        } else {
            odd_cnt++;
        }
    }
    
    if (even_cnt > odd_cnt) {
        cout << "Happy";
    } else {
        cout << "Sad";
    }
    
    return 0;
}