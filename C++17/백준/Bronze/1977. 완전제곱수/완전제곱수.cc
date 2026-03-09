#include <iostream>
#include <algorithm>

using namespace std;

int main (void) {
    int M, N;
    cin >> M >> N;

    int sum = 0;
    int min_val = -1;

    for (int i = 1; i <= 100; i++) {
        int square = i * i;

        if (square >= M && square <= N) {
            if (min_val == -1) {
                min_val = square;
            }
            sum += square;
        }
    }

    if (min_val == -1) {
        cout << -1 << "\n";
    } else {
        cout << sum << "\n" << min_val << "\n";
    }

    return 0;
}