#include <iostream>
using namespace std;

int main () {
    int n;
    cin >> n;
    
    int total = 0;
    int streak = 0;
    
    for (int i = 0; i < n; i++) {
        int score;
        cin >> score;
        
        if (score == 1) {
            streak++;
            total += streak;
        } else {
            streak = 0;
        }
    }
    
    cout << total;
    
    return 0;
}