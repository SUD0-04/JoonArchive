#include <iostream>
using namespace std;

bool isPrime(int n) {
    if (n < 2) return false;
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return false;
    }
    return true;
}

int main () {
    int m, n;
    cin >> m >> n;

    int sum = 0;
    int min_p = -1;

    for (int i = m; i <= n; i++) {
        if (isPrime(i)) {
            sum += i;
            if (min_p == -1) min_p = i;
        }
    }

    if (min_p == -1) {
        cout << -1 << endl;
    } else {
        cout << sum << endl;
        cout << min_p << endl;
    }

    return 0;
}
