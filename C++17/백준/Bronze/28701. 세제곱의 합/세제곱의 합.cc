#include <iostream>
using namespace std;

int main() {
    long long n;
    cin >> n;

    long long sum = n * (n + 1) / 2;
    long long sumSquared = sum * sum;

    cout << sum << "\n";
    cout << sumSquared << "\n";
    cout << sumSquared << "\n";

    return 0;
}